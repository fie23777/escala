package com.fie2377.escala.model.mock;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fie2377.escala.model.dto.MockEscalaDTO;
import com.fie2377.escala.model.dto.MockFolga;
import com.fie2377.escala.model.dto.MockFuncionario;
import com.fie2377.escala.model.entidade.EscalaServicoDiario;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class MockService {
	
	
	
	public List<MockEscalaDTO> getEscala() throws Exception{
		
		List<MockEscalaDTO> listEscalas = new  ArrayList<MockEscalaDTO>();
		
		//funcionarios *************************************************************************
		
		MockFuncionario anaPaula = new MockFuncionario().builder()
				.categoria("TE")
				.coren("588687")
				.nome("Ana Paula")
				.build();
		
		MockFuncionario claudiaBerenice = new MockFuncionario().builder()
				.categoria("TE")
				.coren("442499")
				.nome("Claudia Berenice")
				.build();
		
		MockFuncionario joao = new MockFuncionario().builder()
				.categoria("TE")
				.coren("588123")
				.nome("João")
				.build();
		
		MockFuncionario maria = new MockFuncionario().builder()
				.categoria("TE")
				.coren("442321")
				.nome("Maria")
				.build();
		
		MockFuncionario antonio = new MockFuncionario().builder()
				.categoria("AE")
				.coren("112687")
				.nome("Antonio")
				.build();
		
		MockFuncionario arnaldo = new MockFuncionario().builder()
				.categoria("AE")
				.coren("225499")
				.nome("Arnaldo")
				.build();
		
		//folgas *********************************************************************************
		
		MockFolga folga1 = new MockFolga().builder()
				.diaFolga(LocalDate.parse("2020-09-01"))
				.funcionario(anaPaula)
				.build();
		
		MockFolga folga2 = new MockFolga().builder()
				.diaFolga(LocalDate.parse("2020-09-02"))
				.funcionario(claudiaBerenice)
				.build();
		
		MockFolga folga3 = new MockFolga().builder()
				.diaFolga(LocalDate.parse("2020-09-01"))
				.funcionario(joao)
				.build();
		
		MockFolga folga4 = new MockFolga().builder()
				.diaFolga(LocalDate.parse("2020-09-02"))
				.funcionario(antonio)
				.build();
		
		MockFolga folga5 = new MockFolga().builder()
				.diaFolga(LocalDate.parse("2020-09-01"))
				.funcionario(maria)
				.build();
		
		MockFolga folga6 = new MockFolga().builder()
				.diaFolga(LocalDate.parse("2020-09-02"))
				.funcionario(arnaldo)
				.build();
		
		//escalas ************************************************************************************
		
		MockEscalaDTO escala1 = new MockEscalaDTO().builder()
				.data(LocalDate.parse("2020-09-02"))
				.funcionario(anaPaula)
				.setor("Apoio")
				.build();
		
		MockEscalaDTO escala2 = new MockEscalaDTO().builder()
				.data(LocalDate.parse("2020-09-02"))
				.funcionario(claudiaBerenice)
				.setor("apoio")
				.build();
				
		MockEscalaDTO escala3 = new MockEscalaDTO().builder()
				.data(LocalDate.parse("2020-09-02"))
				.setor("Apoio")
				.funcionario(joao)
				.build();
		
		MockEscalaDTO escala4 = new MockEscalaDTO().builder()
				.data(LocalDate.parse("2020-09-02"))
				.setor("Apoio")
				.funcionario(antonio)
				.build();
		
		//escalas adicionadas
		listEscalas.add(escala1);
		listEscalas.add(escala2);
		listEscalas.add(escala3);
		listEscalas.add(escala4);
		
		
		return listEscalas;
		
	}
	
	public List<MockFuncionario> getFuncionario() throws Exception{
		//funcionarios *************************************************************************
		
		List<MockFuncionario> funcionarios = new ArrayList<MockFuncionario>();
		
		MockFuncionario anaPaula = new MockFuncionario().builder()
				.categoria("TE")
				.coren("588687")
				.nome("Ana Paula")
				.build();
		
		MockFuncionario claudiaBerenice = new MockFuncionario().builder()
				.categoria("TE")
				.coren("442499")
				.nome("Claudia Berenice")
				.build();
		
		MockFuncionario joao = new MockFuncionario().builder()
				.categoria("TE")
				.coren("588123")
				.nome("João")
				.build();
		
		MockFuncionario maria = new MockFuncionario().builder()
				.categoria("TE")
				.coren("442321")
				.nome("Maria")
				.build();
		
		MockFuncionario antonio = new MockFuncionario().builder()
				.categoria("AE")
				.coren("112687")
				.nome("Antonio")
				.build();
		
		MockFuncionario arnaldo = new MockFuncionario().builder()
				.categoria("AE")
				.coren("225499")
				.nome("Arnaldo")
				.build();
		
		funcionarios.add(claudiaBerenice);
		funcionarios.add(anaPaula);
		funcionarios.add(joao);
		funcionarios.add(maria);
		funcionarios.add(antonio);
		funcionarios.add(arnaldo);
		
		return funcionarios;
	}

	public List<MockFolga> getFolga() throws Exception{
		
		//funcionarios *************************************************************************
		
		List<MockFuncionario> funcionarios = new ArrayList<MockFuncionario>();
		
		MockFuncionario anaPaula = new MockFuncionario().builder()
				.categoria("TE")
				.coren("588687")
				.nome("Ana Paula")
				.build();
		
		MockFuncionario claudiaBerenice = new MockFuncionario().builder()
				.categoria("TE")
				.coren("442499")
				.nome("Claudia Berenice")
				.build();
		
		MockFuncionario joao = new MockFuncionario().builder()
				.categoria("TE")
				.coren("588123")
				.nome("João")
				.build();
		
		MockFuncionario maria = new MockFuncionario().builder()
				.categoria("TE")
				.coren("442321")
				.nome("Maria")
				.build();
		
		MockFuncionario antonio = new MockFuncionario().builder()
				.categoria("AE")
				.coren("112687")
				.nome("Antonio")
				.build();
		
		MockFuncionario arnaldo = new MockFuncionario().builder()
				.categoria("AE")
				.coren("225499")
				.nome("Arnaldo")
				.build();
		//folgas *********************************************************************************
		
		List<MockFolga> folgas = new ArrayList<MockFolga>();
		
		MockFolga folga1 = new MockFolga().builder()
				.diaFolga(LocalDate.parse("2020-09-01"))
				.funcionario(anaPaula)
				.build();
		
		MockFolga folga2 = new MockFolga().builder()
				.diaFolga(LocalDate.parse("2020-09-02"))
				.funcionario(claudiaBerenice)
				.build();
		
		MockFolga folga3 = new MockFolga().builder()
				.diaFolga(LocalDate.parse("2020-09-01"))
				.funcionario(joao)
				.build();
		
		MockFolga folga4 = new MockFolga().builder()
				.diaFolga(LocalDate.parse("2020-09-02"))
				.funcionario(antonio)
				.build();
		
		MockFolga folga5 = new MockFolga().builder()
				.diaFolga(LocalDate.parse("2020-09-01"))
				.funcionario(maria)
				.build();
		
		MockFolga folga6 = new MockFolga().builder()
				.diaFolga(LocalDate.parse("2020-09-02"))
				.funcionario(arnaldo)
				.build();
		
		folgas.add(folga1);
		folgas.add(folga2);
		folgas.add(folga3);
		folgas.add(folga4);
		folgas.add(folga5);
		folgas.add(folga6);
		
		return folgas;
	}
}
