package cn.besbing.server.config.shiro;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.apache.shiro.mgt.SecurityManager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

@Configuration
public class ShiroConfig {

    @Bean("shiroFilterFactoryBean")
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {
        System.out.println("ShiroConfiguration.shirFilter()");
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        //拦截器.
        Map<String,String> filterChainDefinitionMap = new LinkedHashMap<String,String>();

        // 配置不会被拦截的链接 顺序判断
        filterChainDefinitionMap.put("/static/**", "anon");
        filterChainDefinitionMap.put("/loading/**", "anon");
        filterChainDefinitionMap.put("/action/login", "anon");
        filterChainDefinitionMap.put("/test/**", "anon");
        /**
         * 暂时放出的费用确认
         */

        filterChainDefinitionMap.put("/lims/confirmcharge", "anon");
        filterChainDefinitionMap.put("/loading/getConfirmChargeData", "anon");
        filterChainDefinitionMap.put("/dlclims/viewcharge", "anon");
        /**  暂时放出结束  */

        filterChainDefinitionMap.put("/forgetPass", "anon");
        filterChainDefinitionMap.put("/resetPwd", "anon");
        filterChainDefinitionMap.put("/resetPass", "anon");
        filterChainDefinitionMap.put("/report", "anon");
        filterChainDefinitionMap.put("/confirmPassword", "anon");
        filterChainDefinitionMap.put("/validurl", "anon");
        filterChainDefinitionMap.put("/taskProcess", "anon");
        filterChainDefinitionMap.put("/AllTaskProgess", "anon");
        filterChainDefinitionMap.put("/getParameters", "anon");
        filterChainDefinitionMap.put("/upLoadParameters", "anon");
        filterChainDefinitionMap.put("/getAllUserFromLims", "anon");
        filterChainDefinitionMap.put("/downloadImage", "anon");
        filterChainDefinitionMap.put("/curtail", "anon");
        //参数查询
        filterChainDefinitionMap.put("/getAllTaskUnDownload", "anon");
        //配置退出 过滤器,其中的具体的退出代码Shiro已经替我们实现了
        filterChainDefinitionMap.put("/logout", "logout");
        //<!-- 过滤链定义，从上向下顺序执行，一般将/**放在最为下边 -->:这是一个坑呢，一不小心代码就不好使了;

        filterChainDefinitionMap.put("/itf/**", "anon");
        //<!-- authc:所有url都必须认证通过才可以访问; anon:所有url都都可以匿名访问-->
        //filterChainDefinitionMap.put("/**", "anoc");
        //开放登录页，第35行会报错
        filterChainDefinitionMap.put("/login","anon");
        // 如果不设置默认会自动寻找Web工程根目录下的"/login.jsp"页面
        shiroFilterFactoryBean.setLoginUrl("/login");
        filterChainDefinitionMap.put("/**", "authc");

        // 登录成功后要跳转的链接
        shiroFilterFactoryBean.setSuccessUrl("/dataloader");
        //未授权界面;
        shiroFilterFactoryBean.setUnauthorizedUrl("/403");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);


		/*
		// 配置退出过滤器,其中的具体的退出代码Shiro已经替我们实现了
		filterChainDefinitionMap.put("/logout", "logout");

		// <!-- 过滤链定义，从上向下顺序执行，一般将 /**放在最为下边 -->:这是一个坑呢，一不小心代码就不好使了;
		// <!-- authc:所有url都必须认证通过才可以访问; anon:所有url都都可以匿名访问-->
		filterChainDefinitionMap.put("/login", "anon");//anon 可以理解为不拦截
		filterChainDefinitionMap.put("/**", "authc");

		//未授权界面;
		shiroFilterFactoryBean.setUnauthorizedUrl("/403");
		*/
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }

    @Bean(name="defaultWebSecurityManager")	//创建DefaultWebSecurityManager
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm")CustomRealm userRealm){
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        defaultWebSecurityManager.setRealm(userRealm);
        return defaultWebSecurityManager;

    }

    //创建Realm
    @Bean(name="userRealm")
    public CustomRealm getUserRealm(){
        return new CustomRealm();
    }

    @Bean
    public ShiroDialect shiroDialect() {
        return new ShiroDialect();
    }


    /**
     * 开启AOP权限校验
     */

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager){
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }
    /*
    异常处理
     */
    @Bean(name = "simpleMappingExceptionResolver")
    public SimpleMappingExceptionResolver createSimpleMappingExceptionResolver(){
        SimpleMappingExceptionResolver simpleMappingExceptionResolver = new SimpleMappingExceptionResolver();
        Properties properties = new Properties();
        //数据库异常
        properties.setProperty("DataBase Exception","databaseError");
        //未经认证
        properties.setProperty("UnauthorizedException","error/401");
        //None by default
        simpleMappingExceptionResolver.setExceptionMappings(properties);
        //No default
        simpleMappingExceptionResolver.setDefaultErrorView("error");
        //Default is "exception"
        simpleMappingExceptionResolver.setExceptionAttribute("ex");
        return simpleMappingExceptionResolver;
    }




}
