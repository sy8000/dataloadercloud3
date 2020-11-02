package cn.besbing.model.mapper.primary;

import cn.besbing.model.entities.primary.LabwareSamplereceiveView;
import cn.besbing.model.entities.primary.LabwareSamplereceiveViewExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

public interface LabwareSamplereceiveViewMapper {

    List<LabwareSamplereceiveView> selectAllSampleListReceive(@RequestParam(value = "project", required = false) String project);

    long countByExample(LabwareSamplereceiveViewExample example);

    int deleteByExample(LabwareSamplereceiveViewExample example);

    int insert(LabwareSamplereceiveView record);

    int insertSelective(LabwareSamplereceiveView record);

    List<LabwareSamplereceiveView> selectByExample(LabwareSamplereceiveViewExample example);

    int updateByExampleSelective(@Param("record") LabwareSamplereceiveView record, @Param("example") LabwareSamplereceiveViewExample example);

    int updateByExample(@Param("record") LabwareSamplereceiveView record, @Param("example") LabwareSamplereceiveViewExample example);
}