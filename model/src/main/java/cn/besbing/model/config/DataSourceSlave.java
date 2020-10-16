package cn.besbing.model.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;


/**
 * 从数据源
 *
 */
@Configuration
@MapperScan(basePackages = "cn.besbing.model.besbing.mapper.slave",sqlSessionTemplateRef = "slaveSqlSessionTemplate")
public class DataSourceSlave {

    @Autowired
    private Environment env;

    @Autowired
    private SlaveConfigFile slaveConfigFile;


    @Bean(name = "slaveDataSource")
    //@ConfigurationProperties(prefix = "spring.datasource.two")
    public DataSource dataSource(){
        /*return DataSourceBuilder.create()
                .driverClassName(env.getProperty("spring.datasource.two.driver"))
                .url(env.getProperty("spring.datasource.two.url"))
                .username(env.getProperty("spring.datasource.two.username"))
                .password(env.getProperty("spring.datasource.two.password"))
                .build();*/
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(slaveConfigFile.driver);
        druidDataSource.setUrl(slaveConfigFile.url);
        druidDataSource.setUsername(slaveConfigFile.username);
        druidDataSource.setPassword(slaveConfigFile.password);
        return druidDataSource;

    }


    @Bean(name = "slaveSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("slaveDataSource") DataSource dataSource) throws Exception{
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mappers/slave/*.xml"));
        //手动加载mybatis全局配置文件
        //bean.setConfigLocation(new DefaultResourceLoader().getResource("classpath:mybatis-config.xml"));
        return bean.getObject();
    }

    /**
     * 事务管理器
     */

    @Bean(name = "slaveTransactionManager")
    public DataSourceTransactionManager transactionManager(@Qualifier("slaveDataSource") DataSource dataSource) throws Exception{
        return new DataSourceTransactionManager(dataSource);
    }

    /**
     * sql模板
     */

    @Bean(name = "slaveSqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("slaveSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception{
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    /**
     *
     */
    @Bean("slaveJdbcTemplate")
    public JdbcTemplate slaveJdbcTemplate(@Qualifier("slaveDataSource") DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

}
