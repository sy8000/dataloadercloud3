package cn.besbing.model.mapper.primary;

import cn.besbing.model.entities.primary.DlUserRole;
import cn.besbing.model.entities.primary.DlUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DlUserRoleMapper {
    long countByExample(DlUserRoleExample example);

    int deleteByExample(DlUserRoleExample example);

    int insert(DlUserRole record);

    int insertSelective(DlUserRole record);

    List<DlUserRole> selectByExample(DlUserRoleExample example);

    int updateByExampleSelective(@Param("record") DlUserRole record, @Param("example") DlUserRoleExample example);

    int updateByExample(@Param("record") DlUserRole record, @Param("example") DlUserRoleExample example);
}