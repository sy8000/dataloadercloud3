package cn.besbing.server.service.primary;

import cn.besbing.model.entities.primary.OrgOrgs;
import cn.besbing.model.mapper.primary.OrgOrgsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Xiamen HLYY Network Technology Co., Ltd.
 * DataLoader Cloud
 *
 * @Author sheny
 * @Date 2020/10/16  14:24
 * @Version 1.0
 * @Site https://besbing.cn
 * @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
 */
@Service
public class PrimaryOrgOrgsServiceImpl {

    @Autowired(required = false)
    private OrgOrgsMapper orgOrgsMapper;

    public List<String> getAllorg(){
        return orgOrgsMapper.selectAllOrgNames();
    }

    public OrgOrgs getOrgByUsercode(String usercode){
        return orgOrgsMapper.selectOrgByUsercode(usercode);
    }

}
