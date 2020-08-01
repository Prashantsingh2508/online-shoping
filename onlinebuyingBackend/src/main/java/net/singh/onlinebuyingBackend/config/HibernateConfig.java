package net.singh.onlinebuyingBackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages={"net.singh.onlinebuyingBackend.dto"})
@EnableTransactionManagement
public class HibernateConfig {
	private String DATABASE_URL="jdbc:h2:tcp://localhost/~/onlinebuying";// jdbc:h2:tcp://localhost/~/onlinebuying
	//@Value("${jdbc.driver}")
	private String DATABASE_DRIVER="org.h2.Driver";
//@Value("${jdbc.dialect}")
	private String DATABASE_DIALECT="org.hibernate.dialect.H2Dialect";
//@Value("${jdbc.username}")
	private String DATABASE_USERNAME="sa";
//@Value("${jdbc.password}")
	private String DATABASE_PASSWORD="";


	@Bean("dataSource")
	public DataSource getDataSource()
	{
		//Prioviding Data Base Connection Info
		BasicDataSource dataSource =new BasicDataSource();
		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);
		return dataSource;
		
	}

	
	//Session Factory Bean Will BE Available
	@Bean
	public SessionFactory getSessionFactory(DataSource  dataSource) {
		
		
		
		LocalSessionFactoryBuilder builder=new LocalSessionFactoryBuilder(dataSource);
		builder.addProperties(getHibernateProperties());
		builder.scanPackages("net.singh.onlinebuyingBackend.dto");
		return builder.buildSessionFactory();
		
	}

	//	All HiberNateProperties will be return in this method
	private Properties getHibernateProperties() {
		// TODO Auto-generated method stub
		Properties properties=new Properties();
		properties.put("hibernate.dialect", DATABASE_DIALECT);
		properties.put("hibernate.show_sql","true");
		properties.put("hibernate.format_sql","true");
		return properties;
	}
	//Transaction Manager 
	@Bean 
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		
		HibernateTransactionManager hibernatetransactionmanager=new HibernateTransactionManager(sessionFactory);
		return hibernatetransactionmanager;
		
		
		
		
	}

}
