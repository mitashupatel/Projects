package com.mitashu.config;


import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.mitashu.config")
@PropertySource(value= {"classpath:config.properties"})
public class HibernateConfig {

	@Autowired
	Environment env;
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("");
		dataSource.setUrl("");
		dataSource.setUsername("");
		dataSource.setPassword("");
		return dataSource;
	}
	public Properties hibernateProperties() {
		Properties  properties= new Properties();
		properties.put("", "");
		properties.put("", "");
		properties.put("", "");
		return properties;
	}
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory= new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String[] {"com.mitashu.model"});
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;

	}
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager (SessionFactory s) {
		HibernateTransactionManager txManager=new HibernateTransactionManager();
		txManager.setSessionFactory(s);
		return txManager;
	}
}
