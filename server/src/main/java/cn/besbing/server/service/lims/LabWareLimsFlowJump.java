package cn.besbing.server.service.lims;/*
*   Xiamen HLYY Network Technology Co., Ltd.
*       DataLoader Cloud
*   @Author sheny
*   @Date 2020/11/8  12:58 
    @Version 1.0
    @Site https://besbing.cn
    @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
*/

import cn.besbing.server.service.primary.PrimaryCustomServiceImpl;
import cn.besbing.server.utils.AbstractLog;
import com.sun.media.jfxmedia.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LabWareLimsFlowJump extends AbstractLog {

    @Autowired(required = false)
    private PrimaryCustomServiceImpl customService;

    /**
     * 流程跳转至计划排程
     * @param projectList
     * @return
     */
    public int jumpToPlan(List<String> projectList){
        int flag = -1;
        List<String> sqlList = new ArrayList();
        try {
            sqlList = customService.selectAsList("select sql_text from sql_records where sql_code like 'plan%' ");
            for (String project : projectList){
                logger.info("处理委托单号为:" + project + "的单据流程转至计划排程开始");
                for (String sql : sqlList){
                    flag = customService.update(sql.replace("sheny",project));
                    logger.info("语句:" + customService.update(sql.replace("sheny",project) + "，处理记录共" + flag + "条"));
                }
                logger.info("处理委托单号为:" + project + "的单据流程转至计划排程结束");
            }
            flag = 1;
        }catch (Exception e){
            return -1;
        }
        return flag;
    }

}
