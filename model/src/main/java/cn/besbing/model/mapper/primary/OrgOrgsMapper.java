package cn.besbing.model.mapper.primary;

import cn.besbing.model.entities.primary.OrgOrgs;
import cn.besbing.model.entities.primary.OrgOrgsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrgOrgsMapper {
    long countByExample(OrgOrgsExample example);

    int deleteByExample(OrgOrgsExample example);

    int deleteByPrimaryKey(String pkOrg);

    int insert(OrgOrgs record);

    int insertSelective(OrgOrgs record);

    List<OrgOrgs> selectByExample(OrgOrgsExample example);

    OrgOrgs selectByPrimaryKey(String pkOrg);

    int updateByExampleSelective(@Param("record") OrgOrgs record, @Param("example") OrgOrgsExample example);

    int updateByExample(@Param("record") OrgOrgs record, @Param("example") OrgOrgsExample example);

    int updateByPrimaryKeySelective(OrgOrgs record);

    int updateByPrimaryKey(OrgOrgs record);

    List<String> selectAllOrgNames();

    OrgOrgs selectOrgByUsercode(@Param("code") String code);
}