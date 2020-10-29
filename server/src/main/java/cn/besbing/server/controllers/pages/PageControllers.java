package cn.besbing.server.controllers.pages;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageControllers {

    /**
     * 首页登录控制器
     * @return
     */
    @GetMapping("login")
    public String loginToIndex(){
        return "index";
    }

    @GetMapping("/")
    public String basePathToIndex(){
        return "index";
    }

    /**
     * 用户名密码页跳转至欢迎页
     */
    @GetMapping("/welcome")
    public String loginToMain(){
        return "main/main";
    }

    /**
     * 框架的主页内容
     */
    @GetMapping("maincontenet")
    public String maincontent(){
        return "pages/maincontent";
    }



}
