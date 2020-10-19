package cn.besbing.server.service.slave;

import cn.besbing.model.mapper.slave.SlaveCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ISlaveCustomServiceImpl {

    @Autowired(required = false)
    SlaveCustom slaveCustom;

    public String TestConnection(){
        return slaveCustom.selectOne("SELECT select_priv FROM db WHERE db='test\\_%'");
    }

}
