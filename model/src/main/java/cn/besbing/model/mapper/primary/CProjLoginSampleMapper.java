package cn.besbing.model.mapper.primary;

import cn.besbing.model.entities.primary.CProjLoginSample;
import cn.besbing.model.entities.primary.CProjLoginSampleExample;
import java.math.BigDecimal;
import java.util.List;

import cn.besbing.model.entities.primary.DlPermission;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

public interface CProjLoginSampleMapper {
    long countByExample(CProjLoginSampleExample example);

    int deleteByExample(CProjLoginSampleExample example);

    int deleteByPrimaryKey(BigDecimal seqNum);

    int insert(CProjLoginSample record);

    int insertSelective(CProjLoginSample record);

    List<CProjLoginSample> selectByExample(CProjLoginSampleExample example);

    CProjLoginSample selectByPrimaryKey(BigDecimal seqNum);

    int updateByExampleSelective(@Param("record") CProjLoginSample record, @Param("example") CProjLoginSampleExample example);

    int updateByExample(@Param("record") CProjLoginSample record, @Param("example") CProjLoginSampleExample example);

    int updateByPrimaryKeySelective(CProjLoginSample record);

    int updateByPrimaryKey(CProjLoginSample record);

    List<CProjLoginSample> selectProject(@RequestParam(value = "project", required = false) String project);
}