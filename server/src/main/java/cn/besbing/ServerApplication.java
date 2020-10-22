package cn.besbing;

import com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.io.FileNotFoundException;

@SpringBootApplication//(exclude = PageHelperAutoConfiguration.class)
@EnableTransactionManagement
@EnableScheduling
@EnableAsync
@EnableCaching
@PropertySource(value = "wechat.properties")
public class ServerApplication extends WebMvcConfigurationSupport {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        //registry.addResourceHandler("/static/***").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/static/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/static/");
        registry.addResourceHandler("/i18n/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/i18n/");
        registry.addResourceHandler("/fileReport/**").addResourceLocations("file:D:/Lims_COA_ShareMenu/frreport/source/");
        registry.addResourceHandler("/resignReport/**").addResourceLocations("file:D:/resignreport/");
        registry.addResourceHandler("/finalReport/**").addResourceLocations("file:D:/resignreport/finalresign/");
        super.addResourceHandlers(registry);
    }
}
