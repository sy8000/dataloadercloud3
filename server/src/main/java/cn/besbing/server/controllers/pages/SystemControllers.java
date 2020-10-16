package cn.besbing.server.controllers.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SystemControllers {

    /*druid sql监控界面，当前失效*/
    @GetMapping("/druid/monitor")
    public String druid(){
        return "sql";
    }


}
