package cn.besbing;

import cn.besbing.model.entities.primary.DlPermission;
import cn.besbing.model.entities.primary.SmUser;
import cn.besbing.server.service.primary.PrimaryDlPermissionServiceImpl;
import cn.besbing.server.service.primary.PrimarySmuserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeMessage;
import javax.mail.search.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;

//@RunWith(SpringRunner.class)
@SpringBootTest
class ServerApplicationTests {

    @Autowired
    PrimarySmuserServiceImpl primarySmuserService;

    @Autowired
    PrimaryDlPermissionServiceImpl permissionService;

    @Test
    public void receivemail(){
        String host = "10.0.11.12";
        String userName = "1002437@hongfa.cn";
        String passWord = "Sy19820426";
        Properties properties=new Properties();
        Session session = Session.getDefaultInstance(properties);
        session.setDebug(true);
        String fileName=null;
        try {
//邮件服务器的类型
            Store store = session.getStore("pop3");
            //连接邮箱服务器
            store.connect(host,userName,passWord);
            // 获得用户的邮件帐户
            Folder folder=store.getFolder("INBOX");
            if (folder == null) {
                System.out.println("获取邮箱文件信息为空");
            }
            // 设置对邮件帐户的访问权限可以读写
            folder.open(Folder.READ_WRITE);
            Calendar calendar=Calendar.getInstance();
            calendar.add(Calendar.DATE,-1);
            Date mondayDate = calendar.getTime();
            SearchTerm comparisonTermLe = new SentDateTerm(ComparisonTerm.GT, mondayDate);
            SearchTerm address=new SubjectTerm( "MU Report");
            SearchTerm comparisonAndTerm = new AndTerm(address, comparisonTermLe);
            Message[] messages = folder.search(comparisonAndTerm);

            folder.close(true);
            store.close();
        }catch (Exception e){

        }
    }

    @Test
    void contextLoads() {
        try{
            //SmUser smUser = primarySmuserService.selectUserByCode("1002437");
            List<DlPermission> list = permissionService.allPermission(null);
            for (DlPermission dlPermission : list){
                System.out.println(dlPermission);
            }
        }catch (Exception e){
            e.getStackTrace();
        }

    }

}
