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


}
