package cn.besbing.model.mapper.primary;

import cn.besbing.model.entities.primary.ListEntry;
import cn.besbing.model.entities.primary.ListEntryExample;
import cn.besbing.model.entities.primary.ListEntryKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ListEntryMapper {
    long countByExample(ListEntryExample example);

    int deleteByExample(ListEntryExample example);

    int deleteByPrimaryKey(ListEntryKey key);

    int insert(ListEntry record);

    int insertSelective(ListEntry record);

    List<ListEntry> selectByExample(ListEntryExample example);

    ListEntry selectByPrimaryKey(ListEntryKey key);

    int updateByExampleSelective(@Param("record") ListEntry record, @Param("example") ListEntryExample example);

    int updateByExample(@Param("record") ListEntry record, @Param("example") ListEntryExample example);

    int updateByPrimaryKeySelective(ListEntry record);

    int updateByPrimaryKey(ListEntry record);

    List<String> selectByListname(@Param("list") String list);
}