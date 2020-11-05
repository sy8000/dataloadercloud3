package cn.besbing.server.service.primary;/*
*   Xiamen HLYY Network Technology Co., Ltd.
*       DataLoader Cloud
*   @Author sheny
*   @Date 2020/11/5  11:21 
    @Version 1.0
    @Site https://besbing.cn
    @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
*/

import cn.besbing.model.entities.primary.LabwareSamplereceiveView;
import cn.besbing.model.entities.primary.StorageLocation;
import cn.besbing.model.mapper.primary.StorageLocationMapper;
import cn.besbing.model.utils.SearchDTO;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrimaryStorageLocationServiceImpl {

    @Autowired(required = false)
    private StorageLocationMapper storageLocationMapper;

    public List<StorageLocation> getSampleReceiveList(SearchDTO searchDTO){
        List<StorageLocation> list = new ArrayList<StorageLocation>();
        PageHelper.startPage(searchDTO.getPage(), searchDTO.getLimit(),true);
        if(searchDTO.getKeyword() != null){
            list = storageLocationMapper.selectAllEmptySampleListSL(searchDTO.getKeyword().toString());
        }else {
            list = storageLocationMapper.selectAllEmptySampleListSL(null);
            //list = permissionMapper.selectByExample(null);
        }
        return list;
    }

}
