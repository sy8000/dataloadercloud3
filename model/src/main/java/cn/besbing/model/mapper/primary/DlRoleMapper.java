package cn.besbing.model.mapper.primary;

import cn.besbing.model.entities.primary.DlRole;
import cn.besbing.model.entities.primary.DlRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

public interface DlRoleMapper {
    long countByExample(DlRoleExample example);

    int deleteByExample(DlRoleExample example);

    int deleteByPrimaryKey(String roleid);

    int insert(DlRole record);

    int insertSelective(DlRole record);

    List<DlRole> selectByExample(DlRoleExample example);

    DlRole selectByPrimaryKey(String roleid);

    int updateByExampleSelective(@Param("record") DlRole record, @Param("example") DlRoleExample example);

    int updateByExample(@Param("record") DlRole record, @Param("example") DlRoleExample example);

    int updateByPrimaryKeySelective(DlRole record);

    int updateByPrimaryKey(DlRole record);

    List<DlRole> selectRolesForTable(@RequestParam(value = "description", required = false) String description);
}