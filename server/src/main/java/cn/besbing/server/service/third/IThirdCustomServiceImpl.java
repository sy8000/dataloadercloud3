package cn.besbing.server.service.third;

import cn.besbing.model.mapper.third.ThirdCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IThirdCustomServiceImpl {

    @Autowired(required = false)
    ThirdCustom thirdCustom;

    public String TestConnection(){
        return thirdCustom.selectOne("select id from task where id = 1");
    }

}
