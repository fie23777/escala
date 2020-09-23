package com.fie2377.escala.batch.reader;





import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.json.GsonJsonObjectReader;
import org.springframework.batch.item.json.JsonItemReader;
import org.springframework.batch.item.json.builder.JsonItemReaderBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import com.fie2377.escala.model.entidade.Funcionario;

@Configuration
public class LeituraArquivoLarguraFixaConfig {

	@StepScope
	@Bean
	public JsonItemReader<Funcionario> itemReader(@Value("#{jobParameters['arquivoFuncionario']}") Resource arquivoFuncionario) {
	  return new JsonItemReaderBuilder<Funcionario>()
	      .name("tradesJsonItemReader")
	      .resource(arquivoFuncionario)
	      .jsonObjectReader(new GsonJsonObjectReader<>(Funcionario.class))
	      .build();
	}
	
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	@StepScope
//	@Bean
//	public FlatFileItemReader itemReader(@Value("#{jobParameters['arquivoFuncionario']}") Resource arquivoFuncionario,
//			LineMapper lineMapper) {
//	  return new FlatFileItemReaderBuilder()
//	      .name("tradesJsonItemReader")
//	      .resource(arquivoFuncionario)
//	      .lineMapper(lineMapper)
//	      .build();
//	}

//	
//	@StepScope
//	@Bean
//	public FlatFileItemReader<Funcionario> leituraArquivoLarguraFixaReader(
//			@Value("#{jobParameters['arquivoFuncionario']}") Resource arquivoFuncionario){
//	return new FlatFileItemReaderBuilder<Funcionario>()
//			.name("leituraArquivoLarguraFixaReader")
//			.resource(arquivoFuncionario)
//			.fixedLength()
//			.columns(new Range[] {new Range(1,10),new Range(11,13), new Range(14,23)})
//			.names(new String[] {"nome","categoria","coren"})
//			.targetType(Funcionario.class)
//			.build();	
//	}
	
	
//	@StepScope
//	@Bean
//	public FlatFileItemReader<Funcionario> leituraArquivoLarguraFixaReader(
//			@Value("#{jobParameters['arquivoFuncionario']}") Resource arquivoFuncionario){
//	return new FlatFileItemReaderBuilder<Funcionario>()
//			.name("leituraArquivoLarguraFixaReader")
//			.resource(arquivoFuncionario)
//			.delimited()
//			.names(new String[] {"id","nome","categoria","coren"})
//			.targetType(Funcionario.class)
//			.build();	
//	}
//	

}
