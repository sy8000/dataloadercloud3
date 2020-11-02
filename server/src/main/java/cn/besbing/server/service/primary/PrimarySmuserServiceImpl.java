package cn.besbing.server.service.primary;/*
*   Xiamen HLYY Network Technology Co., Ltd.
*       DataLoader Cloud
*   @Author sheny
*   @Date 2020/10/16  13:38 
    @Version 1.0
    @Site https://besbing.cn
    @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
*/

import cn.besbing.model.entities.primary.SmUser;
import cn.besbing.model.entities.primary.SmUserExample;
import cn.besbing.model.mapper.primary.SmUserMapper;
import cn.besbing.model.utils.SearchDTO;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrimarySmuserServiceImpl implements  SmUserMapper{

    @Autowired(required = false)
    private SmUserMapper smUserMapper;

    public SmUser selectUserByCode(String userCode){
        return smUserMapper.selectByUserCode(userCode);
    }

    @Override
    public long countByExample(SmUserExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(SmUserExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String cuserid) {
        return 0;
    }

    @Override
    public int insert(SmUser record) {
        return 0;
    }

    @Override
    public int insertSelective(SmUser record) {
        return 0;
    }

    @Override
    public List<SmUser> selectByExample(SmUserExample example) {
        return smUserMapper.selectByExample(null);
    }

    @Override
    public SmUser selectByUserCode(String userCode) {
        return smUserMapper.selectByUserCode(userCode);
    }

    @Override
    public SmUser selectByPrimaryKey(String cuserid) {
        return smUserMapper.selectByPrimaryKey(cuserid);
    }

    @Override
    public int updateByExampleSelective(SmUser record, SmUserExample example) {
        return 0;
    }

    @Override
    public int updateByExample(SmUser record, SmUserExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(SmUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SmUser record) {
        return 0;
    }

    @Override
    public List<SmUser> selectUserForTable(String keyword) {
        return smUserMapper.selectUserForTable(keyword);
    }

    public List<SmUser> selectUserForTableFunc(SearchDTO searchDTO) {
        List<SmUser> list = new ArrayList<SmUser>();
        PageHelper.startPage(searchDTO.getPage(), searchDTO.getLimit(),true);
        if(searchDTO.getKeyword() != null){
            list = smUserMapper.selectUserForTable(searchDTO.getKeyword().toString());
        }else {
            list = smUserMapper.selectUserForTable(null);
            //list = permissionMapper.selectByExample(null);
        }
        return list;
    }

    public List<SmUser> selectUserForDlpSelect(){
        return smUserMapper.selectUserForDlpSelect();
    }

    public int save(SmUser smUser) {
        return smUserMapper.insert(smUser);
    }

    public int update(SmUser smUser) {
        return smUserMapper.updateByPrimaryKey(smUser);
    }

    public int deletebyPrimary(String cuserid) {
        return smUserMapper.deleteByPrimaryKey(cuserid);
    }
}
