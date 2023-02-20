package com.xworkz.configuration;

import static com.xworkz.logger.Loggers.getLogger;

import java.util.logging.Logger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {

	private Logger logger = getLogger();

	public SpringConfiguration() {
		logger.info("created SpringConfiguration");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {

		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		return factoryBean;

	}

	@Bean
	public ViewResolver viewResolver() {

		InternalResourceViewResolver resolver = new InternalResourceViewResolver("/", ".jsp");
		return resolver;

	}
	@Bean
	public MultipartResolver multipartResolver() {
		return new StandardServletMultipartResolver();
		
	}
	
	
	
	
}
