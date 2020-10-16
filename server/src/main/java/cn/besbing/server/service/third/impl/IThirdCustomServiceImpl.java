package cn.besbing.server.service.third.impl;

import cn.besbing.model.mapper.slave.SlaveCustom;
import cn.besbing.model.mapper.third.ThirdCustom;
import cn.besbing.server.service.slave.ISlaveCustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IThirdCustomServiceImpl implements ISlaveCustomService {

    @Autowired(required = false)
    ThirdCustom thirdCustom;

    public String TestConnection(){
        return thirdCustom.selectOne("select id from task where id = 1");
    }

}
