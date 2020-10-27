package cn.besbing.model.mapper.primary;

import cn.besbing.model.entities.primary.BdPsndoc;
import cn.besbing.model.entities.primary.BdPsndocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BdPsndocMapper {
    long countByExample(BdPsndocExample example);

    int deleteByExample(BdPsndocExample example);

    int deleteByPrimaryKey(String pkPsndoc);

    int insert(BdPsndoc record);

    int insertSelective(BdPsndoc record);

    List<BdPsndoc> selectByExample(BdPsndocExample example);

    BdPsndoc selectByPrimaryKey(String pkPsndoc);

    int updateByExampleSelective(@Param("record") BdPsndoc record, @Param("example") BdPsndocExample example);

    int updateByExample(@Param("record") BdPsndoc record, @Param("example") BdPsndocExample example);

    int updateByPrimaryKeySelective(BdPsndoc record);

    int updateByPrimaryKey(BdPsndoc record);

    BdPsndoc selectPsndocByUsercode(@Param("code") String code);
}