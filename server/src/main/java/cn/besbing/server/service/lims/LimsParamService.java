package cn.besbing.server.service.lims;/*
*   Xiamen HLYY Network Technology Co., Ltd.
*       DataLoader Cloud
*   @Author sheny
*   @Date 2020/11/19  15:01 
    @Version 1.0
    @Site https://besbing.cn
    @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
*/



import cn.besbing.model.entities.primary.CProjLoginSample;
import cn.besbing.model.entities.primary.CProjTask;
import cn.besbing.model.entities.primary.DlParamAfter;
import cn.besbing.model.entities.primary.DlParamInit;
import cn.besbing.model.mapper.primary.DlParamAfterMapper;
import cn.besbing.model.mapper.primary.DlParamInitMapper;
import cn.besbing.server.service.primary.PrimaryCProjLoginSampleServiceImpl;
import cn.besbing.server.service.primary.PrimaryCProjTaskCoreServiceImpl;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class LimsParamService {

    @Autowired(required = false)
    DlParamInitMapper initMapper;

    @Autowired(required = false)
    DlParamAfterMapper afterMapper;

    @Autowired(required = false)
    PrimaryCProjTaskCoreServiceImpl taskCoreService;

    @Autowired(required = false)
    PrimaryCProjLoginSampleServiceImpl loginSampleService;

    protected List<String> removeRepeat(String str){
        StringBuffer sb = new StringBuffer(str);
        String rs = sb.reverse().toString().replaceAll("[^a-zA-Z]", "");
        sb = new StringBuffer(rs);
        rs = sb.reverse().toString().replaceAll("(.)(?=.*\\1)", "");
        StringBuffer out = new StringBuffer(rs);
        String verify = out.reverse().toString();
        List<String> list= Stream.iterate(0, n -> ++n).limit(verify.length())
                .map(n -> "" + verify.charAt(n))
                .collect(Collectors.toList());
        return list;
    }


    public JSONObject getInitParam(String taskId){
        CProjTask taskInfo = taskCoreService.selectSingleTaskInfoById(taskId);
        List<String> sampleGroupList = removeRepeat(taskInfo.getAssignedSampleDisplay());
        JSONObject jsonObject = new JSONObject();
        for (String sampleGroup : sampleGroupList){
            //JSONObject jsonObject1 = new JSONObject();
            JSONArray jsonArray = new JSONArray();
            CProjLoginSample loginSampleList = loginSampleService.getProjectInfoByProjectAndSampleGroup(taskInfo.getProject(),sampleGroup);
            DlParamInit dlParamInit = new DlParamInit();
            dlParamInit.setProduct(loginSampleList.getProductStandard());
            dlParamInit.setSamplingPoint(loginSampleList.getProductionSpec());
            dlParamInit.setGrade(loginSampleList.getStructureType());
            dlParamInit.setStage(loginSampleList.getProductStage());
            dlParamInit.setcContactType(loginSampleList.getContactType());
            List<DlParamInit> inits = initMapper.customSearchInit(dlParamInit);
            jsonArray = JSONArray.parseArray(JSON.toJSON(inits).toString());
            jsonObject.put(sampleGroup,jsonArray);
        }
        System.out.println(jsonObject);
        return jsonObject;
    }

    public List<DlParamAfter> getAfterParam(String taskId){

        return null;
    }

}
