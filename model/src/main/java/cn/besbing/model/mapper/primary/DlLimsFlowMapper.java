package cn.besbing.model.mapper.primary;

import cn.besbing.model.entities.primary.DlLimsFlow;
import cn.besbing.model.entities.primary.DlLimsFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DlLimsFlowMapper {
    long countByExample(DlLimsFlowExample example);

    int deleteByExample(DlLimsFlowExample example);

    int deleteByPrimaryKey(String pkLimsFlow);

    int insert(DlLimsFlow record);

    int insertSelective(DlLimsFlow record);

    List<DlLimsFlow> selectByExample(DlLimsFlowExample example);

    DlLimsFlow selectByPrimaryKey(String pkLimsFlow);

    int updateByExampleSelective(@Param("record") DlLimsFlow record, @Param("example") DlLimsFlowExample example);

    int updateByExample(@Param("record") DlLimsFlow record, @Param("example") DlLimsFlowExample example);

    int updateByPrimaryKeySelective(DlLimsFlow record);

    int updateByPrimaryKey(DlLimsFlow record);
}