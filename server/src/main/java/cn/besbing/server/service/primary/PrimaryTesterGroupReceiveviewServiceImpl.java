package cn.besbing.server.service.primary;/*
*   Xiamen HLYY Network Technology Co., Ltd.
*       DataLoader Cloud
*   @Author sheny
*   @Date 2020/11/13  11:38 
    @Version 1.0
    @Site https://besbing.cn
    @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
*/

import cn.besbing.model.entities.primary.StorageLocation;
import cn.besbing.model.entities.primary.Testergroupreceiveview;
import cn.besbing.model.mapper.primary.TestergroupreceiveviewMapper;
import cn.besbing.model.utils.SearchDTO;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrimaryTesterGroupReceiveviewServiceImpl {


    @Autowired(required = false)
    private TestergroupreceiveviewMapper testergroupreceiveviewMapper;

    public List<Testergroupreceiveview> getTestergroupreceiveview(SearchDTO searchDTO){
        List<Testergroupreceiveview> list = new ArrayList<Testergroupreceiveview>();
        PageHelper.startPage(searchDTO.getPage(), searchDTO.getLimit(),true);
        if(searchDTO.getKeyword() != null){
            list = testergroupreceiveviewMapper.selectTestergroupreceiveview(searchDTO.getKeyword().toString());
        }else {
            list = testergroupreceiveviewMapper.selectTestergroupreceiveview(null);
            //list = permissionMapper.selectByExample(null);
        }
        return list;
    }

}
