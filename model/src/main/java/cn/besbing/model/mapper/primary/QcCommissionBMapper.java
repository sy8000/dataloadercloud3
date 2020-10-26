package cn.besbing.model.mapper.primary;

import cn.besbing.model.entities.primary.QcCommissionB;
import cn.besbing.model.entities.primary.QcCommissionBExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QcCommissionBMapper {
    long countByExample(QcCommissionBExample example);

    int deleteByExample(QcCommissionBExample example);

    int deleteByPrimaryKey(String pkCommissionB);

    int insert(QcCommissionB record);

    int insertSelective(QcCommissionB record);

    List<QcCommissionB> selectByExample(QcCommissionBExample example);

    QcCommissionB selectByPrimaryKey(String pkCommissionB);

    int updateByExampleSelective(@Param("record") QcCommissionB record, @Param("example") QcCommissionBExample example);

    int updateByExample(@Param("record") QcCommissionB record, @Param("example") QcCommissionBExample example);

    int updateByPrimaryKeySelective(QcCommissionB record);

    int updateByPrimaryKey(QcCommissionB record);


    List<QcCommissionB> getQcbByProjectNo(@Param("pkCommissionH")String pkCommissionH,@Param("typeno") String typeno);
}