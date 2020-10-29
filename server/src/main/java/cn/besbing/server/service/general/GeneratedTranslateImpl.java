package cn.besbing.server.service.general;

import cn.besbing.server.utils.translate.TransApi;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
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
public class GeneratedTranslateImpl {

    @Value("${BAIDU_APP_ID}")
    private String appId;

    @Value("${BAIDU_SECURITY_KEY}")
    private String securityKey;

    public String translateText(String inuptText,String lang){
        TransApi api = new TransApi(appId, securityKey);
        String result = api.getTransResult(inuptText, "auto", lang);
        JSONObject jsonObject = JSONObject.parseObject(result);
        String arrayStr = jsonObject.getString("trans_result");
        JSONArray jsonArray = JSON.parseArray(arrayStr);
        JSONObject obj = (JSONObject) jsonArray.get(0);
        return obj.get("dst").toString();
    }



}
