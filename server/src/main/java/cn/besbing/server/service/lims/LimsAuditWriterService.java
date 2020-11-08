package cn.besbing.server.service.lims;/*
*   Xiamen HLYY Network Technology Co., Ltd.
*       DataLoader Cloud
*   @Author sheny
*   @Date 2020/11/8  15:15 
    @Version 1.0
    @Site https://besbing.cn
    @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
*/

import cn.besbing.model.entities.primary.DlLimsFlow;
import cn.besbing.model.mapper.primary.DlLimsFlowMapper;
import cn.besbing.server.utils.AbstractLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * LIMS 3.0 流程日志写入类
 *
 */

@Service
public class LimsAuditWriterService extends AbstractLog {

    @Autowired(required = false)
    private DlLimsFlowMapper limsFlowMapper;

    public int insertLimsAudit(DlLimsFlow limsFlow){
        return limsFlowMapper.insert(limsFlow);
    }


}
