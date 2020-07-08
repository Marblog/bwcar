package cn.marblog.bwcar.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
@Configuration //spring的配置文件
public class DruidConfig {


    @Bean(name = "dataSource")
    //加载properties文件，以spring.datasource开头的部分构建数据源
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource(){
        return new DruidDataSource();
    }

}
