package cn.besbing.model.mapper.primary;

import cn.besbing.model.entities.primary.Dual;
import cn.besbing.model.entities.primary.DualExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DualMapper {
    long countByExample(DualExample example);

    int deleteByExample(DualExample example);

    int insert(Dual record);

    int insertSelective(Dual record);

    List<Dual> selectByExample(DualExample example);

    int updateByExampleSelective(@Param("record") Dual record, @Param("example") DualExample example);

    int updateByExample(@Param("record") Dual record, @Param("example") DualExample example);
}