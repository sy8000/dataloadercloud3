package cn.besbing.server.controllers.load;

import cn.besbing.model.entities.primary.DlPermission;
import cn.besbing.model.entities.primary.DlRole;
import cn.besbing.model.utils.PageDataResult;
import cn.besbing.model.utils.SearchDTO;
import cn.besbing.server.service.general.GeneratedPageDataResult;
import cn.besbing.server.service.primary.PrimaryDlPermissionServiceImpl;
import cn.besbing.server.service.primary.PrimaryDlRoleServiceImpl;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    /**
     * 权限列表加载
     */
    @GetMapping("/dataloaderpermission")
    public PageDataResult permissionList(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit, @RequestParam(value = "keyword", required = false) String keyword) {
        System.out.println("------------------------page="+page + ";limit=" + limit);
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

    @GetMapping("dataloaderrole")
    public PageDataResult rolesList(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit, @RequestParam(value = "keyword", required = false) String keyword){
        if (null == page){
            page = 1;
        }
        if (null == limit){
            limit = 10;
        }
        PageDataResult pdr = new PageDataResult();
        SearchDTO searchDTO = new SearchDTO(page,limit,null);
        List list = roleService.selectRolesForTable(null);
        PageHelper.startPage(searchDTO.getPage(), searchDTO.getLimit(),true);
        PageInfo<DlRole> pageInfo = new PageInfo<>(list);
        pdr.setTotals(Long.valueOf(pageInfo.getTotal()).intValue());
        pdr.setList(list);
        return pdr;
    }

}
