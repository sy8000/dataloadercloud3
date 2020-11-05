package cn.besbing.server.service.primary;/*
*   Xiamen HLYY Network Technology Co., Ltd.
*       DataLoader Cloud
*   @Author sheny
*   @Date 2020/11/5  17:15 
    @Version 1.0
    @Site https://besbing.cn
    @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
*/

import cn.besbing.client.enums.BaseResponse;
import cn.besbing.client.enums.StatusCode;
import cn.besbing.model.entities.primary.Sample;
import cn.besbing.model.mapper.primary.SampleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PrimarySampleServiceImpl {

    @Autowired(required = false)
    private SampleMapper sampleMapper;

    public List<Sample> getSamplesByProject(String project){
        return sampleMapper.selectSamplesByProject(project);
    }

    public int updateByPrimary(Sample sample){
        return sampleMapper.updateByPrimaryKey(sample);
    }


    public BaseResponse sampleReceive(String project, String locationNumber){
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        /**
         * labware逻辑:
         * samplenumber = selectedsamples[i]
         * 	status = ReceiveSample(samplenumber)
         * 	移动sample到指定库位
         * 	sample表storage_loc_no和status为I
         * 	分别写入流程表和样品审计表
         */
        List<Sample> sampleList = getSamplesByProject(project);
        if (sampleList.size() > 0){
            try {
                for (Sample s : sampleList){
                    s.setStatus("I");
                    s.setStorageLocNo(Long.valueOf(locationNumber));
                    updateByPrimary(s);
                    /** 分别写入流程表和样品审计表 **/

                }
            }catch (Exception e){
                //其它未知错误
                baseResponse = new BaseResponse(StatusCode.OTHERUNKOWERROR.getCode(),"此委托单样品回写失败");
            }
        }else {
            //其它未知错误
            baseResponse = new BaseResponse(StatusCode.OTHERUNKOWERROR.getCode(),"此委托单样品未找到，请检查sample登记是否正确");
        }
        return baseResponse;
    }
}
