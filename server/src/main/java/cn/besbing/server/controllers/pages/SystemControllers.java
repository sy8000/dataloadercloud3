package cn.besbing.server.controllers.pages;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SystemControllers  {

    /*druid sql监控界面，当前失效*/
    @GetMapping("/druid/monitor")
    public String druid(){
        return "sql";
    }






}
