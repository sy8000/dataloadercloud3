package cn.besbing.server.controllers.load;

import cn.besbing.model.entities.primary.DlPermission;
import cn.besbing.model.entities.primary.DlRole;
import cn.besbing.model.utils.PageDataResult;
import cn.besbing.model.utils.SearchDTO;
import cn.besbing.server.service.general.GeneratedPageDataResult;
import cn.besbing.server.service.primary.PrimaryDlPermissionServiceImpl;
import cn.besbing.server.service.primary.PrimaryDlRoleServiceImpl;
import cn.besbing.server.service.primary.PrimarySmuserServiceImpl;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Xiamen HLYY Network Technology Co., Ltd.
 * DataLoader Cloud
 *
 * @Author sheny
 * @Date 2020/10/16  14:24
 * @Version 1.0
 * @Site https://besbing.cn
 * @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
 * <p>
 * 系统数据加载
 */

@RestController
@RequestMapping("loading")
public class SystemLoadControllers {


    @Autowired
    PrimaryDlPermissionServiceImpl permissionService;

    @Autowired
    PrimaryDlRoleServiceImpl roleService;

    @Autowired
    GeneratedPageDataResult generatedPageDataResult;

    @Autowired
    PrimarySmuserServiceImpl primarySmuserService;

    /**
     * 权限列表加载
     */
    @GetMapping("/dataloaderpermission")
    public PageDataResult permissionList(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit, @RequestParam(value = "keyword", required = false) String keyword) {
        if (null == page){
            page = 1;
        }
        if (null == limit){
            limit = 10;
        }
        if (keyword != null && !"".equals(keyword)) {
            JSONObject jsonObject = JSONObject.parseObject(keyword);
            keyword = jsonObject.get("name").toString();
        }
        SearchDTO searchDTO = new SearchDTO(page,limit,keyword);
        try {
            PageDataResult pdr = generatedPageDataResult.createFormatedTableData(searchDTO,permissionService.getDataForTable(searchDTO));
            return pdr;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * !important ***************************************************************
     * dataloaderrole中为第二种写法，列出来写，上面dataloaderpermission是抽出来的正常写法
     * 此处保留仅供自己注意，效率可能相对较低，忍不了了到时候再review吧......
     * PageHelper.startPage(page, limit,true);必须放在马上要执行的语句上方跑，注意执行顺序
     * 老问题了，不是不知道，下次要小心
     * 麻辣隔壁的，今天在这踩坑踩了一下午   2020.10.22
     * **************************************************************************
     * @param page
     * @param limit
     * @return
     */
    @GetMapping("dataloaderrole")
    public PageDataResult rolesList(@RequestParam(value = "page",defaultValue = "1") int page, @RequestParam(value = "limit",defaultValue = "10") int limit){
        PageDataResult pdr = new PageDataResult();
        PageHelper.startPage(page, limit,true);
        List list = roleService.selectRolesForTable();
        PageInfo<DlRole> pageInfo = new PageInfo<>(list);
        /*model.addAttribute("page",pageInfo);*/
        pdr.setTotals(Long.valueOf(pageInfo.getTotal()).intValue());
        pdr.setList(list);
        return pdr;
    }

    /**
     *
     * 用户管理表
     * @param page
     * @param limit
     * @param keyword
     * @return
     */
    @GetMapping("/dataloaderuser")
    public PageDataResult userList(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit, @RequestParam(value = "keyword", required = false) String keyword) {
        if (null == page){
            page = 1;
        }
        if (null == limit){
            limit = 10;
        }
        if (keyword != null && !"".equals(keyword)) {
            JSONObject jsonObject = JSONObject.parseObject(keyword);
            keyword = jsonObject.get("name").toString();
        }
        SearchDTO searchDTO = new SearchDTO(page,limit,keyword);
        try {
            PageDataResult pdr = generatedPageDataResult.createFormatedTableData(searchDTO,primarySmuserService.selectUserForTableFunc(searchDTO));
            return pdr;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }






}
