package cn.besbing.model.mapper.primary;

import cn.besbing.model.entities.primary.DlSamplerecAudit;
import cn.besbing.model.entities.primary.DlSamplerecAuditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DlSamplerecAuditMapper {
    long countByExample(DlSamplerecAuditExample example);

    int deleteByExample(DlSamplerecAuditExample example);

    int deleteByPrimaryKey(String pkSamplereiAudit);

    int insert(DlSamplerecAudit record);

    int insertSelective(DlSamplerecAudit record);

    List<DlSamplerecAudit> selectByExample(DlSamplerecAuditExample example);

    DlSamplerecAudit selectByPrimaryKey(String pkSamplereiAudit);

    int updateByExampleSelective(@Param("record") DlSamplerecAudit record, @Param("example") DlSamplerecAuditExample example);

    int updateByExample(@Param("record") DlSamplerecAudit record, @Param("example") DlSamplerecAuditExample example);

    int updateByPrimaryKeySelective(DlSamplerecAudit record);

    int updateByPrimaryKey(DlSamplerecAudit record);
}