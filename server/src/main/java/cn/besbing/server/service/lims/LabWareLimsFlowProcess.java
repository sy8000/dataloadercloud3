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
import cn.besbing.model.entities.primary.DlLimsFlow;
import cn.besbing.model.entities.primary.DlSamplerecAudit;
import cn.besbing.model.entities.primary.Sample;
import cn.besbing.model.entities.primary.SmUser;
import cn.besbing.server.service.general.GeneratedPrimaryKeysImpl;
import cn.besbing.server.service.primary.PrimarySampleServiceImpl;
import cn.besbing.server.service.primary.PrimarySmuserServiceImpl;
import cn.besbing.server.utils.AbstractLog;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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


    @Transactional
    public BaseResponse sampleReceive(String project, String locationNumber){
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        /**
         * labware逻辑:
         * samplenumber = selectedsamples[i]
         * 	status = ReceiveSample(samplenumber)
         * 	移动sample到指定库位
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
                limsFlow.setOpratdate(new java.sql.Timestamp(new Date().getTime()));
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

}
