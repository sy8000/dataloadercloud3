package cn.besbing;

import cn.besbing.model.entities.primary.SmUser;
import cn.besbing.server.service.primary.impl.PrimarySmuserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ServerApplicationTests {

    @Autowired
    PrimarySmuserServiceImpl primarySmuserService;

    @Test
    void contextLoads() {
        try{
            SmUser smUser = primarySmuserService.selectUserByCode("1002437");
        }catch (Exception e){
            e.getStackTrace();
        }

    }

}
