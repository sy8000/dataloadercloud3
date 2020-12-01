package cn.besbing.server.controllers.load;

import cn.besbing.client.enums.BaseResponse;
import cn.besbing.client.enums.StatusCode;
import cn.besbing.model.entities.primary.Product;
import cn.besbing.model.entities.primary.ProductKey;
import cn.besbing.model.entities.primary.Project;
import cn.besbing.model.utils.PageDataResult;
import cn.besbing.model.utils.SearchDTO;
import cn.besbing.server.service.general.GeneratedPageDataResult;
import cn.besbing.server.service.lims.LimsTransCheck;
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

    @Autowired
    PrimaryProductServiceImpl productService;

    @Autowired
    LimsTransCheck limsTransCheck;

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
            List<String> qybzList = customService.selectAsList("select pg.sampling_point from product_grade pg where pg.product = '" + paramArr[2] + "' and pg.version =  " + paramArr[1] );
            for (int i = 0 ; i < qybzList.size() ;i++){
                jsonObject.put(String.valueOf(i),qybzList.get(i));
            }
            baseResponse.setData(jsonObject);
        }catch (Exception e){
            baseResponse = new BaseResponse(StatusCode.DBSELECTFAILED.getCode(),e.getMessage());
        }
        return baseResponse;
    }


    @GetMapping("getjglx")
    public BaseResponse getjglx(@RequestParam("param") String param) {
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        JSONObject jsonObject = new JSONObject();
        try {
            String[] paramArr = param.split(":");
            //select pg.sampling_point  product_grade pg where pg.product = '传进来的企票' and pg.version = '产品系列:后的版本'
            List<String> qybzList = customService.selectAsList("select distinct pg.grade from product_grade pg where pg.product = '" + paramArr[2] + "' and pg.version =  " + paramArr[1] );
            for (int i = 0 ; i < qybzList.size() ;i++){
                jsonObject.put(String.valueOf(i),qybzList.get(i));
            }
            baseResponse.setData(jsonObject);
        }catch (Exception e){
            baseResponse = new BaseResponse(StatusCode.DBSELECTFAILED.getCode(),e.getMessage());
        }
        return baseResponse;
    }


    @GetMapping("getcdlx")
    public BaseResponse getcdlx(@RequestParam("param") String param) {
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        JSONObject jsonObject = new JSONObject();
        try {
            String[] paramArr = param.split(":");
            //select distinct p.c_allowed_contact
            //                     from product_grade pg,product p
            //                    where pg.product = 'QFVF4039-2016'
            //                      and pg.version = 1 and pg.sampling_point = '005D-镀金触点'  and pg.grade = '单稳态'
            //                      and pg.product = p.name
            List<String> qybzList = customService.selectAsList("select distinct p.c_allowed_contact from " +
                    "product_grade pg,product p where pg.product = '" + paramArr[2] + "' and pg.version = " + paramArr[1] + " and " +
                    "pg.sampling_point = '" + paramArr[3] + "'  and pg.grade = '" + paramArr[4] + "' and pg.product = p.name");
            if (qybzList.size() <= 0 || qybzList.size() > 1){
                baseResponse = new BaseResponse(StatusCode.DBSELECTFAILED.getCode(),"该产品系列、企标、结构类型下，触点类型不唯一");
            }else{
                String contacts = "";
                for (String contact : qybzList){
                    contacts = contact;
                }
                String contactArr[] = contacts.split(",");
                for (int i = 0; i < contactArr.length; i++){
                    jsonObject.put(String.valueOf(i),contactArr[i]);
                }
                baseResponse.setData(jsonObject);
            }
        }catch (Exception e){
            baseResponse = new BaseResponse(StatusCode.DBSELECTFAILED.getCode(),e.getMessage());
        }
        return baseResponse;
    }

    @GetMapping("showAllAction")
    public BaseResponse showAllAction(@RequestParam("param") String param) {
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        JSONObject jsonObject = new JSONObject();
        try {
            String[] paramArr = param.split(":");
            //获取试验前信息
            String initSql = customService.selectOne("select sql_text from sql_records where sql_code = 'init_show'");
            initSql = initSql.replace("sheny1",paramArr[2]);
            initSql = initSql.replace("sheny2",paramArr[1]);
            initSql = initSql.replace("sheny3",paramArr[3]);
            initSql = initSql.replace("sheny4",paramArr[4]);
            initSql = initSql.replace("sheny5",paramArr[5]);
            List<String> initList = customService.selectAsList(initSql);
            //获取试验后信息
            String afterSql = customService.selectOne("select sql_text from sql_records where sql_code = 'after_show'");
            afterSql = afterSql.replace("sheny1",paramArr[2]);
            afterSql = afterSql.replace("sheny2",paramArr[1]);
            afterSql = afterSql.replace("sheny3",paramArr[3]);
            afterSql = afterSql.replace("sheny4",paramArr[4]);
            afterSql = afterSql.replace("sheny5",paramArr[5]);
            List<String> afterList = customService.selectAsList(afterSql);
            //获取可能存在的问题
            List<String> problemList = new ArrayList<>();
            /**
             * testlist_nc_prod_list,testlist_nc_test_list,testlist_nc_basprod_name,testlist_nc_basprod_type,testlist_nc_basen_type,
             * testlist_nc_basprod_point,testlist_nc_basprod_struct,testlist_nc_basprod_contact,testlist_nc_basprod_temp,
             * c,testlist_nc_task_addunion,testlist_nc_testlist_comp,testlist_nc_test_after
             */

            List<String> problemsList = new ArrayList<>();
            Product product = productService.getProductByPrimary(paramArr[2],Long.valueOf(paramArr[1]));
            //System.out.println(product);
            List<String> modelList = new ArrayList<>();
            modelList.add("testlist_nc_prod_list");
            modelList.add("testlist_nc_test_list");
            modelList.add("testlist_nc_basprod_name");
            modelList.add("testlist_nc_basprod_type");
            modelList.add("testlist_nc_basen_type");
            modelList.add("testlist_nc_basprod_point");
            modelList.add("testlist_nc_basprod_struct");
            modelList.add("testlist_nc_basprod_contact");
            modelList.add("testlist_nc_basprod_temp");
            modelList.add("testlist_nc_test_init");
            modelList.add("testlist_nc_task_addunion");
            modelList.add("testlist_nc_testlist_comp");
            modelList.add("testlist_nc_test_after");
            for (String model : modelList){
                if (limsTransCheck.checkProduct(model,product) == null){problemsList.add(model);}
            }

            //组合结果
            JSONArray problemArr = JSONArray.parseArray(JSON.toJSONString(problemsList));
            JSONArray initArr = JSONArray.parseArray(JSON.toJSONString(initList));
            //jsonObject.put("init",initList);
            //jsonObject.put("after",afterList);
            JSONArray afterArr = JSONArray.parseArray(JSON.toJSONString(afterList));
            jsonObject.put("problems",problemArr);
            jsonObject.put("init",initArr);
            jsonObject.put("after",afterArr);
            baseResponse.setData(jsonObject);
        }catch (Exception e){
            baseResponse = new BaseResponse(StatusCode.DBSELECTFAILED.getCode(),e.getMessage());
        }
        return baseResponse;
    }



}
