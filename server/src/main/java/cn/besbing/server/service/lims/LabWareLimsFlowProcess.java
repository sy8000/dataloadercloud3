package cn.besbing.server.service.lims;/*
*   Xiamen HLYY Network Technology Co., Ltd.
*       DataLoader Cloud
*   @Author sheny
*   @Date 2020/11/8  13:44 
    @Version 1.0
    @Site https://besbing.cn
    @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
*/

import cn.besbing.client.enums.BaseResponse;
import cn.besbing.client.enums.StatusCode;
import cn.besbing.model.entities.primary.*;
import cn.besbing.server.service.general.GeneratedPrimaryKeysImpl;
import cn.besbing.server.service.general.MailServiceImpl;
import cn.besbing.server.service.primary.PrimaryCustomServiceImpl;
import cn.besbing.server.service.primary.PrimarySampleServiceImpl;
import cn.besbing.server.service.primary.PrimarySmuserServiceImpl;
import cn.besbing.server.service.primary.PrimaryStorageLocationServiceImpl;
import cn.besbing.server.utils.AbstractLog;
import cn.besbing.server.utils.MailDTO;
import com.alibaba.fastjson.JSONObject;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class LabWareLimsFlowProcess extends AbstractLog {


    @Autowired
    private PrimarySampleServiceImpl sampleService;

    @Autowired
    private LabWareLimsFlowJump labWareLimsFlowJump;

    @Autowired
    private LimsAuditWriterService limsAuditWriterService;

    @Autowired
    private GeneratedPrimaryKeysImpl generatedPrimaryKeys;


    @Autowired
    private PrimarySmuserServiceImpl smuserService;

    @Autowired
    private LabWareLimsSampleReceiveAudit labWareLimsSampleReceiveAudit;

    @Autowired
    private LimsAuditWriterService newlimsAuditWriterService;

    @Autowired
    private PrimaryCustomServiceImpl customService;

    @Autowired
    private MailServiceImpl mailService;

    @Autowired
    private PrimaryStorageLocationServiceImpl storageLocationService;


    Date date = new Date();
    Timestamp timestamp = new Timestamp(date.getTime());

    /**
     * 样品接收服务
     * @param project
     * @param locationNumber
     * @return
     */

    @Transactional
    public BaseResponse sampleReceive(String project, String locationNumber){
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        /**
         * labware逻辑:
         * samplenumber = selectedsamples[i]
         * 	status = ReceiveSample(samplenumber)
         * 	移动sample到指定库位
         * 	对库位进行相关操作
         * 	sample表storage_loc_no和status为I
         * 	分别写入流程表和样品审计表
         */
        List<Sample> sampleList = sampleService.getSamplesByProject(project);
        if (sampleList.size() > 0){
            try {
                for (Sample s : sampleList){
                    s.setStatus("I");
                    s.setStorageLocNo(Long.valueOf(locationNumber));
                    sampleService.updateByPrimary(s);
                }
                Integer sampleTotals = Integer.valueOf(customService.selectOne("select sum(cpls.sample_quantity) sample_total from c_proj_login_sample cpls where cpls.project = '" + project + "' "));
                StorageLocation storageLocation = storageLocationService.getStorageLocationByLocationNumber(Long.valueOf(locationNumber));
                storageLocation.setReservedOn(timestamp);
                storageLocation.setReservedFor(SecurityUtils.getSubject().getPrincipal().toString());
                storageLocation.setReservedFor(project);
                storageLocation.setParentLocation10(Long.valueOf(sampleTotals));
                storageLocationService.save(storageLocation);
            }catch (Exception e){
                //其它未知错误
                baseResponse = new BaseResponse(StatusCode.OTHERUNKOWERROR.getCode(),"此委托单样品接收失败");
                throw new RuntimeException("lims样品接收样品入库操作失败");
            }

            /***开如流程跳转*/
            try {
                List<String> projList = new ArrayList<>();
                projList.add(project);
                labWareLimsFlowJump.jumpToPlan(projList);
            }catch (Exception e){
                //其它未知错误
                baseResponse = new BaseResponse(StatusCode.OTHERUNKOWERROR.getCode(),"此委托单样品流程跳转到计划任务失败");
                throw new RuntimeException("lims样品接收流程跳转到计划任务失败");
            }

            /** 写入样品审计表 **/
            try {
                labWareLimsSampleReceiveAudit.insertSampleAudit("insert","样品接收动作",SecurityUtils.getSubject().getPrincipal().toString(),project,null);
            }catch (Exception e){
                logger.error("样品审计表写入失败:" + e.getMessage());
                throw new RuntimeException("lims样品审计表写入失败");
            }


            /** 写入新LIMS流程表和 **/
            try{
                DlLimsFlow limsFlow = new DlLimsFlow();
                limsFlow.setCuserid(smuserService.selectUserByName(SecurityUtils.getSubject().getPrincipal().toString()));
                limsFlow.setPkLimsFlow(generatedPrimaryKeys.getPrimary(20));
                limsFlow.setFlowAction("样品接收");
                limsFlow.setOpratdate(timestamp);
                limsFlow.setVdef1(project);
                limsFlow.setOprator(SecurityUtils.getSubject().getPrincipal().toString());
                newlimsAuditWriterService.insertLimsAudit(limsFlow);
            }catch (Exception e){
                logger.error("lims审计表写入失败：{}",e.getMessage());
                throw new RuntimeException("lims审计表写入失败");
            }

        }else {
            //其它未知错误
            baseResponse = new BaseResponse(StatusCode.OTHERUNKOWERROR.getCode(),"此委托单样品未找到，请检查sample登记是否正确");
        }
        return baseResponse;
    }


    /**
     *
     * 样品接收处驳回服务动作
     */
    @Transactional
    public BaseResponse projectSampleReject(JSONObject projectInfoJson , String rejectText){
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        /** json带过来的是待驳回委托单信息，textValue是样品单据的驳回信息，需邮件发送
         *
         * 流程：首先驳回委托托单，发送邮件，最后记录两个事件的事务日志
         * */
        try {
            customService.update("update qc_task_h h set h.approvestatus = -1 , h.approver = null , " +
                    "h.approvenote = null , h.approvedate = null " +
                    "where h.billno = '" + projectInfoJson.get("project") + "' and dr = 0");
        }catch (Exception e){
            logger.error("样品接收委托单模块{}驳回失败，原因：{}",projectInfoJson.get("project"),e.getMessage());
            baseResponse = new BaseResponse(StatusCode.OTHERUNKOWERROR.getCode(),"样品接收委托单模块" +
                    projectInfoJson.get("project") + "驳回失败，原因："+ e.getMessage() );
            throw new RuntimeException("样品接收驳回委托单错误");
        }
        /**
         * 开始发邮件
         */
        try {
            MailDTO mailDTO = new MailDTO();
            String context = "尊敬的委托人， " + customService.selectOne("select p.customer_contact from project p where p.name = '" + projectInfoJson.get("project").toString() + "'") + "先生/女士：";
            context += "您好！";
            context += "我们抱歉的通知您，您单号为《"+ projectInfoJson.get("project") +"》的委托单被退回了。退回原因：" + rejectText + "。为保证流程运转，请尽快登录Lims Web端根据驳回信息修改和提交委托单。";
            mailDTO.setSubject("关于委托单《" + projectInfoJson.get("project") + "》退回的通知");
            mailDTO.setContext(context);
            mailDTO.setToUsers(new String[] {customService.selectOne("select p.c_email_address from project p where p.name = '" + projectInfoJson.get("project").toString() + "'")});
            //mailDTO.setToUsers(new String[] {"1002437@hongfa.cn"});
            mailService.sendMail(mailDTO);
        }catch (Exception e){
            logger.error("邮件发送失败，委托单：{}，原因：{}",projectInfoJson.get("project"),e.getMessage());
            baseResponse = new BaseResponse(StatusCode.OTHERUNKOWERROR.getCode(),"邮件发送失败" + projectInfoJson.get("project") + "，原因："+ e.getMessage() );
            throw new RuntimeException("邮件发送失败");
        }


        /** 写入样品审计表 **/
        try {
            labWareLimsSampleReceiveAudit.insertSampleAudit("insert","样品驳回动作",SecurityUtils.getSubject().getPrincipal().toString(),projectInfoJson.get("project").toString(),null);
        }catch (Exception e){
            logger.error("样品审计表写入失败{}，原因：{}",projectInfoJson.get("project"),e.getMessage());
            baseResponse = new BaseResponse(StatusCode.OTHERUNKOWERROR.getCode(),"样品审计表写入失败" + projectInfoJson.get("project") + "，原因："+ e.getMessage() );
            throw new RuntimeException("样品审计表写入失败");
        }
        /** 写入新LIMS流程表和 **/
        try{
            DlLimsFlow limsFlow = new DlLimsFlow();
            limsFlow.setCuserid(smuserService.selectUserByName(SecurityUtils.getSubject().getPrincipal().toString()));
            limsFlow.setPkLimsFlow(generatedPrimaryKeys.getPrimary(20));
            limsFlow.setFlowAction("样品接收");
            limsFlow.setOpratdate(timestamp);
            limsFlow.setVdef1(projectInfoJson.get("project").toString());
            limsFlow.setOprator(SecurityUtils.getSubject().getPrincipal().toString());
            newlimsAuditWriterService.insertLimsAudit(limsFlow);
        }catch (Exception e){
            logger.error("lims审计表写入失败{}，原因：{}",projectInfoJson.get("project"),e.getMessage());
            baseResponse = new BaseResponse(StatusCode.OTHERUNKOWERROR.getCode(),"lims审计表写入失败" + projectInfoJson.get("project") + "，原因：+ " + e.getMessage());
            throw new RuntimeException("lims审计表写入失败");
        }
        return baseResponse;
    }

}
