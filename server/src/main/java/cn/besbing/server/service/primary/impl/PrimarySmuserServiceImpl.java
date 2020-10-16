package cn.besbing.server.service.primary.impl;/*
*   Xiamen HLYY Network Technology Co., Ltd.
*       DataLoader Cloud
*   @Author sheny
*   @Date 2020/10/16  13:38 
    @Version 1.0
    @Site https://besbing.cn
    @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
*/

import cn.besbing.model.entities.primary.SmUser;
import cn.besbing.model.mapper.primary.SmUserMapper;
import cn.besbing.server.service.primary.IPrimarySmuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrimarySmuserServiceImpl implements IPrimarySmuserService {

    @Autowired(required = false)
    private SmUserMapper smUserMapper;

    public SmUser selectUserByCode(String userCode){
        return smUserMapper.selectByUserCode(userCode);
    }

}
