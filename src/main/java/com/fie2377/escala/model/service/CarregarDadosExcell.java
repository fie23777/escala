package com.fie2377.escala.model.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fie2377.escala.model.entidade.Funcionario;
import com.fie2377.escala.utils.CarregarExcell;

@Service
public class CarregarDadosExcell {

	
	
	@Autowired
	CarregarExcell carg;
	

	public List<Funcionario> buscarFuncionarioExcell() throws IOException {
		List<Funcionario> listaFuncionarios = new ArrayList<>();
		String caminho ="src/main/resources/testeHospTania.xlsx";
		int posicaoDaAba = 0;
		List<Row> linhasDoExcell = 	carg.carregaDadosExcell(caminho, posicaoDaAba);
		
		linhasDoExcell.forEach(campo ->{
			
			Funcionario funcionario = Funcionario.builder()
					.categoria(campo.getCell(0).getStringCellValue())
					.coren(   String.valueOf( campo.getCell(1).getNumericCellValue()))
					.nome(     campo.getCell(2).getStringCellValue())
					.build();
			
			listaFuncionarios.add(funcionario);
			
		});
		return listaFuncionarios;
	}
	
}
