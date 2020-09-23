package com.fie2377.escala.batch.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JobArquivoConfig {
	// bulders
	@Autowired
	private JobBuilderFactory jobBuilderFactory;

	@Bean
	public Job imprimeOlaJob(Step imprimeOlaFie) {
		return jobBuilderFactory
				.get("imprimeOlaJob") // nome do metodo
				.start(imprimeOlaFie) // recebe um step
				.incrementer(new RunIdIncrementer()) // para rodar adicionando um parâmetro evitando erro
				.build();

	}
	
	
}
