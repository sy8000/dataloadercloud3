package cn.besbing.server.service.general;/*
*   Xiamen HLYY Network Technology Co., Ltd.
*       DataLoader Cloud
*   @Author sheny
*   @Date 2020/10/16  11:46 
    @Version 1.0
    @Site https://besbing.cn
    @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
*/

import cn.besbing.model.entities.primary.SmUser;
import cn.besbing.server.service.primary.PrimarySmuserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.geasy.NC6PasswordUtil;

import java.util.Map;

@Service
public class GeneratedEncryptionAndDecryptionImpl {

    @Autowired(required = false)
    PrimarySmuserServiceImpl primarySmuserService;

    public String getUserPasswordEncryption(Map<String,Object> userInfo){
        SmUser smUser = primarySmuserService.selectUserByCode(userInfo.get("username").toString());
        return NC6PasswordUtil.getEncodedPassword(smUser.getCuserid(),userInfo.get("pwd").toString());
    }

}
