package cn.besbing.server.service.lims;/*
*   Xiamen HLYY Network Technology Co., Ltd.
*       DataLoader Cloud
*   @Author sheny
*   @Date 2020/11/8  15:18 
    @Version 1.0
    @Site https://besbing.cn
    @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
*/

import cn.besbing.model.entities.primary.DlSamplerecAudit;
import cn.besbing.server.service.general.GeneratedPrimaryKeysImpl;
import cn.besbing.server.service.primary.PrimaryLabwareSampleAuditServiceImple;
import cn.besbing.server.service.primary.PrimarySampleServiceImpl;
import cn.besbing.server.service.primary.PrimarySmuserServiceImpl;
import cn.besbing.server.utils.AbstractLog;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;



@Service
public class LabWareLimsSampleReceiveAudit extends AbstractLog {

    @Autowired
    private PrimarySampleServiceImpl sampleService;

    @Autowired
    private LabWareLimsFlowJump labWareLimsFlowJump;

    @Autowired
    private LimsAuditWriterService limsAuditWriterService;

    @Autowired
    private GeneratedPrimaryKeysImpl generatedPrimaryKeys;

    @Autowired
    private PrimaryLabwareSampleAuditServiceImple labwareSampleAuditServiceImple;


    @Autowired
    private PrimarySmuserServiceImpl smuserService;

    public int insertSampleAudit(String dbAction,String opratContent,String userName,String project,String taskId){
        try{
            logger.info("样品接收:" + project + "开始...");
            DlSamplerecAudit samplerecAudit = new DlSamplerecAudit();
            //System.out.println(SecurityUtils.getSubject().getPrincipal());
            samplerecAudit.setPkSamplereiAudit(generatedPrimaryKeys.getPrimary(20));
            samplerecAudit.setOprator(userName);
            /*samplerecAudit.setDbaction("insert");
            samplerecAudit.setOpratcontent("样品接收动作");
            samplerecAudit.setCuserid(smuserService.selectUserByName(SecurityUtils.getSubject().getPrincipal().toString()));*/
            samplerecAudit.setDbaction(dbAction);
            samplerecAudit.setOpratcontent(opratContent);
            samplerecAudit.setCuserid(smuserService.selectUserByName(userName));
            samplerecAudit.setNewvalue(null);
            samplerecAudit.setOldvalue(null);
            samplerecAudit.setOpratdate(new java.sql.Timestamp(new Date().getTime()));
            samplerecAudit.setVdef1(project);
            samplerecAudit.setVdef2(taskId);
            labwareSampleAuditServiceImple.insertAudit(samplerecAudit);
            logger.info("样品接收:" + project + "结束...");
        }catch (Exception e){
            logger.info("样品接收:" + project + "错误。原因{}" , e.getMessage());
        }
        return 1;
    }



}
