package cn.besbing.server.controllers.actions;

import cn.besbing.client.enums.BaseResponse;
import cn.besbing.client.enums.StatusCode;
import cn.besbing.model.entities.primary.DlPermission;
import cn.besbing.model.entities.primary.DlRole;
import cn.besbing.server.service.general.GeneratedPrimaryKeysImpl;
import cn.besbing.server.service.primary.PrimaryDlPermissionServiceImpl;
import cn.besbing.server.service.primary.PrimaryDlRoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    PrimaryDlRoleServiceImpl primaryDlRoleService;

    @Autowired
    GeneratedPrimaryKeysImpl generatedPrimaryKeys;

    /**
     * 添加权限
     * @param dlPermission
     * @return
     */


    @PostMapping("addpermission")
    public BaseResponse addpermission(DlPermission dlPermission){
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        if (dlPermission.getPermissionid() == null || "".equals(dlPermission.getPermissionid()) || dlPermission.getPermissionid() == ""){
            try{
                dlPermission.setPermissionid(generatedPrimaryKeys.getPrimary(20));
                int i = permissionService.save(dlPermission);
            }catch (Exception e){
                baseResponse = new BaseResponse(StatusCode.DBINSERTFAILED.getCode(),e.getMessage());
            }
        }else {
            try{
                int i = permissionService.update(dlPermission);
            }catch (Exception e){
                baseResponse = new BaseResponse(StatusCode.DBUPDATEFAILED.getCode(),e.getMessage());
            }
        }

        return baseResponse;
    }

    /**
     *
     * @param dlRole
     * @return
     */

    @PostMapping("addrole")
    public BaseResponse addrole(DlRole dlRole){
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        if (dlRole.getRoleid() == null || "".equals(dlRole.getRoleid()) || dlRole.getRoleid() == ""){
            try{
                dlRole.setRoleid(generatedPrimaryKeys.getPrimary(20).trim());
                int i = primaryDlRoleService.save(dlRole);
                System.out.println(i);
            }catch (Exception e){
                baseResponse = new BaseResponse(StatusCode.DBINSERTFAILED.getCode(),e.getMessage());
            }
        }else {
            try{
                int i = primaryDlRoleService.update(dlRole);
                System.out.println(i);
            }catch (Exception e){
                baseResponse = new BaseResponse(StatusCode.DBUPDATEFAILED.getCode(),e.getMessage());

            }
        }

        return baseResponse;
    }


    @DeleteMapping("delpermission")
    public BaseResponse delpermission(String dlpermissionid){
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        try{
            permissionService.deletebyPrimary(dlpermissionid);
        }catch (Exception e){
            baseResponse = new BaseResponse(StatusCode.DBINSERTFAILED.getCode(),e.getMessage());
        }
        return baseResponse;
    }

    @DeleteMapping("delrole")
    public BaseResponse delrole(String roleid){
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        try{
            primaryDlRoleService.deletebyPrimary(roleid.trim());
        }catch (Exception e){
            baseResponse = new BaseResponse(StatusCode.DBINSERTFAILED.getCode(),e.getMessage());
        }
        return baseResponse;
    }


}
