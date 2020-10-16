package cn.besbing.model.mapper.primary;

import cn.besbing.model.entities.primary.DlPermission;
import cn.besbing.model.entities.primary.DlPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DlPermissionMapper {
    long countByExample(DlPermissionExample example);

    int deleteByExample(DlPermissionExample example);

    int deleteByPrimaryKey(String permissionid);

    int insert(DlPermission record);

    int insertSelective(DlPermission record);

    List<DlPermission> selectByExample(DlPermissionExample example);

    DlPermission selectByPrimaryKey(String permissionid);

    int updateByExampleSelective(@Param("record") DlPermission record, @Param("example") DlPermissionExample example);

    int updateByExample(@Param("record") DlPermission record, @Param("example") DlPermissionExample example);

    int updateByPrimaryKeySelective(DlPermission record);

    int updateByPrimaryKey(DlPermission record);
}