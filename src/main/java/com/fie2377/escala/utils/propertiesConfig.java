package com.fie2377.escala.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;

@Configuration
public class propertiesConfig {

	
	@Bean
	public PropertySourcesPlaceholderConfigurer config() {
		
		PropertySourcesPlaceholderConfigurer config = new PropertySourcesPlaceholderConfigurer();
		config.setLocation(new FileSystemResource("D:\\Configuration_source_db/aplication.properties"));
		return config;
	}
}
