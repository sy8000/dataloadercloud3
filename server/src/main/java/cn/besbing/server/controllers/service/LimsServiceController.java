package cn.besbing.server.controllers.service;/*
*   Xiamen HLYY Network Technology Co., Ltd.
*       DataLoader Cloud
*   @Author sheny
*   @Date 2020/11/19  15:50 
    @Version 1.0
    @Site https://besbing.cn
    @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
*/

import cn.besbing.client.enums.BaseResponse;
import cn.besbing.client.enums.StatusCode;
import cn.besbing.server.service.lims.LimsParamService;
import com.alibaba.fastjson.JSONObject;
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

    @GetMapping("getParameter")
    public BaseResponse getParaInit(String taskId,String type){
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        try {
            if ("init".equals(type)){
                baseResponse.setData(paramService.getInitParam(taskId));
            }
            if ("after".equals(type)){
                baseResponse.setData(paramService.getAfterParam(taskId));
            }
            if (!"init".equals(type) && !"after".equals(type)){
                baseResponse = new BaseResponse(StatusCode.FAILED.getCode(),"无效的传入类型，传入类型只允许为init或after");
            }
        }catch (Exception e){
            baseResponse = new BaseResponse(StatusCode.FAILED.getCode(),e.getMessage());
        }
        return baseResponse;
    }


}
