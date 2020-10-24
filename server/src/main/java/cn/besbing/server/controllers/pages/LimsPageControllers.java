package cn.besbing.server.controllers.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("lims")
@Controller
public class LimsPageControllers {

    @GetMapping("projectmodify")
    public String projectmodify(){
        return "pages/lims/serviceforself/projectmodify";
    }


}
