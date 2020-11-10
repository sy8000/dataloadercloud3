package cn.besbing.server.service.primary;/*
*   Xiamen HLYY Network Technology Co., Ltd.
*       DataLoader Cloud
*   @Author sheny
*   @Date 2020/11/5  11:21 
    @Version 1.0
    @Site https://besbing.cn
    @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
*/

import cn.besbing.client.enums.BaseResponse;
import cn.besbing.client.enums.StatusCode;
import cn.besbing.model.entities.primary.LabwareSamplereceiveView;
import cn.besbing.model.entities.primary.StorageLocation;
import cn.besbing.model.mapper.primary.StorageLocationMapper;
import cn.besbing.model.utils.SearchDTO;
import cn.besbing.server.utils.AbstractLog;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrimaryStorageLocationServiceImpl extends AbstractLog {

    @Autowired(required = false)
    private StorageLocationMapper storageLocationMapper;

    public List<StorageLocation> getSampleReceiveList(SearchDTO searchDTO){
        List<StorageLocation> list = new ArrayList<StorageLocation>();
        PageHelper.startPage(searchDTO.getPage(), searchDTO.getLimit(),true);
        if(searchDTO.getKeyword() != null){
            list = storageLocationMapper.selectAllEmptySampleListSL(searchDTO.getKeyword().toString());
        }else {
            list = storageLocationMapper.selectAllEmptySampleListSL(null);
            //list = permissionMapper.selectByExample(null);
        }
        return list;
    }

    public List<StorageLocation> getAllNotEmptyLocationStorage(SearchDTO searchDTO) {
        List<StorageLocation> list = new ArrayList<StorageLocation>();
        PageHelper.startPage(searchDTO.getPage(), searchDTO.getLimit(),true);
        if(searchDTO.getKeyword() != null){
            list = storageLocationMapper.selectAllNotEmptyLocationStorage(searchDTO.getKeyword().toString());
        }else {
            list = storageLocationMapper.selectAllNotEmptyLocationStorage(null);
            //list = permissionMapper.selectByExample(null);
        }
        return list;
    }

    @Transactional
    public BaseResponse clearLocationStorage(StorageLocation storageLocation) {
        BaseResponse baseResponse = new BaseResponse(StatusCode.SUCCESS);
        if (storageLocation != null){
            try {
                storageLocation.setReservedBy(null);
                storageLocation.setReservedFor(null);
                storageLocation.setReservedOn(null);
                storageLocationMapper.updateByPrimaryKey(storageLocation);
            }catch (Exception e){
                baseResponse = new BaseResponse(StatusCode.DBUPDATEFAILED.getCode(),"清空库位时，" + e.getMessage());
                logger.error("清空库位时，" + e.getMessage());
                throw new RuntimeException("清空库位时，" + e.getMessage());
            }
        }else {
            baseResponse = new BaseResponse(StatusCode.DBUPDATEFAILED.getCode(),"清空库位时，传入" + this.getClass().getName() + "类的库位信息为空" );
            logger.error("清空库位时，传入" + this.getClass().getName() + "类的库位信息为空");
            throw new RuntimeException("清空库位时，传入" + this.getClass().getName() + "类的库位信息为空");
        }
        return baseResponse;
    }
}
