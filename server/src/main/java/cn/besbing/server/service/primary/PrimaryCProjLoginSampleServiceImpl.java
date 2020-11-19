package cn.besbing.server.service.primary;

import cn.besbing.model.entities.primary.CProjLoginSample;
import cn.besbing.model.entities.primary.DlPermission;
import cn.besbing.model.mapper.primary.CProjLoginSampleMapper;
import cn.besbing.model.utils.SearchDTO;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
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
public class PrimaryCProjLoginSampleServiceImpl {

    @Autowired(required = false)
    private CProjLoginSampleMapper projLoginSampleMapper;


    @Transactional(rollbackFor = Exception.class)
    public List<CProjLoginSample> getProjectForTable(SearchDTO searchDTO){
        List<CProjLoginSample> list = new ArrayList<CProjLoginSample>();
        PageHelper.startPage(searchDTO.getPage(), searchDTO.getLimit(),true);
        if(searchDTO.getKeyword() != null){
            list = projLoginSampleMapper.selectProject(searchDTO.getKeyword().toString());
        }else {
            list = projLoginSampleMapper.selectProject(null);
            //list = permissionMapper.selectByExample(null);
        }
        return list;
    }

    public CProjLoginSample selectProjectInfobyPrimary(String seqnum) {
        return projLoginSampleMapper.selectByPrimaryKey(BigDecimal.valueOf(Long.parseLong(seqnum)));
    }

    public int save(CProjLoginSample searchCpls) {
        return projLoginSampleMapper.updateByPrimaryKey(searchCpls);
    }

    public List<CProjLoginSample>  getProjectInfoByProject(String project) {
        return projLoginSampleMapper.selectProjectInfoByProject(project);
    }

    public CProjLoginSample  getProjectInfoByProjectAndSampleGroup(String project, String sampleGroup) {
        return projLoginSampleMapper.selectProjectInfoByProjectAndSampleGroup(project,sampleGroup);
    }
}
