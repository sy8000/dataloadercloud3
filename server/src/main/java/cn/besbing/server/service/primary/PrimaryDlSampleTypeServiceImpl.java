package cn.besbing.server.service.primary;/*
*   Xiamen HLYY Network Technology Co., Ltd.
*       DataLoader Cloud
*   @Author sheny
*   @Date 2020/11/11  9:45 
    @Version 1.0
    @Site https://besbing.cn
    @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
*/

import cn.besbing.client.enums.BaseResponse;
import cn.besbing.client.enums.StatusCode;
import cn.besbing.model.entities.primary.DlSampleType;
import cn.besbing.model.mapper.primary.DlSampleTypeMapper;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PrimaryDlSampleTypeServiceImpl {

    @Autowired(required = false)
    private DlSampleTypeMapper sampleTypeMapper;

    public List<DlSampleType> getAllSampleType(){
        return sampleTypeMapper.selectByExample(null);
    }

    @Transactional
    public BaseResponse saveType(String typeValue){
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        try {
            sampleTypeMapper.clearSampleType();
            sampleTypeMapper.saveSampleType(typeValue);
        }catch (Exception e){
            baseResponse = new BaseResponse(StatusCode.OTHERUNKOWERROR.getCode(),"样品出入库类型设置失败：" + e.getMessage());
            throw new RuntimeException("样品出入库类型设置失败：" + e.getMessage());
        }
        return baseResponse;
    }

    public BaseResponse getSampleType() {
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        JSONObject jsonObject = new JSONObject();
        try {
            baseResponse.setData(sampleTypeMapper.selectSampleType());
        }catch (Exception e){
            baseResponse = new BaseResponse(StatusCode.OTHERUNKOWERROR.getCode(),"取样品出入库类型失败：" + e.getMessage());
            throw new RuntimeException("取样品出入库类型失败：" + e.getMessage());
        }
        return baseResponse;
    }
}
