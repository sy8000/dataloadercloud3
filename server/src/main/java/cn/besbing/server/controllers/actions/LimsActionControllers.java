package cn.besbing.server.controllers.actions;

import cn.besbing.client.enums.BaseResponse;
import cn.besbing.client.enums.StatusCode;
import cn.besbing.model.entities.primary.CProjLoginSample;
import cn.besbing.model.entities.primary.QcCommissionB;
import cn.besbing.model.entities.primary.StorageLocation;
import cn.besbing.server.service.lims.LabWareLimsFlowJump;
import cn.besbing.server.service.lims.LabWareLimsFlowProcess;
import cn.besbing.server.service.primary.*;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
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
 */

@RestController
@RequestMapping("limsaction")
public class LimsActionControllers {

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

}
