package cn.besbing.model.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "cn.besbing.model.besbing.mapper.third",sqlSessionTemplateRef = "thirdSqlSessionTemplate")
public class DataSourceThird {

    @Autowired
    private Environment env;

    @Autowired
    private ThirdConfigFile thirdConfigFile;


    @Bean(name = "thirdDataSource")
    //@ConfigurationProperties(prefix = "spring.datasource.two")
    public DataSource dataSource(){
        /*return DataSourceBuilder.create()
                .driverClassName(env.getProperty("spring.datasource.two.driver"))
                .url(env.getProperty("spring.datasource.two.url"))
                .username(env.getProperty("spring.datasource.two.username"))
                .password(env.getProperty("spring.datasource.two.password"))
                .build();*/
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(thirdConfigFile.driver);
        druidDataSource.setUrl(thirdConfigFile.url);
        druidDataSource.setUsername(thirdConfigFile.username);
        druidDataSource.setPassword(thirdConfigFile.password);
        return druidDataSource;

    }


    @Bean(name = "thirdSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("thirdDataSource") DataSource dataSource) throws Exception{
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mappers/third/*.xml"));
        //手动加载mybatis全局配置文件
        //bean.setConfigLocation(new DefaultResourceLoader().getResource("classpath:mybatis-config.xml"));
        return bean.getObject();
    }

    /**
     * 事务管理器
     */

    @Bean(name = "thirdTransactionManager")
    public DataSourceTransactionManager transactionManager(@Qualifier("thirdDataSource") DataSource dataSource) throws Exception{
        return new DataSourceTransactionManager(dataSource);
    }

    /**
     * sql模板
     */

    @Bean(name = "thirdSqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("thirdSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception{
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    /**
     *
     */
    @Bean("thirdJdbcTemplate")
    public JdbcTemplate slaveJdbcTemplate(@Qualifier("thirdDataSource") DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

}
