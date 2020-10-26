package cn.besbing.server.service.primary;

import cn.besbing.model.mapper.primary.QcCommissionHMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

@Service
public class PrimaryQcCmmissionHServiceImpl {

    @Autowired(required = false)
    private QcCommissionHMapper qcCommissionHMapper;

    public String getQchPrimary(@Param("billno") String billno){
        return qcCommissionHMapper.getPrimary(billno);
    }

}
