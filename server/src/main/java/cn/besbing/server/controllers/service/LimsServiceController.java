package cn.besbing.server.controllers.service;/*
*   Xiamen HLYY Network Technology Co., Ltd.
*       DataLoader Cloud
*   @Author sheny
*   @Date 2020/11/19  15:50 
    @Version 1.0
    @Site https://besbing.cn
    @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
*/

import cn.besbing.server.service.lims.LimsParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service")
public class LimsServiceController {

    @Autowired
    private LimsParamService paramService;

    @GetMapping("getParaInit")
    public String getParaInit(String taskId){
        paramService.getInitParam(taskId);
        return null;
    }


}
