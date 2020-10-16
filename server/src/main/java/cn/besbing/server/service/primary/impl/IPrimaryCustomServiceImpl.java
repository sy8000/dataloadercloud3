package cn.besbing.server.service.primary.impl;

import cn.besbing.model.config.RedisConfig;
import cn.besbing.model.mapper.primary.PrimaryCustom;
import cn.besbing.server.service.primary.IPrimaryCustomService;
import cn.besbing.model.utils.RedisUtil;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.logging.Logger;

@Service
public class IPrimaryCustomServiceImpl implements IPrimaryCustomService {


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
