package cn.besbing.model.mapper.primary;

import cn.besbing.model.entities.primary.DlParamAfter;
import cn.besbing.model.entities.primary.DlParamAfterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DlParamAfterMapper {
    long countByExample(DlParamAfterExample example);

    int deleteByExample(DlParamAfterExample example);

    int insert(DlParamAfter record);

    int insertSelective(DlParamAfter record);

    List<DlParamAfter> selectByExample(DlParamAfterExample example);

    int updateByExampleSelective(@Param("record") DlParamAfter record, @Param("example") DlParamAfterExample example);

    int updateByExample(@Param("record") DlParamAfter record, @Param("example") DlParamAfterExample example);
}