package com.xworkz.configuration;

import static com.xworkz.logger.Loggers.getLogger;

import java.util.logging.Logger;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class SpringWebInitialiser extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	private Logger logger = getLogger();
	@Override
	protected Class<?>[] getRootConfigClasses() {
		logger.info("getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		logger.info("getServletConfigClasses");
		return new Class[] {SpringConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		logger.info("getServletMappings");
		return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}


}
