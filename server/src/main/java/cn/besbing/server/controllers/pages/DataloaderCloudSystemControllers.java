package cn.besbing.server.controllers.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("dlcsystem")
@Controller
public class DataloaderCloudSystemControllers {

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
     * 新增、编辑权限控制器
     * /dlcsystem/addeditpermission
     */
    @GetMapping("addpermission")
    public String addeditpermission(){
        return "pages/dataloader/permission/addpermission";
    }

}
