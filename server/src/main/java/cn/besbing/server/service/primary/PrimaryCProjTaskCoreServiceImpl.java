package cn.besbing.server.service.primary;

import cn.besbing.model.entities.primary.CProjLoginSample;
import cn.besbing.model.entities.primary.CProjTask;
import cn.besbing.model.entities.primary.ListObject;
import cn.besbing.model.mapper.primary.CProjTaskMapper;
import cn.besbing.model.utils.SearchDTO;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
public class PrimaryCProjTaskCoreServiceImpl {

    @Autowired(required = false)
    private CProjTaskMapper projTaskMapper;

    @Transactional(rollbackFor = Exception.class)
    public List<CProjTask> getAllTask(SearchDTO searchDTO){
        List<CProjTask> list = new ArrayList<CProjTask>();
        PageHelper.startPage(searchDTO.getPage(), searchDTO.getLimit(),true);
        if(searchDTO.getKeyword() != null){
            list = projTaskMapper.selectAllTask(searchDTO.getKeyword().toString());
        }else {
            list = projTaskMapper.selectAllTask(null);
            //list = permissionMapper.selectByExample(null);
        }
        return list;
    }

    public List<ListObject> getTestConditionsByTaskid(String taskId){
        return projTaskMapper.selectSortList(taskId);
    }

    public CProjTask selectSingleTaskInfoById(String taskId) {
        return projTaskMapper.selectSingleTaskById(taskId);
    }
}
