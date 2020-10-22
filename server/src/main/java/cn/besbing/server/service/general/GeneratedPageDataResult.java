package cn.besbing.server.service.general;

import cn.besbing.model.entities.primary.DlPermission;
import cn.besbing.model.utils.PageDataResult;
import cn.besbing.model.utils.SearchDTO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
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
 *
 * 封装pageDataResult的数据
 */
@Service
public class GeneratedPageDataResult {

    public PageDataResult createFormatedTableData(SearchDTO searchDTO, List<?> list){
        PageDataResult pdr = new PageDataResult();
        try{
            //Type type = Class.forName("cn.besbing.model.entities.primary.DlPermission").getClass();
            PageInfo<?> pageInfo = new PageInfo<>(list);
            pdr.setTotals(Long.valueOf(pageInfo.getTotal()).intValue());
            pdr.setList(list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return pdr;
    }

}
