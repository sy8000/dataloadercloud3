package cn.besbing.server.controllers.test;

import cn.besbing.client.enums.BaseResponse;
import cn.besbing.client.enums.StatusCode;
import cn.besbing.model.entities.primary.DlPermission;
import cn.besbing.model.entities.primary.Dual;
import cn.besbing.server.service.general.GeneratedTranslateImpl;
import cn.besbing.server.service.primary.PrimaryDlPermissionServiceImpl;
import cn.besbing.server.service.primary.PrimaryDualServiceImpl;
import cn.besbing.server.utils.translate.TransApi;
import cn.besbing.wechat.test.TestPojo;
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

    @Autowired
    GeneratedTranslateImpl translateImpl;

    TestPojo testPojo = new TestPojo();

    @Value("${token}")
    private String token;

    @RequestMapping(value = "restful",method = RequestMethod.GET)
    public BaseResponse info(){

        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        try {
            testPojo.setName("abc");
            baseResponse.setData(token + "++++++" + testPojo.getName());

        }catch (Exception e){
            baseResponse = new BaseResponse(StatusCode.FAILED.getCode(),e.getMessage());
        }
        return baseResponse;
    }

    @RequestMapping(value = "permission",method = RequestMethod.GET)
    public List<DlPermission> primaryDb(){

        return permissionService.allPermission(null);
    }

    @RequestMapping(value = "translate",method = RequestMethod.GET)
    public String translate(){
        // 在平台申请的APP_ID 详见 http://api.fanyi.baidu.com/api/trans/product/desktop?req=developer
        /*String APP_ID = "20201029000602084";
        String SECURITY_KEY = "G8dmW8nqKGWJx2Uw6DpU";
        TransApi api = new TransApi(APP_ID, SECURITY_KEY);
        String query = "沈洋真是一个天才啊";
        return api.getTransResult(query, "auto", "en");*/
        return translateImpl.translateText("所有产品经理都是王八蛋","en");
    }


}
