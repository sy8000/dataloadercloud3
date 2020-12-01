package cn.besbing.server.service.primary;/*
*   Xiamen HLYY Network Technology Co., Ltd.
*       DataLoader Cloud
*   @Author sheny
*   @Date 2020/12/1  15:24 
    @Version 1.0
    @Site https://besbing.cn
    @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
*/

import cn.besbing.model.entities.primary.Product;
import cn.besbing.model.entities.primary.ProductKey;
import cn.besbing.model.mapper.primary.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrimaryProductServiceImpl {

    @Autowired(required = false)
    private ProductMapper productMapper;

    public Product getProductByPrimary(String name,Long ver){
        ProductKey productKey = new ProductKey();
        productKey.setName(name);
        productKey.setVersion(ver);
        return productMapper.selectByPrimaryKey(productKey);
    }

}
