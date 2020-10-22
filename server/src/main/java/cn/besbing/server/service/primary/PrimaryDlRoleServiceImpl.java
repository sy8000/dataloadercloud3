package cn.besbing.server.service.primary;

import cn.besbing.model.entities.primary.DlPermission;
import cn.besbing.model.entities.primary.DlRole;
import cn.besbing.model.entities.primary.DlRoleExample;
import cn.besbing.model.mapper.primary.DlRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional(rollbackFor = Exception.class)
    @Override
    public long countByExample(DlRoleExample example) {
        return 0;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int deleteByExample(DlRoleExample example) {
        return 0;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int deleteByPrimaryKey(String roleid) {
        return 0;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int insert(DlRole record) {
        return 0;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int insertSelective(DlRole record) {
        return 0;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public List<DlRole> selectByExample(DlRoleExample example) {
        return null;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public DlRole selectByPrimaryKey(String roleid) {
        return null;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int updateByExampleSelective(DlRole record, DlRoleExample example) {
        return 0;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int updateByExample(DlRole record, DlRoleExample example) {
        return 0;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int updateByPrimaryKeySelective(DlRole record) {
        return 0;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int updateByPrimaryKey(DlRole record) {
        return 0;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public List<DlRole> selectRolesForTable() {
        return dlRoleMapper.selectRolesForTable();
    }

    @Transactional(rollbackFor = Exception.class)
    public int save(DlRole dlRole) {
        return dlRoleMapper.insert(dlRole);
    }

    @Transactional(rollbackFor = Exception.class)
    public int update(DlRole dlRole) {
        return dlRoleMapper.updateByPrimaryKeySelective(dlRole);
    }

    @Transactional(rollbackFor = Exception.class)
    public DlRole selectRolebyPrimary(String dlroleid) {
        return dlRoleMapper.selectByPrimaryKey(dlroleid.trim());
    }

    @Transactional(rollbackFor = Exception.class)
    public int deletebyPrimary(String roleid) {
        return dlRoleMapper.deleteByPrimaryKey(roleid.trim());
    }
}
