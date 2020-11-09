package cn.besbing.server.controllers.actions;

import cn.besbing.client.enums.BaseResponse;
import cn.besbing.client.enums.StatusCode;
import cn.besbing.model.entities.primary.CProjLoginSample;
import cn.besbing.model.entities.primary.QcCommissionB;
import cn.besbing.server.service.lims.LabWareLimsFlowJump;
import cn.besbing.server.service.lims.LabWareLimsFlowProcess;
import cn.besbing.server.service.primary.PrimaryCProjLoginSampleServiceImpl;
import cn.besbing.server.service.primary.PrimaryQcCmmissionHServiceImpl;
import cn.besbing.server.service.primary.PrimaryQcCommissionB;
import cn.besbing.server.service.primary.PrimarySampleServiceImpl;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public BaseResponse sampleRejectControllerAction(@RequestBody String jsonStr) {
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        System.out.println(jsonStr);
        return baseResponse;
    }

}
