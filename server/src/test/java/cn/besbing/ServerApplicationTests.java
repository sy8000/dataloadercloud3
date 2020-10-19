package cn.besbing;

import cn.besbing.model.entities.primary.DlPermission;
import cn.besbing.model.entities.primary.SmUser;
import cn.besbing.server.service.primary.PrimaryDlPermissionServiceImpl;
import cn.besbing.server.service.primary.PrimarySmuserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class ServerApplicationTests {

    @Autowired
    PrimarySmuserServiceImpl primarySmuserService;

    @Autowired
    PrimaryDlPermissionServiceImpl permissionService;

    @Test
    void contextLoads() {
        try{
            //SmUser smUser = primarySmuserService.selectUserByCode("1002437");
            List<DlPermission> list = permissionService.allPermission(null);
            for (DlPermission dlPermission : list){
                System.out.println(dlPermission);
            }
        }catch (Exception e){
            e.getStackTrace();
        }

    }

}
