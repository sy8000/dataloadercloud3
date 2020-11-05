package cn.besbing.model.mapper.primary;

import cn.besbing.model.entities.primary.Sample;
import cn.besbing.model.entities.primary.SampleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SampleMapper {

    List<Sample> selectByExample(SampleExample example);

    Sample selectByPrimaryKey(Long sampleNumber);


    int updateByPrimaryKeySelective(Sample record);

    int updateByPrimaryKey(Sample record);

    List<Sample> selectSamplesByProject(@Param("project") String project);
}