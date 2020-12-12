package cn.besbing.server.controllers.actions;

import cn.besbing.client.enums.BaseResponse;
import cn.besbing.client.enums.StatusCode;
import cn.besbing.model.entities.primary.CProjLoginSample;
import cn.besbing.model.entities.primary.QcCommissionB;
import cn.besbing.model.entities.primary.StorageLocation;
import cn.besbing.server.service.lims.LabWareLimsFlowJump;
import cn.besbing.server.service.lims.LabWareLimsFlowProcess;
import cn.besbing.server.service.primary.*;
import cn.besbing.server.utils.AbstractLog;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;
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
@RequestMapping("limsaction")
public class LimsActionControllers extends AbstractLog {

    @Autowired
    PrimaryCProjLoginSampleServiceImpl primaryCProjLoginSampleService;

    @Autowired
    PrimaryQcCommissionB primaryQcCommissionB;

    @Autowired
    PrimaryQcCmmissionHServiceImpl primaryQcCmmissionHService;

    @Autowired
    PrimarySampleServiceImpl primarySampleService;

    @Autowired
    private LabWareLimsFlowProcess limsFlowProcess;

    @Autowired
    private PrimaryStorageLocationServiceImpl storageLocationService;

    @Autowired
    private PrimaryDlSampleTypeServiceImpl sampleTypeService;

    /**
     * 样品接收动作
     * @param jsonStr
     * @return
     */
    @PostMapping(value = "getSample")
    public BaseResponse getSample(@RequestBody String jsonStr) {
        /**样品接收按钮控制器**/
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        //sample标志位
        limsFlowProcess.sampleReceive(jsonObject.get("project").toString(),jsonObject.get("locationNumber").toString());
        return baseResponse;
    }


    @PostMapping("editproj")
    public BaseResponse editproj(CProjLoginSample projLoginSample){
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        try{
            CProjLoginSample searchCpls = primaryCProjLoginSampleService.selectProjectInfobyPrimary(projLoginSample.getSeqNum().toString());
            String prodNameOld = searchCpls.getProdname();
            String pkQcmh = primaryQcCmmissionHService.getQchPrimary(searchCpls.getProject());
            searchCpls.setProdname(projLoginSample.getProdname());
            searchCpls.setOtherReq(projLoginSample.getOtherReq());
            searchCpls.setEnOtherReq(projLoginSample.getEnOtherReq());
            List<QcCommissionB> qcbList = primaryQcCommissionB.getQcbByProject(pkQcmh,prodNameOld);
            if (qcbList.size() > 0){
                for (QcCommissionB qcCommissionB : qcbList){
                    qcCommissionB.setTypeno(searchCpls.getProdname());
                    qcCommissionB.setOtherinfo(searchCpls.getOtherReq());
                    primaryQcCommissionB.update(qcCommissionB);
                }
            }
            primaryCProjLoginSampleService.save(searchCpls);
        }catch (Exception e){
            baseResponse = new BaseResponse(StatusCode.DBUPDATEFAILED.getCode(),e.getMessage());
        }
        return baseResponse;
    }

    /**
     * 样品驳回动作
     */
    @PostMapping("sampleRejectControllerAction")
    public BaseResponse sampleRejectControllerAction(@RequestBody String jsonStr,String textValue) {
        //System.out.println(jsonStr);
        return limsFlowProcess.projectSampleReject(JSONObject.parseObject(jsonStr),textValue);
    }

    /**
     * 库位清空
     */
    @PostMapping("clearLocationStorage")
    public BaseResponse clearLocationStorage(@RequestBody StorageLocation storageLocation) {
        return storageLocationService.clearLocationStorage(storageLocation);
    }

    /**
     * 出入库类型设置
     */
    @PostMapping("saveSampleType")
    public BaseResponse saveSampleType(String sampleType){
        //System.out.println(sampleType);
        return sampleTypeService.saveType(sampleType);
    }

    /**
     * 取出入库类型
     */
    @GetMapping("getSampleType")
    public BaseResponse getSampleType(){
        return sampleTypeService.getSampleType();
    }


    /**
     * 测试组领取样品信息
     */
    @PostMapping("getTaskInfoForGroupReceive")
    public BaseResponse getTaskInfoForGroupReceive(@RequestBody String taskId){
        JSONObject jsonObject = JSONObject.parseObject(taskId.replace("\"",""));
        return new BaseResponse(404,"aaa");
    }

    /**
     * 报告重签
     */

    @RequestMapping(value = "/uploadReport")
    @ResponseBody
    //
    public synchronized Map<String, Object> uploadReports(MultipartFile file, HttpServletRequest request) {
        JSONObject jsonObject = new JSONObject();
        Map<String,Object> map = new HashMap<String,Object>();
        Map<String,Object> imagePath = new HashMap<String,Object>();
        try{
            logger.info("-------------------{}",file.getOriginalFilename());
            InputStream inputStream = file.getInputStream();
            byte[] data = readInputStream(inputStream);
            String name = "d:/resignReport/" + file.getOriginalFilename();
            String suffixName = name.substring(name.lastIndexOf("."));
            File reportFile = new File(name);
            if (reportFile.exists()){
                reportFile.delete();
            }
            //创建输出流
            FileOutputStream outStream = new FileOutputStream(reportFile);
            //写入数据
            outStream.write(data);
            //关闭输出流
            inputStream.close();
            outStream.flush();
            outStream.close();
            /*jsonObject.put("code",0);
            jsonObject.put("msg","success");
            jsonObject.put("data",reportFile);*/
            map.put("code",0);
            map.put("msg","success");
            map.put("data",reportFile);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("报告上传错误，错误：{}",e.getStackTrace());
        }
        return map;
    }


    public static byte[] readInputStream(InputStream inStream) throws Exception {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        //创建一个Buffer字符串
        byte[] buffer = new byte[1024];
        //每次读取的字符串长度，如果为-1，代表全部读取完毕
        int len = 0;
        //使用一个输入流从buffer里把数据读取出来
        while ((len = inStream.read(buffer)) != -1) {
            //用输出流往buffer里写入数据，中间参数代表从哪个位置开始读，len代表读取的长度
            outStream.write(buffer, 0, len);
        }
        //关闭输入流
        inStream.close();
        byte[] returnVar = outStream.toByteArray();
        outStream.flush();
        outStream.close();
        //把outStream里的数据写入内存
        return returnVar;
    }

}
