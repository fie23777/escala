package com.fie2377.escala.batch.reader;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.mapping.PatternMatchingCompositeLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.beans.BeanWrapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fie2377.escala.model.entidade.Cliente;
import com.fie2377.escala.model.entidade.Funcionario;

//@Configuration
public class TransacaoLineMapper {

	
	//@Bean
	public PatternMatchingCompositeLineMapper lineMapper() {
		PatternMatchingCompositeLineMapper mapper = new PatternMatchingCompositeLineMapper<>();
		mapper.setTokenizers(tokenizers());
		mapper.setFieldSetMappers(fieldSetMappers());
		return mapper;
	}

	private Map<String, FieldSetMapper> fieldSetMappers() {
		Map<String, FieldSetMapper> fieldSetmapper = new HashMap<>();
		fieldSetmapper.put("{*", fieldSetMapper(Funcionario.class));
		fieldSetmapper.put("objeto*", fieldSetMapper(Cliente.class));
		return null;
	}

	private FieldSetMapper fieldSetMapper(Class classe) {
		BeanWrapperFieldSetMapper fieldSetMapper = new BeanWrapperFieldSetMapper<>();
		fieldSetMapper.setTargetType(classe);
		return fieldSetMapper;
	}

	private Map<String, LineTokenizer> tokenizers() {
		Map<String, LineTokenizer> tokenizers = new HashMap<>();
		tokenizers.put("{*",funcionarioLineTokenizer());
		tokenizers.put("objeto*",clienteLineTokenizer());
		return tokenizers;
	}

	private LineTokenizer funcionarioLineTokenizer() {
		DelimitedLineTokenizer linetokenizer = new DelimitedLineTokenizer();
		linetokenizer.setNames("","","");
		linetokenizer.setIncludedFields(1,2,3);
		return linetokenizer;
	}
	
	private LineTokenizer clienteLineTokenizer() {
		DelimitedLineTokenizer linetokenizer = new DelimitedLineTokenizer();
		linetokenizer.setNames("","");
		linetokenizer.setIncludedFields(1,2);
		return linetokenizer;
	}
}
