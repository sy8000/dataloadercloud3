package cn.besbing.model.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.datasource.two.druid")
public class SlaveConfigFile {
    String url = "";
    String username = "";
    String password = "";
    String driver = "";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
 * spring.datasource.two.druid.url=jdbc:oracle:thin:@10.0.10.94:1521:lims
 * spring.datasource.two.druid.username=lims_data
 * spring.datasource.two.druid.password=limslims
 * spring.datasource.two.druid.driver=oracle.jdbc.driver.OracleDriver
 * spring.datasource.two.druid.type=com.alibaba.druid.pool.DruidDataSource
 * spring.datasource.two.druid.initial-size=8
 * spring.datasource.two.druid.min-idle=5
 * spring.datasource.two.druid.max-active=20
 * spring.datasource.two.druid.max-wait=60000
 * spring.datasource.two.druid.time-between-eviction-runs-millis=60000
 * spring.datasource.two.druid.min-evictable-idle-time-millis=300000
 * spring.datasource.two.druid.validation-query=SELECT 1 FROM DUAL
 * spring.datasource.two.druid.test-while-idle=true
 * spring.datasource.two.druid.test-on-borrow=false
 * spring.datasource.two.druid.test-on-return=false
 * spring.datasource.two.druid.pool-prepared-statements=true
 * spring.datasource.two.druid.max-pool-prepared-statement-per-connection-size=20
 * spring.datasource.two.druid.filters=stat,wall,log4j
 * spring.datasource.two.druid.maxPoolPreparedStatementPerConnectionSize=25
 * spring.datasource.two.druid.use-global-data-source-stat=true
 * spring.datasource.two.druid.connection-properties=druid.stat.mergeSql=true;druid.stat.slowSqlMillis=500
 */
}
