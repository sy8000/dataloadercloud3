package cn.besbing.server.controllers.pages;

import cn.besbing.model.entities.primary.DlPermission;
import cn.besbing.model.entities.primary.DlRole;
import cn.besbing.model.entities.primary.SmUser;
import cn.besbing.server.service.primary.PrimaryDlPermissionServiceImpl;
import cn.besbing.server.service.primary.PrimaryDlRoleServiceImpl;
import cn.besbing.server.service.primary.PrimarySmuserServiceImpl;
import cn.besbing.server.utils.AbstractLog;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("dlcsystem")
@Controller
public class DataloaderCloudSystemControllers extends AbstractLog {

    @Autowired
    private PrimaryDlPermissionServiceImpl dlPermissionService;

    @Autowired
    private PrimaryDlRoleServiceImpl dlRoleService;

    @Autowired
    private PrimarySmuserServiceImpl smuserService;

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


    /**
     * 新增角色控制器
     * /dlcsystem/addrole
     */
    @GetMapping("addrole")
    public String addrole(){
        return "pages/dataloader/role/addrole";
    }

    /**
     * 查看角色控制器
     * /dlcsystem/viewrole
     */
    @GetMapping("viewrole")
    public String viewrole(Model model, String roleid) {
        try{
            DlRole dlRole = dlRoleService.selectRolebyPrimary(roleid.trim());
            model.addAttribute("role",dlRole);
        }catch (Exception e){
            logger.error(this.getClass() + "error:" + e.getStackTrace());
        }
        return "pages/dataloader/role/viewrole";
    }

    @GetMapping("editrole")
    public String editrole(Model model, String roleid) {
        try{
            DlRole dlRole = dlRoleService.selectRolebyPrimary(roleid);
            model.addAttribute("role",dlRole);
        }catch (Exception e){
            logger.error(this.getClass() + "error:" + e.getStackTrace());
        }
        return "pages/dataloader/role/editrole";
    }


    /**
     * 新增用户控制器
     * /dlcsystem/adduser
     */
    @GetMapping("adduser")
    public String adduser(){
        return "pages/dataloader/user/adduser";
    }

    /**
     * 查看用户控制器
     * /dlcsystem/viewuser
     */
    @GetMapping("viewuser")
    public String viewuser(Model model, String cuserid) {
        try{
            SmUser smUser = smuserService.selectByPrimaryKey(cuserid);
            model.addAttribute("user",smUser);
        }catch (Exception e){
            logger.error(this.getClass() + "error:" + e.getStackTrace());
        }
        return "pages/dataloader/user/viewuser";
    }

    @GetMapping("edituser")
    public String edituser(Model model, String cuserid) {
        try{
            SmUser smUser = smuserService.selectByPrimaryKey(cuserid);
            model.addAttribute("user",smUser);
        }catch (Exception e){
            logger.error(this.getClass() + "error:" + e.getStackTrace());
        }
        return "pages/dataloader/user/edituser";
    }


    /**
     * 翻译页面
     */
    @GetMapping("translate")
    public String maincontent(){
        return "pages/dataloader/translatepopright";
    }


    /**
     * 问题反馈页面
     */
    @GetMapping("offline")
    public String offline(Model model){
        //获取有接收消息权限的人，填充页面的select
        List<SmUser> userList = smuserService.selectUserForDlpSelect();
        model.addAttribute("userList",userList);
        return "pages/dataloader/dlp/offline";
    }


    /**
     * 重置密码跳转
     * @return
     */
    @RequestMapping(value = "/resetPass",method = RequestMethod.GET)
    public String validurl(){
        return "/pages/dataloader/mail/ResetPassword";
    }

    @RequestMapping(value = "forgetPass",method = RequestMethod.GET)
    public String forgetPass(){
        return "/pages/dataloader/mail/ForgetPassword";
    }

}
