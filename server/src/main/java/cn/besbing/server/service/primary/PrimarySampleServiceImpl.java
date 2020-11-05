package cn.besbing.server.service.primary;/*
*   Xiamen HLYY Network Technology Co., Ltd.
*       DataLoader Cloud
*   @Author sheny
*   @Date 2020/11/5  17:15 
    @Version 1.0
    @Site https://besbing.cn
    @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
*/

import cn.besbing.model.entities.primary.Sample;
import cn.besbing.model.mapper.primary.SampleMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PrimarySampleServiceImpl {

    @Autowired(required = false)
    private SampleMapper sampleMapper;

    public List<Sample> getSamplesByProject(String project){
        return sampleMapper.selectSamplesByProject(project);
    }

    public int updateByPrimary(Sample sample){
        return sampleMapper.updateByPrimaryKey(sample);
    }
}
