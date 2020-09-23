package com.fie2377.escala.batch.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fie2377.escala.model.entidade.Funcionario;

@Configuration
public class LeituraArquivoLarguraFixaWriterConfig {

	@Bean
	public ItemWriter<Funcionario> leituraArquivoLarguraFixaWriter(){
		return items -> items.forEach(System.out::println);
		
	}
}
