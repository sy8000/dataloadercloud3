package cn.besbing.server.service.primary;

import cn.besbing.model.mapper.primary.PrimaryCustom;
import cn.besbing.model.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class PrimaryCustomServiceImpl {


    @Autowired(required = false)
    PrimaryCustom primaryCustom;

    @Autowired(required = false)
    RedisUtil redisUtil;

    @Cacheable(value = "dummy", key = "#i")
    public String TestConnection(int i){
        String s = primaryCustom.selectOne("select dummy from dual where rownum = " + i);
        return s;
    }





}
