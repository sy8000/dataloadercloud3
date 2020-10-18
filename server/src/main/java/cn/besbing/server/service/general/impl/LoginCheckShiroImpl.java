package cn.besbing.server.service.general.impl;/*
*   Xiamen HLYY Network Technology Co., Ltd.
*       DataLoader Cloud
*   @Author sheny
*   @Date 2020/10/16  14:20 
    @Version 1.0
    @Site https://besbing.cn
    @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
*/

import cn.besbing.client.enums.BaseResponse;
import cn.besbing.client.enums.StatusCode;
import cn.besbing.server.config.shiro.CustomRealm;
import cn.besbing.server.service.general.ILoginCheckShiro;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class LoginCheckShiroImpl implements ILoginCheckShiro {

    @Autowired(required = false)
    private GeneratedEncryptionAndDecryptionImpl generatedEncryptionAndDecryption;

    public BaseResponse checkShiro(Map<String,Object> userinfo){
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        CustomRealm customRealm = new CustomRealm();
        DefaultSecurityManager defaultSecurityManager =  new DefaultSecurityManager();
        defaultSecurityManager.setRealm(customRealm);
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject = SecurityUtils.getSubject();
        try{
            String encryptionPwd = generatedEncryptionAndDecryption.getUserPasswordEncryption(userinfo);
            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userinfo.get("username").toString(), encryptionPwd);
            subject.login(usernamePasswordToken);
            //将subject存进session
            Session session = subject.getSession();
            session.touch();
            session.setAttribute("usercode",userinfo.get("username").toString());
        }catch (
                UnknownAccountException e){
            //用户名不存在
            baseResponse = new BaseResponse(StatusCode.USERNOTEXIST.getCode(),StatusCode.USERNOTEXIST.getMsg());
        }catch (
                IncorrectCredentialsException e) {
            //密码错误
            baseResponse = new BaseResponse(StatusCode.PASSWDERROR.getCode(),StatusCode.PASSWDERROR.getMsg());
        }catch (
                AuthenticationException e) {
            //其它未知错误
            baseResponse = new BaseResponse(StatusCode.OTHERUNKOWERROR.getCode(),"其它未知错误：" + e.getMessage());
        }
        return baseResponse;
    }

}
