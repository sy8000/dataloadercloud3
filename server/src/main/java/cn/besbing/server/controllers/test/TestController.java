package cn.besbing.server.controllers.test;

import cn.besbing.client.enums.BaseResponse;
import cn.besbing.client.enums.StatusCode;
import cn.besbing.model.entities.primary.DlPermission;
import cn.besbing.model.entities.primary.Dual;
import cn.besbing.server.service.primary.PrimaryDlPermissionServiceImpl;
import cn.besbing.server.service.primary.PrimaryDualServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {


    @Autowired
    PrimaryDualServiceImpl primaryDualService;

    @Autowired
    PrimaryDlPermissionServiceImpl permissionService;

    @Value("${token}")
    private String token;

    @RequestMapping(value = "restful",method = RequestMethod.GET)
    public BaseResponse info(){

        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        try {
            baseResponse.setData(token);

        }catch (Exception e){
            baseResponse = new BaseResponse(StatusCode.FAILED.getCode(),e.getMessage());
        }
        return baseResponse;
    }

    @RequestMapping(value = "permission",method = RequestMethod.GET)
    public List<DlPermission> primaryDb(){

        return permissionService.allPermission(null);
    }

}
