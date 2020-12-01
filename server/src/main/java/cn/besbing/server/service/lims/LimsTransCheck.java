package cn.besbing.server.service.lims;/*
*   Xiamen HLYY Network Technology Co., Ltd.
*       DataLoader Cloud
*   @Author sheny
*   @Date 2020/12/1  15:42 
    @Version 1.0
    @Site https://besbing.cn
    @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
*/

import cn.besbing.model.entities.primary.Product;
import cn.besbing.server.service.primary.PrimaryCustomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LimsTransCheck {

    @Autowired
    private PrimaryCustomServiceImpl customService;


    public List<String> checkProduct(String model,Product product){
        return customService.selectAsList(getExcuteSql(model,product));
    }

    public String getExcuteSql(String model , Product product){
        String sql = "";
        try {
            sql = customService.selectOne("select sql_text from sql_records where sql_code = '" + model + "'");
            //语句替换
            /**
             * sheny : product.name
             * why   : product.version
             * shenycode : product.code
             * shenytestlist : product.testlist
             */
            sql = sql.replace("sheny",product.getName());
            sql = sql.replace("why",String.valueOf(product.getVersion()));
            sql = sql.replace("ccode",product.getCode());
            sql = sql.replace("ttestlist",product.getTestList());
        }catch (Exception e){
            e.printStackTrace();
        }
        return sql;
    }


}
