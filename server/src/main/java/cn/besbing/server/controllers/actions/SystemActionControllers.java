package cn.besbing.server.controllers.actions;

import cn.besbing.client.enums.BaseResponse;
import cn.besbing.client.enums.StatusCode;
import cn.besbing.model.entities.primary.DlPermission;
import cn.besbing.server.service.general.GeneratedPrimaryKeysImpl;
import cn.besbing.server.service.primary.PrimaryDlPermissionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Xiamen HLYY Network Technology Co., Ltd.
 * DataLoader Cloud
 *
 * @Author sheny
 * @Date 2020/10/16  14:24
 * @Version 1.0
 * @Site https://besbing.cn
 * @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
 * 系统动作控制器
 */


@RestController
@RequestMapping("action")
public class SystemActionControllers {

    @Autowired
    PrimaryDlPermissionServiceImpl permissionService;

    @Autowired
    GeneratedPrimaryKeysImpl generatedPrimaryKeys;

    @PostMapping("addpermission")
    public BaseResponse addpermission(DlPermission dlPermission){
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        try{
            dlPermission.setPermissionid(generatedPrimaryKeys.getPrimary(20));
            permissionService.save(dlPermission);
        }catch (Exception e){
            baseResponse = new BaseResponse(StatusCode.DBINSERTFAILED.getCode(),e.getMessage());
        }
        return baseResponse;
    }

}
