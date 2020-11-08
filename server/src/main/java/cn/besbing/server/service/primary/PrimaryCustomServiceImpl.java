package cn.besbing.server.service.primary;

import cn.besbing.model.mapper.primary.PrimaryCustom;
import cn.besbing.model.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PrimaryCustomServiceImpl implements PrimaryCustom{

    /*
    @Autowired(required = false)
    PrimaryCustom primaryCustom;

    @Autowired(required = false)
    RedisUtil redisUtil;

    @Cacheable(value = "dummy", key = "#i")
    public String TestConnection(int i){
        String s = primaryCustom.selectOne("select dummy from dual where rownum = " + i);
        return s;
    }*/


    @Autowired(required = false)
    PrimaryCustom customerSqlMapper;


    @Override
    public Integer insert(String statement) {
        return customerSqlMapper.insert(statement);
    }

    @Override
    public Integer delete(String statement) {
        return customerSqlMapper.delete(statement);
    }

    @Override
    public Integer update(String statement) {
        return customerSqlMapper.update(statement);
    }

    @Override
    public List<Map<String, Object>> selectList(String statement) {
        return customerSqlMapper.selectList(statement);
    }

    @Override
    public String selectOne(String statement) {
        return customerSqlMapper.selectOne(statement);
    }

    @Override
    public List<String> selectAsList(String statement) {
        return customerSqlMapper.selectAsList(statement);
    }








}
