package cn.besbing.server.config.shiro;


import cn.besbing.model.entities.primary.SmUser;
import cn.besbing.server.service.primary.impl.PrimarySmuserServiceImpl;
import org.apache.catalina.User;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoader;

import java.util.ArrayList;
import java.util.List;


public class CustomRealm extends AuthorizingRealm {

    {
        super.setName("customRealm");
    }

    @Autowired
    private PrimarySmuserServiceImpl primarySmuserService;


    /**
     * @param principalCollection 传过来的凭证
     * @return add了roles和permissions后的AuthorizationInfo
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        return authorizationInfo;
    }

    /**
     *
     * @param authenticationToken   usernameandpasswordtoken
     * @return   传进来的token
     * @throws AuthenticationException   校验不通过的返回
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = (String) authenticationToken.getPrincipal();
        String pwd = new String((char[])authenticationToken.getCredentials());
        SmUser smUser = primarySmuserService.selectUserByCode(username);
        if (smUser != null && !"".equals(pwd) && pwd.equals(smUser.getUserPassword())){
            return new SimpleAuthenticationInfo(smUser.getUserName(), smUser.getUserPassword(),"customRealm");
        }else {
            return null;
        }
    }
}

