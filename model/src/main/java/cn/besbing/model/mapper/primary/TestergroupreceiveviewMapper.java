package cn.besbing.model.mapper.primary;

import cn.besbing.model.entities.primary.Testergroupreceiveview;
import cn.besbing.model.entities.primary.TestergroupreceiveviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

public interface TestergroupreceiveviewMapper {
    long countByExample(TestergroupreceiveviewExample example);

    int deleteByExample(TestergroupreceiveviewExample example);

    int insert(Testergroupreceiveview record);

    int insertSelective(Testergroupreceiveview record);

    List<Testergroupreceiveview> selectByExample(TestergroupreceiveviewExample example);

    int updateByExampleSelective(@Param("record") Testergroupreceiveview record, @Param("example") TestergroupreceiveviewExample example);

    int updateByExample(@Param("record") Testergroupreceiveview record, @Param("example") TestergroupreceiveviewExample example);

    List<Testergroupreceiveview>  selectTestergroupreceiveview(@RequestParam(value = "taskId", required = false) String taskId );
}