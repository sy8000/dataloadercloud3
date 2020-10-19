package cn.besbing.server.service.primary;
/*
*   Xiamen HLYY Network Technology Co., Ltd.
*       DataLoader Cloud
*   @Author sheny
*   @Date 2020/10/16  13:38
    @Version 1.0
    @Site https://besbing.cn
    @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
*/

import cn.besbing.model.entities.primary.DlPermission;
import cn.besbing.model.entities.primary.DlPermissionExample;
import cn.besbing.model.mapper.primary.DlPermissionMapper;
import cn.besbing.model.utils.PageDataResult;
import cn.besbing.model.utils.SearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrimaryDlPermissionServiceImpl {

    @Autowired(required = false)
    DlPermissionMapper permissionMapper;

    public List<DlPermission> allPermission(DlPermissionExample permissionExample){
        return permissionMapper.selectByExample(null);
    }

    public List<DlPermission> getDataForTable(SearchDTO searchDTO){
        List<DlPermission> list = new ArrayList<DlPermission>();
        if(searchDTO.getKeyword() != null){
            list = permissionMapper.selectPermissions(searchDTO.getKeyword().toString());
        }else {
            list = permissionMapper.selectPermissions(null);
        }
        return list;
    }

}
