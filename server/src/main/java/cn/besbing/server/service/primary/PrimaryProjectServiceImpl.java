package cn.besbing.server.service.primary;

import cn.besbing.model.entities.primary.Project;
import cn.besbing.model.mapper.primary.ProjectMapper;
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
public class PrimaryProjectServiceImpl {

    @Autowired(required = false)
    private ProjectMapper projectMapper;

    public List<Project> selectAllUnreceivedSampleProject(){
        return projectMapper.selectAllUnreceivedSampleProject();
    }

}
