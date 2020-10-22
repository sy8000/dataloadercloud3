package cn.besbing.server.controllers.pages;

import cn.besbing.client.enums.BaseResponse;
import cn.besbing.client.enums.StatusCode;
import cn.besbing.model.entities.primary.DlPermission;
import cn.besbing.server.service.primary.PrimaryDlPermissionServiceImpl;
import cn.besbing.server.utils.AbstractLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("dlcsystem")
@Controller
public class DataloaderCloudSystemControllers extends AbstractLog {

    @Autowired
    private PrimaryDlPermissionServiceImpl dlPermissionService;

    /**
     * 权限跳转控制器
     * /dlcsystem/permissionsmanage
     */
    @GetMapping("permissionsmanage")
    public String primissionsmanage(){
        return "pages/dataloader/primissionsmanage";
    }


    /**
     * 角色跳转控制器
     * /dlcsystem/rolesmanage
     */
    @GetMapping("rolesmanage")
    public String rolesmanage(){
        return "pages/dataloader/rolesmanage";
    }

    /**
     * 用户跳转控制器
     * /dlcsystem/usersmanage
     */
    @GetMapping("usersmanage")
    public String usersmanage(){
        return "pages/dataloader/usersmanage";
    }

    /**
     * 菜单跳转控制器
     * /dlcsystem/menusmanage
     */
    @GetMapping("menusmanage")
    public String menusmanage(){
        return "pages/dataloader/menusmanage";
    }

    /**
     * 新增权限控制器
     * /dlcsystem/addpermission
     */
    @GetMapping("addpermission")
    public String addpermission(){
        return "pages/dataloader/permission/addpermission";
    }

    /**
     * 查看权限控制器
     * /dlcsystem/viewpermission
     */
    @GetMapping("viewpermission")
    public String viewpermission(Model model, String dlpermissionid) {
        try{
            DlPermission dlPermission = dlPermissionService.selectPermissionbyPrimary(dlpermissionid);
            model.addAttribute("permission",dlPermission);
        }catch (Exception e){
            logger.error(this.getClass() + "error:" + e.getStackTrace());
        }
        return "pages/dataloader/permission/viewpermission";
    }

    @GetMapping("editpermission")
    public String editpermission(Model model, String dlpermissionid) {
        try{
            DlPermission dlPermission = dlPermissionService.selectPermissionbyPrimary(dlpermissionid);
            model.addAttribute("permission",dlPermission);
        }catch (Exception e){
            logger.error(this.getClass() + "error:" + e.getStackTrace());
        }
        return "pages/dataloader/permission/editpermission";
    }

}
