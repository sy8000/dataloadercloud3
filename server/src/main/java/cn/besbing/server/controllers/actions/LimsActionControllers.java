package cn.besbing.server.controllers.actions;

import cn.besbing.client.enums.BaseResponse;
import cn.besbing.client.enums.StatusCode;
import cn.besbing.model.entities.primary.CProjLoginSample;
import cn.besbing.model.entities.primary.DlPermission;
import cn.besbing.server.service.primary.PrimaryCProjLoginSampleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Xiamen HLYY Network Technology Co., Ltd.
 * DataLoader Cloud
 *
 * @Author sheny
 * @Date 2020/10/16  14:24
 * @Version 1.0
 * @Site https://besbing.cn
 * @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
 */

@RestController
@RequestMapping("limsaction")
public class LimsActionControllers {

    @Autowired
    PrimaryCProjLoginSampleServiceImpl primaryCProjLoginSampleService;

    @PostMapping("editproj")
    public BaseResponse editproj(CProjLoginSample projLoginSample){
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        try{

        }catch (Exception e){

        }
        return null;
    }


}
