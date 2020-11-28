package cn.besbing.server.controllers.load;

import cn.besbing.client.enums.BaseResponse;
import cn.besbing.client.enums.StatusCode;
import cn.besbing.model.entities.primary.Project;
import cn.besbing.model.utils.PageDataResult;
import cn.besbing.model.utils.SearchDTO;
import cn.besbing.server.service.general.GeneratedPageDataResult;
import cn.besbing.server.service.primary.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private PrimaryTesterGroupReceiveviewServiceImpl testerGroupReceiveviewService;

    @Autowired
    PrimaryCustomServiceImpl customService;

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


    @GetMapping("clearLocationStorage")
    public PageDataResult clearLocationStorage(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit, @RequestParam(value = "keyword", required = false) String keyword){
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
            PageDataResult pdr = generatedPageDataResult.createFormatedTableData(searchDTO,storageLocationService.getAllNotEmptyLocationStorage(searchDTO));
            return pdr;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("getTestGroupReceive")
    public PageDataResult getTestGroupReceive(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit, @RequestParam(value = "keyword", required = false) String keyword) {
        if (null == page) {
            page = 1;
        }
        if (null == limit) {
            limit = 10;
        }
        if (keyword != null && !"".equals(keyword)) {
            JSONObject jsonObject = JSONObject.parseObject(keyword);
            keyword = jsonObject.get("taskId").toString().toUpperCase();
        }
        SearchDTO searchDTO = new SearchDTO(page, limit, keyword);
        try {
            PageDataResult pdr = generatedPageDataResult.createFormatedTableData(searchDTO,testerGroupReceiveviewService.getTestergroupreceiveview(searchDTO));
            return pdr;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


    @GetMapping("getqybz")
    public BaseResponse getqybz(@RequestParam("param") String param) {
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        JSONObject jsonObject = new JSONObject();
        try {
            String[] paramArr = param.split(":");
            List<String> qybzList = customService.selectAsList("select p.name from product p where p.description = '" + paramArr[0] + "' and p.version = " + paramArr[1] );
            for (int i = 0 ; i < qybzList.size() ;i++){
                jsonObject.put(String.valueOf(i),qybzList.get(i));
            }
            baseResponse.setData(jsonObject);
        }catch (Exception e){
            baseResponse = new BaseResponse(StatusCode.DBSELECTFAILED.getCode(),e.getMessage());
        }
        return baseResponse;
    }

    @GetMapping("getggh")
    public BaseResponse getggh(@RequestParam("param") String param) {
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        JSONObject jsonObject = new JSONObject();
        try {
            String[] paramArr = param.split(":");
            //select pg.sampling_point  product_grade pg where pg.product = '传进来的企票' and pg.version = '产品系列:后的版本'
            List<String> qybzList = customService.selectAsList("select pg.sampling_point  product_grade pg where pg.product = '" + paramArr[2] + "' and pg.version =  " + paramArr[1] );
            for (int i = 0 ; i < qybzList.size() ;i++){
                jsonObject.put(String.valueOf(i),qybzList.get(i));
            }
            baseResponse.setData(jsonObject);
        }catch (Exception e){
            baseResponse = new BaseResponse(StatusCode.DBSELECTFAILED.getCode(),e.getMessage());
        }
        return baseResponse;
    }




}
