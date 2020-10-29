package cn.besbing.server.controllers.actions;

import cn.besbing.client.enums.BaseResponse;
import cn.besbing.client.enums.StatusCode;
import cn.besbing.model.entities.primary.DlPermission;
import cn.besbing.model.entities.primary.DlRole;
import cn.besbing.model.entities.primary.SmUser;
import cn.besbing.server.service.general.GeneratedPrimaryKeysImpl;
import cn.besbing.server.service.general.GeneratedTranslateImpl;
import cn.besbing.server.service.primary.PrimaryDlPermissionServiceImpl;
import cn.besbing.server.service.primary.PrimaryDlRoleServiceImpl;
import cn.besbing.server.service.primary.PrimarySmuserServiceImpl;
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

    @Autowired
    PrimarySmuserServiceImpl primarySmuserService;

    @Autowired
    GeneratedTranslateImpl generatedTranslate;

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
            baseResponse = new BaseResponse(StatusCode.DBDELETEFAILED.getCode(),e.getMessage());
        }
        return baseResponse;
    }

    @DeleteMapping("delrole")
    public BaseResponse delrole(String roleid){
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        try{
            primaryDlRoleService.deletebyPrimary(roleid.trim());
        }catch (Exception e){
            baseResponse = new BaseResponse(StatusCode.DBDELETEFAILED.getCode(),e.getMessage());
        }
        return baseResponse;
    }

    /**
     * 添加用户
     * @param smUserCommit
     * @return
     */

    @PostMapping("adduser")
    public BaseResponse adduser(SmUser smUserCommit){
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        //双条件验证，如果没有这用户，则去判断有没有这用户的工号
        SmUser userbycode = primarySmuserService.selectUserByCode(smUserCommit.getUserCode().trim());
        if (userbycode == null){
            try{
                //先去查找一个天才的信息为基础数据
                SmUser smUser = primarySmuserService.selectUserByCode("1002437");
                if (smUser != null){
                    smUser.setCuserid(generatedPrimaryKeys.getPrimary(20));
                    smUser.setEmail(smUserCommit.getEmail());
                    smUser.setUserCode(smUserCommit.getUserCode());
                    smUser.setUserName(smUserCommit.getUserName());
                    smUser.setIslocked(smUserCommit.getIslocked());
                    int i = primarySmuserService.save(smUser);
                }else {
                    baseResponse = new BaseResponse(StatusCode.DBSELECTSEARCHFAILED.getCode(),"获取sheny那个天才的信息失败，可能是你的网络挂了");
                }
            }catch (Exception e){
                baseResponse = new BaseResponse(StatusCode.DBINSERTFAILED.getCode(),e.getMessage());
            }
        }else {
            try{
                SmUser smUser = primarySmuserService.selectByPrimaryKey(smUserCommit.getCuserid());
                smUser.setEmail(smUserCommit.getEmail());
                smUser.setUserCode(smUserCommit.getUserCode());
                smUser.setUserName(smUserCommit.getUserName());
                smUser.setIslocked(smUserCommit.getIslocked());
                int i = primarySmuserService.update(smUser);
            }catch (Exception e){
                baseResponse = new BaseResponse(StatusCode.DBUPDATEFAILED.getCode(),e.getMessage());
            }
        }

        return baseResponse;
    }


    @DeleteMapping("deluser")
    public BaseResponse deluser(String cuserid){
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        try{
            primarySmuserService.deletebyPrimary(cuserid.trim());
        }catch (Exception e){
            baseResponse = new BaseResponse(StatusCode.DBDELETEFAILED.getCode(),e.getMessage());
        }
        return baseResponse;
    }

    @GetMapping("translate")
    public BaseResponse translate(Map<String,Object> map ){
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        try{
            baseResponse.setData(generatedTranslate.translateText(map.get("content").toString(),map.get("lang").toString()));
        }catch (Exception e){
            baseResponse = new BaseResponse(StatusCode.BAIDUAPISEARCHFAILED.getCode(),e.getMessage());
        }
        return baseResponse;
    }

}
