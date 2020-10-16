package cn.besbing.server.service.primary.impl;

import cn.besbing.model.entities.primary.Dual;
import cn.besbing.model.mapper.primary.DualMapper;
import cn.besbing.server.service.primary.IPrimaryDualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "dual")
public class PrimaryDualServiceImpl implements IPrimaryDualService {

    @Autowired(required = false)
    DualMapper dualMapper;

    @Cacheable
    public List<Dual> getDualDemo(String condition){
        return dualMapper.selectByExample(null);
    }


}
