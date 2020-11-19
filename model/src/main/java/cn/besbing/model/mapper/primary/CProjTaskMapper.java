package cn.besbing.model.mapper.primary;

import cn.besbing.model.entities.primary.CProjTask;
import cn.besbing.model.entities.primary.CProjTaskExample;
import java.util.List;

import cn.besbing.model.entities.primary.ListObject;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

public interface CProjTaskMapper {
    long countByExample(CProjTaskExample example);

    int deleteByExample(CProjTaskExample example);

    int deleteByPrimaryKey(Long seqNum);

    int insert(CProjTask record);

    int insertSelective(CProjTask record);

    List<CProjTask> selectByExample(CProjTaskExample example);

    CProjTask selectByPrimaryKey(Long seqNum);

    int updateByExampleSelective(@Param("record") CProjTask record, @Param("example") CProjTaskExample example);

    int updateByExample(@Param("record") CProjTask record, @Param("example") CProjTaskExample example);

    int updateByPrimaryKeySelective(CProjTask record);

    int updateByPrimaryKey(CProjTask record);

    List<CProjTask> selectAllTask(@RequestParam(value = "taskId", required = false) String taskId);

    List<ListObject> selectSortList(@Param("taskId") String taskId);

    CProjTask selectSingleTaskById(@Param("taskId") String taskId);
}