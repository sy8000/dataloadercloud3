package cn.besbing.server.service.primary;
/*
*   Xiamen HLYY Network Technology Co., Ltd.
*       DataLoader Cloud
*   @Author sheny
*   @Date 2020/10/16  13:38
    @Version 1.0
    @Site https://besbing.cn
    @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
*/

import cn.besbing.model.entities.primary.Dual;
import cn.besbing.model.mapper.primary.DualMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "dual")
public class PrimaryDualServiceImpl {

    @Autowired(required = false)
    DualMapper dualMapper;

    @Cacheable
    public List<Dual> getDualDemo(String condition){
        return dualMapper.selectByExample(null);
    }


}
