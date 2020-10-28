package cn.besbing.server.service.primary;

import cn.besbing.model.entities.primary.ResultView;
import cn.besbing.model.mapper.primary.ResultViewMapper;
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
public class PrimaryResultViewServiceImple {

    @Autowired(required = false)
    private ResultViewMapper resultViewMapper;

    public List<String> getDistinctResultNameByTaskid(String cTaskId){
        return resultViewMapper.selectDistinctResultNameByTaskid(cTaskId);
    }

    public List<String> getAllResultViewTask(){
        return resultViewMapper.selectAllResultViewTask();
    }

    public List<ResultView> getResultViewByTaskid(String cTaskId){
        return resultViewMapper.selectResultViewByTaskid(cTaskId);
    }

    public List<String> getDistinctResultSampleByTaskid(String cTaskId){
        return resultViewMapper.selectDistinctResultSampleByTaskid(cTaskId);
    }



}
