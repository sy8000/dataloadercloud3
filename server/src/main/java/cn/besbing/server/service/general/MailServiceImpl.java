package cn.besbing.server.service.general;

import cn.besbing.server.utils.MailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.SendFailedException;
import javax.mail.internet.MimeMessage;
import java.io.File;


@Service
public class MailServiceImpl {

    @Autowired(required = false)
    MailSender mailSender;


    @Autowired
    JavaMailSender mailSenderd;

    public void sendImgMail(MailDTO mailDTO){

        try {
            MimeMessage message =mailSenderd.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message,true);
            mimeMessageHelper.setFrom("lab@hongfa.cn");
            mimeMessageHelper.setTo(mailDTO.getToUsers());
            mimeMessageHelper.setSubject(mailDTO.getSubject());
            mimeMessageHelper.setText("<html><head></head><body><h1>尊敬的客户，您好！</h1><p>感谢您抽出宝贵时间参与此次调查。</p>" +
                    "<p>本问卷主要了解您对检测中心LIMS WEB软件的使用感受，收集意见用于系统改进与完善，从而为您提供更好的服务。</p><p>手机扫描下方二维码即可进入问卷调查页面</p>" +
                    "<img src='cid:MyImg'/><br/><br/><br/><br/><br><p>厦门宏发电声股份有限公司检测中心</p></body></html>",true);
            File file = new File("c:/QRCODE.jpg");
            mimeMessageHelper.addInline("MyImg",file);
            mailSenderd.send(message);

        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }


    public void sendMail(MailDTO mailDTO){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setSubject(mailDTO.getSubject());
        mailMessage.setText(mailDTO.getContext());
        mailMessage.setTo(mailDTO.getToUsers());
        mailMessage.setFrom("lab@hongfa.cn");
        mailSender.send(mailMessage);
    }




}
