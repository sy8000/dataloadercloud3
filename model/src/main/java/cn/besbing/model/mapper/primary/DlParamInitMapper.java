package cn.besbing.model.mapper.primary;

import cn.besbing.model.entities.primary.DlParamInit;
import cn.besbing.model.entities.primary.DlParamInitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DlParamInitMapper {
    long countByExample(DlParamInitExample example);

    int deleteByExample(DlParamInitExample example);

    int insert(DlParamInit record);

    int insertSelective(DlParamInit record);

    List<DlParamInit> selectByExample(DlParamInitExample example);

    int updateByExampleSelective(@Param("record") DlParamInit record, @Param("example") DlParamInitExample example);

    int updateByExample(@Param("record") DlParamInit record, @Param("example") DlParamInitExample example);

    List<DlParamInit>  customSearchInit(@Param("record") DlParamInit record);
}