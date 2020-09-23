package com.fie2377.escala;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableBatchProcessing
@EnableScheduling
@EnableSwagger2
public class EscalaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscalaApplication.class, args);
		
		
	}

}
