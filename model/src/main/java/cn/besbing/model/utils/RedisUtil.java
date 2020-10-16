package cn.besbing.model.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

public class RedisUtil {

    @Autowired
    private RedisTemplate redisTemplate;
    // 简单的K-V操作
    @Resource(name="redisTemplate")
    private ValueOperations<String, String> valueOperations;

    // 针对Map类型的数据操作
    @Resource(name="redisTemplate")
    private HashOperations<String, String, Object> hashOperations;

    // 针对List类型的数据操作
    @Resource(name="redisTemplate")
    private ListOperations<String, Object> listOperations;

    // set类型数据操作
    @Resource(name="redisTemplate")
    private SetOperations<String, Object> setOperations;

    // zset类型数据操作
    @Resource(name="redisTemplate")
    private ZSetOperations<String, Object> zSetOperations;


}
