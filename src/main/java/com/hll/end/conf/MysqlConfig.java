package com.hll.end.conf;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootConfiguration
@MapperScan(basePackages = "com.hll.end.dao.mysql")
public class MysqlConfig {

	@Bean
	@Primary
	public SqlSessionFactory mysqlSessionFactory(DataSource mysqlDataSource) throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(mysqlDataSource);
		return bean.getObject();
	}
}