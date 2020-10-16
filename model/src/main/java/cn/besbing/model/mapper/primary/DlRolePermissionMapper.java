package cn.besbing.model.mapper.primary;

import cn.besbing.model.entities.primary.DlRolePermission;
import cn.besbing.model.entities.primary.DlRolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DlRolePermissionMapper {
    long countByExample(DlRolePermissionExample example);

    int deleteByExample(DlRolePermissionExample example);

    int insert(DlRolePermission record);

    int insertSelective(DlRolePermission record);

    List<DlRolePermission> selectByExample(DlRolePermissionExample example);

    int updateByExampleSelective(@Param("record") DlRolePermission record, @Param("example") DlRolePermissionExample example);

    int updateByExample(@Param("record") DlRolePermission record, @Param("example") DlRolePermissionExample example);
}