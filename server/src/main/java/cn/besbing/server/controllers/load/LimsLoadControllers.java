package cn.besbing.server.controllers.load;

import cn.besbing.model.entities.primary.Project;
import cn.besbing.model.utils.PageDataResult;
import cn.besbing.model.utils.SearchDTO;
import cn.besbing.server.service.general.GeneratedPageDataResult;
import cn.besbing.server.service.primary.*;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 */


@RestController
@RequestMapping("loading")
public class LimsLoadControllers {

    @Autowired
    private PrimaryProjectServiceImpl projectService;


    @Autowired
    GeneratedPageDataResult generatedPageDataResult;


    @Autowired
    private PrimaryCProjLoginSampleServiceImpl cProjLoginSampleService;

    @Autowired
    private PrimaryCProjTaskCoreServiceImpl taskCoreService;

    @Autowired
    private PrimaryLwSampleReceiveViewServiceImpl sampleReceiveViewService;

    @Autowired
    private PrimaryStorageLocationServiceImpl storageLocationService;

    /**
     * 样品接收仓库选择页
     */
    @GetMapping("receiveConfirm")
    public PageDataResult receiveConfirm(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit, @RequestParam(value = "keyword", required = false) String keyword){
        //自助服务：修改委托单load
        if (null == page){
            page = 1;
        }
        if (null == limit){
            limit = 10;
        }
        if (keyword != null && !"".equals(keyword)) {
            JSONObject jsonObject = JSONObject.parseObject(keyword);
            keyword = jsonObject.get("name").toString().toUpperCase();
        }
        SearchDTO searchDTO = new SearchDTO(page,limit,keyword);
        try {
            PageDataResult pdr = generatedPageDataResult.createFormatedTableData(searchDTO,storageLocationService.getSampleReceiveList(searchDTO));
            return pdr;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 自助服务：获取待修改委托单列表
     */
    @GetMapping("/getselectbymodule")
    public PageDataResult getselectbymodule(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit, @RequestParam(value = "keyword", required = false) String keyword){
        //自助服务：修改委托单load
        if (null == page){
            page = 1;
        }
        if (null == limit){
            limit = 10;
        }
        if (keyword != null && !"".equals(keyword)) {
            JSONObject jsonObject = JSONObject.parseObject(keyword);
            keyword = jsonObject.get("billno").toString();
        }
        SearchDTO searchDTO = new SearchDTO(page,limit,keyword);
        try {
            PageDataResult pdr = generatedPageDataResult.createFormatedTableData(searchDTO,cProjLoginSampleService.getProjectForTable(searchDTO));
            return pdr;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/getConfirmChargeData")
    public PageDataResult getConfirmChargeData(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit, @RequestParam(value = "keyword", required = false) String keyword){
        //自助服务：查看待确认收费单结果
        if (null == page){
            page = 1;
        }
        if (null == limit){
            limit = 10;
        }
        if (keyword != null && !"".equals(keyword)) {
            JSONObject jsonObject = JSONObject.parseObject(keyword);
            keyword = jsonObject.get("billno").toString();
        }
        SearchDTO searchDTO = new SearchDTO(page,limit,keyword);
        try {
            PageDataResult pdr = generatedPageDataResult.createFormatedTableData(searchDTO,taskCoreService.getAllTask(searchDTO));
            return pdr;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("sampleReceive")
    public PageDataResult getsampleReceiveData(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit, @RequestParam(value = "keyword", required = false) String keyword){
        if (null == page){
            page = 1;
        }
        if (null == limit){
            limit = 10;
        }
        if (keyword != null && !"".equals(keyword)) {
            JSONObject jsonObject = JSONObject.parseObject(keyword);
            keyword = jsonObject.get("project").toString();
        }
        SearchDTO searchDTO = new SearchDTO(page,limit,keyword);
        try {
            PageDataResult pdr = generatedPageDataResult.createFormatedTableData(searchDTO,sampleReceiveViewService.getSampleReceiveForTable(searchDTO));
            return pdr;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
