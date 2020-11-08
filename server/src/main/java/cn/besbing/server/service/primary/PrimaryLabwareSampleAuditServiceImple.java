package cn.besbing.server.service.primary;/*
*   Xiamen HLYY Network Technology Co., Ltd.
*       DataLoader Cloud
*   @Author sheny
*   @Date 2020/11/8  16:02 
    @Version 1.0
    @Site https://besbing.cn
    @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
*/


import cn.besbing.model.entities.primary.DlSamplerecAudit;
import cn.besbing.model.mapper.primary.DlSamplerecAuditMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Service;

@Service
public class PrimaryLabwareSampleAuditServiceImple {

    @Autowired(required = false)
    private DlSamplerecAuditMapper samplerecAuditMapper;

    public int insertAudit(DlSamplerecAudit samplerecAudit){
        return samplerecAuditMapper.insert(samplerecAudit);
    }

}
