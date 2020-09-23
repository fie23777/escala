package com.fie2377.escala.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder(toBuilder= true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MockFuncionario {
	
	private String nome;
	private String categoria;
	private String coren;
	
}
