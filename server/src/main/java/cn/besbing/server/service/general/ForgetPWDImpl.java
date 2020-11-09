package cn.besbing.server.service.general;

import cn.besbing.server.service.primary.PrimaryCustomServiceImpl;
import cn.besbing.server.utils.EncryptUtil;
import cn.besbing.server.utils.MailDTO;
import cn.besbing.model.entities.primary.SmUser;
import cn.besbing.server.service.primary.PrimarySmuserServiceImpl;
import com.alibaba.fastjson.JSONObject;
import com.geasy.NC6PasswordUtil;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;

@Service
public class ForgetPWDImpl {

    @Autowired
    MailServiceImpl mailService;

    @Autowired
    PrimarySmuserServiceImpl smuserService;

    @Autowired
    PrimaryCustomServiceImpl customService;


    private final String mailSuffix = "@hongfa.cn";

    private final String salt = "sheny1982";


    public JSONObject checkTimeValid(@RequestBody String timestamp){
        JSONObject jsonObject = new JSONObject();
        timestamp = timestamp.replace("\"","");
        String noEncodeStr = EncryptUtil.getInstance().AESdecode(timestamp,salt);
        String splitArr[] = noEncodeStr.split("&");
        Long stamp = Long.valueOf(splitArr[1].toString());
        Long now = new Date().getTime();
        int sub = (int)((now - stamp) / 1000);
        if (splitArr.length < 2){
            jsonObject.put("status","formatted failed");
        }else {
            if (sub < 600 ){
                jsonObject.put("status","ok");
            }else {
                jsonObject.put("status","date time is expired");
            }
        }
        return jsonObject;
    }

    public Boolean validUsercode(String userCode){
        Boolean isExist = false;
        SmUser smUser = smuserService.getUserByCode(userCode.replace("\"",""));
        if (smUser != null){
            isExist = true;
        }
        return isExist;
    }

    public JSONObject confirmNewPassword(@RequestBody String newPassword){
        JSONObject jsonObject = new JSONObject();
        newPassword = newPassword.replace("\"","");
        String stampAndPwd[] = newPassword.split("&");
        String codeArr[] = EncryptUtil.getInstance().AESdecode(stampAndPwd[0],salt).split("&");
        try{
            if (newPassword != null && newPassword.trim() != "" && codeArr[0].trim() != null && codeArr[0].trim() != ""){
                SmUser smUser = smuserService.selectUserByCode(codeArr[0]);
                String encodePassword = NC6PasswordUtil.getEncodedPassword(smUser.getCuserid(), stampAndPwd[1]);
                smUser.setIslocked("N");
                smUser.setUserPassword(encodePassword);
                int i = -1;
                i = smuserService.updateUserByCuserid(smUser);
                if (i > 0){
                    jsonObject.put("status","密码修改成功");
                }
            }else {
                jsonObject.put("status","密码修改失败，密码不得为空");
            }
        }catch (Exception e){
            jsonObject.put("status","传入密码错误");
        }

        return jsonObject;
    }

    public String sendMailWhenForgetPassword(String usercode){

        /*
            用户名不能为空
            用户不存在
            邮件发送成功
            邮件发送失败
         */
        String returnMsg = "";
        String[] mailAddress = {usercode + mailSuffix};
        MailDTO mailDTO = new MailDTO();
        mailDTO.setSubject("密码重置--宏发总部检测中心Lims验证邮件");
        mailDTO.setToUsers(mailAddress);


        if (usercode.trim() != null && usercode.trim() != ""){
            if (validUsercode(usercode.trim())){
                //生成加密和时间字符串，用以转换看网址是不是过期：约定时间为10分钟有效
                //加密用户名
                //加密时间戳
                String noEncodeStr = usercode + "&" + String.valueOf(new Date().getTime());
                String md5 = EncryptUtil.getInstance().AESencode(noEncodeStr,salt);
                String mailContext = "您的邮件验证网址是:   http://10.0.11.132/resetPass?" + md5 + "   ，网址10分钟内有效，" +
                        "请在时效内重置密码。";
                mailDTO.setContext(mailContext);
                try{
                    mailService.sendMail(mailDTO);
                    return "邮件发送成功，请到尽快到邮箱重置密码";
                }catch (Exception e){
                    return "邮件发送出错";
                }
            }else {
                returnMsg = "用户不存在";
            }
        }else {
            returnMsg = "用户名不能为空";
        }

        return returnMsg;
    }


}
