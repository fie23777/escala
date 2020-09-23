package com.fie2377.escala.batch.step;



import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fie2377.escala.model.entidade.Funcionario;

@Configuration
public class LeituraArquivoFixaReaderConfig {

	
	@Autowired
	private StepBuilderFactory stepBuilderfactory;
	
	@Bean
	public Step leituraArquivoLarguraFixaReaderConfig(ItemReader<Funcionario> leituraArquivoLarguraFixaReader,
			                                          ItemWriter<Funcionario> leituraArquivoLarguraFixaWriter) {
		return stepBuilderfactory
				.get("leituraArquivoLarguraFixaReaderConfig") // nome do metodo
				.<Funcionario, Funcionario>chunk(1) // null, pois o parametro esta sendo obtido pelo siatema no metodo
				.reader(leituraArquivoLarguraFixaReader)
				.writer(leituraArquivoLarguraFixaWriter)
				.build();
	}
}
//	   @Bean
//	   public Step imprimeOlaFie(Tasklet t){
//		     return stepBuilderfactory
//			        .get("imprimeOlaFie")
//					.tasklet(t) 
//					.build();
//		   }
//	
//}
