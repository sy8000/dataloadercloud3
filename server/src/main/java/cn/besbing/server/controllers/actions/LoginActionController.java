package cn.besbing.server.controllers.actions;


import cn.besbing.client.enums.BaseResponse;
import cn.besbing.server.service.general.ILoginCheckShiro;
import cn.besbing.server.service.general.impl.GeneratedEncryptionAndDecryptionImpl;
import cn.besbing.server.service.general.impl.LoginCheckShiroImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("action")
public class LoginActionController {

    @Autowired
    LoginCheckShiroImpl loginCheckShiro;

    @PostMapping("login")
    public BaseResponse login(@RequestParam Map<String,Object> userinfo ){
        return loginCheckShiro.checkShiro(userinfo);
    }



}
