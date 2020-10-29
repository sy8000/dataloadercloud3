package cn.besbing.model.mapper.primary;

import cn.besbing.model.entities.primary.ResultView;
import cn.besbing.model.entities.primary.ResultViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResultViewMapper {
    long countByExample(ResultViewExample example);

    int deleteByExample(ResultViewExample example);

    int insert(ResultView record);

    int insertSelective(ResultView record);

    List<ResultView> selectByExample(ResultViewExample example);

    int updateByExampleSelective(@Param("record") ResultView record, @Param("example") ResultViewExample example);

    int updateByExample(@Param("record") ResultView record, @Param("example") ResultViewExample example);

    List<String> selectDistinctResultNameByTaskid(@Param("cTaskId") String cTaskId);

    List<String> selectAllResultViewTask();

    List<ResultView> selectResultViewByTaskid(String cTaskId);

    List<String>  selectDistinctResultSampleByTaskid(@Param("cTaskId") String cTaskId);
}