package cn.besbing.model.mapper.primary;

import cn.besbing.model.entities.primary.StorageLocation;
import cn.besbing.model.entities.primary.StorageLocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

public interface StorageLocationMapper {
    long countByExample(StorageLocationExample example);

    int deleteByExample(StorageLocationExample example);

    int deleteByPrimaryKey(Long locationNumber);

    int insert(StorageLocation record);

    int insertSelective(StorageLocation record);

    List<StorageLocation> selectByExample(StorageLocationExample example);

    StorageLocation selectByPrimaryKey(Long locationNumber);

    int updateByExampleSelective(@Param("record") StorageLocation record, @Param("example") StorageLocationExample example);

    int updateByExample(@Param("record") StorageLocation record, @Param("example") StorageLocationExample example);

    int updateByPrimaryKeySelective(StorageLocation record);

    int updateByPrimaryKey(StorageLocation record);

    List<StorageLocation> selectAllEmptySampleListSL(@RequestParam(value = "name", required = false) String name);

    List<StorageLocation>  selectAllNotEmptyLocationStorage(@RequestParam(value = "name", required = false) String name);
}