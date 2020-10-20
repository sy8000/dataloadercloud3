package cn.besbing.server.controllers.load;

import cn.besbing.model.entities.primary.DlPermission;
import cn.besbing.model.utils.PageDataResult;
import cn.besbing.model.utils.SearchDTO;
import cn.besbing.server.service.general.GeneratedPageDataResult;
import cn.besbing.server.service.primary.PrimaryDlPermissionServiceImpl;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    GeneratedPageDataResult generatedPageDataResult;

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
            return generatedPageDataResult.createFormatedTableData(searchDTO,permissionService.getDataForTable(searchDTO));
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


}
