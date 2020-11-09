package cn.besbing.model.mapper.primary;

import cn.besbing.model.entities.primary.SmUser;
import cn.besbing.model.entities.primary.SmUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

public interface SmUserMapper {
    long countByExample(SmUserExample example);

    int deleteByExample(SmUserExample example);

    int deleteByPrimaryKey(String cuserid);

    int insert(SmUser record);

    int insertSelective(SmUser record);

    List<SmUser> selectByExample(SmUserExample example);

    SmUser selectByUserCode(@Param("userCode") String userCode);

    SmUser selectByPrimaryKey(String cuserid);

    int updateByExampleSelective(@Param("record") SmUser record, @Param("example") SmUserExample example);

    int updateByExample(@Param("record") SmUser record, @Param("example") SmUserExample example);

    int updateByPrimaryKeySelective(SmUser record);

    int updateByPrimaryKey(SmUser record);

    List<SmUser> selectUserForTable(String keyword);

    List<SmUser> selectUserForDlpSelect();

    String selectUserByName(@Param("userName") String userName);


    SmUser getUserByCode(@Param("userCode") String userCode);
}