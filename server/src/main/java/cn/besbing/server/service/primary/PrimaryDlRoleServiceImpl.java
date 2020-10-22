package cn.besbing.server.service.primary;

import cn.besbing.model.entities.primary.DlRole;
import cn.besbing.model.entities.primary.DlRoleExample;
import cn.besbing.model.mapper.primary.DlRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Xiamen HLYY Network Technology Co., Ltd.
 * DataLoader Cloud
 *
 * @Author sheny
 * @Date 2020/10/16  14:24
 * @Version 1.0
 * @Site https://besbing.cn
 * @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
 */

@Service
public class PrimaryDlRoleServiceImpl implements DlRoleMapper {


    @Autowired(required = false)
    DlRoleMapper dlRoleMapper;


    @Override
    public long countByExample(DlRoleExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(DlRoleExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String roleid) {
        return 0;
    }

    @Override
    public int insert(DlRole record) {
        return 0;
    }

    @Override
    public int insertSelective(DlRole record) {
        return 0;
    }

    @Override
    public List<DlRole> selectByExample(DlRoleExample example) {
        return null;
    }

    @Override
    public DlRole selectByPrimaryKey(String roleid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(DlRole record, DlRoleExample example) {
        return 0;
    }

    @Override
    public int updateByExample(DlRole record, DlRoleExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(DlRole record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(DlRole record) {
        return 0;
    }

    @Override
    public List<DlRole> selectRolesForTable(String description) {
        return dlRoleMapper.selectRolesForTable(null);
    }
}
