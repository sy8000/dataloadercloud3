package cn.besbing.model.mapper.primary;

import cn.besbing.model.entities.primary.DlSampleType;
import cn.besbing.model.entities.primary.DlSampleTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DlSampleTypeMapper {
    long countByExample(DlSampleTypeExample example);

    int deleteByExample(DlSampleTypeExample example);

    int insert(DlSampleType record);

    int insertSelective(DlSampleType record);

    List<DlSampleType> selectByExample(DlSampleTypeExample example);

    int updateByExampleSelective(@Param("record") DlSampleType record, @Param("example") DlSampleTypeExample example);

    int updateByExample(@Param("record") DlSampleType record, @Param("example") DlSampleTypeExample example);

    int clearSampleType();

    int saveSampleType(@Param("value") String value);

    String selectSampleType();
}