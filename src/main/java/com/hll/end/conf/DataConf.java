package com.hll.end.conf;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.zaxxer.hikari.HikariDataSource;

@SpringBootConfiguration
public class DataConf {

	@Bean
	//默认数据源
	@Primary
	//将properties中以mysql为前缀的参数值，写入方法返回的对象中
	@ConfigurationProperties(prefix="mysql")
	public DataSource mysqDataSource() {
		//通过DataSourceBuilder构建数据源
		return DataSourceBuilder.create().type(HikariDataSource.class).build();
	}
	
	@Bean
	//副数据库需要配置@Qualifier
	@Qualifier("oracle")
	@ConfigurationProperties(prefix="oracle")
	public DataSource oracleDataSource() {
		return DataSourceBuilder.create().type(HikariDataSource.class).build();
	}


}
