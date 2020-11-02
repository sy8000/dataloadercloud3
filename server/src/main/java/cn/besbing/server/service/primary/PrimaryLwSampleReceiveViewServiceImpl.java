package cn.besbing.server.service.primary;

import cn.besbing.model.entities.primary.CProjLoginSample;
import cn.besbing.model.entities.primary.LabwareSamplereceiveView;
import cn.besbing.model.mapper.primary.LabwareSamplereceiveViewMapper;
import cn.besbing.model.utils.SearchDTO;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
public class PrimaryLwSampleReceiveViewServiceImpl {

    @Autowired(required = false)
    private LabwareSamplereceiveViewMapper samplereceiveViewMapper;


    public List<LabwareSamplereceiveView> getSampleReceiveForTable(SearchDTO searchDTO) {
        List<LabwareSamplereceiveView> list = new ArrayList<LabwareSamplereceiveView>();
        PageHelper.startPage(searchDTO.getPage(), searchDTO.getLimit(),true);
        if(searchDTO.getKeyword() != null){
            list = samplereceiveViewMapper.selectAllSampleListReceive(searchDTO.getKeyword().toString());
        }else {
            list = samplereceiveViewMapper.selectAllSampleListReceive(null);
            //list = permissionMapper.selectByExample(null);
        }
        return list;
    }
}
