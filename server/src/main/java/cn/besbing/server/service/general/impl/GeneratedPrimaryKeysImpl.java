package cn.besbing.server.service.general.impl;/*
*   Xiamen HLYY Network Technology Co., Ltd.
*       DataLoader Cloud
*   @Author sheny
*   @Date 2020/10/16  10:48 
    @Version 1.0
    @Site https://besbing.cn
    @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
*/

import cn.besbing.server.service.general.IGeneratedPrimaryKeys;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 *  20位数据库主键生成类
 */

@Service
public class GeneratedPrimaryKeysImpl implements IGeneratedPrimaryKeys {


    private  final String  base = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    StringBuffer sb = new StringBuffer();

    public  String getModulePrimary(String moduleName){
        int strOtherLength = 20 - moduleName.length();

        int number = 0;
        Random random = new Random();
        for (int i=0;i<strOtherLength;i++){
            number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return moduleName + sb.toString();
    }

    public  String getPrimary(int num){
        int number = 0;
        Random random = new Random();
        for (int i=0;i<num;i++){
            number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

}
