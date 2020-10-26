package cn.besbing.model.mapper.primary;

import cn.besbing.model.entities.primary.QcCommissionH;
import cn.besbing.model.entities.primary.QcCommissionHExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QcCommissionHMapper {
    long countByExample(QcCommissionHExample example);

    int deleteByExample(QcCommissionHExample example);

    int deleteByPrimaryKey(String pkCommissionH);

    int insert(QcCommissionH record);

    int insertSelective(QcCommissionH record);

    List<QcCommissionH> selectByExample(QcCommissionHExample example);

    QcCommissionH selectByPrimaryKey(String pkCommissionH);

    int updateByExampleSelective(@Param("record") QcCommissionH record, @Param("example") QcCommissionHExample example);

    int updateByExample(@Param("record") QcCommissionH record, @Param("example") QcCommissionHExample example);

    int updateByPrimaryKeySelective(QcCommissionH record);

    int updateByPrimaryKey(QcCommissionH record);

    String getPrimary(@Param("billno") String billno);
}