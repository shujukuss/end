package com.hll.end.conf;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
@MapperScan(basePackages = "com.hll.end.dao.oracle", sqlSessionFactoryRef = "oracleSessionFactory")
public class OracleConfig {
	
    @Bean
    public SqlSessionFactory oracleSessionFactory(@Qualifier("oracle")DataSource oracleDataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(oracleDataSource);
        return bean.getObject();
    }
}