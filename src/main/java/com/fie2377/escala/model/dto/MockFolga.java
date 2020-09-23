package com.fie2377.escala.model.dto;

import java.time.LocalDate;

import com.fie2377.escala.model.entidade.Funcionario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder(toBuilder= true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MockFolga {
	
    MockFuncionario funcionario;
	private LocalDate diaFolga;
	
}
 