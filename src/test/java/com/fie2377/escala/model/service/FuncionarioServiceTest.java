package com.fie2377.escala.model.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.fie2377.escala.model.entidade.Funcionario;
import com.fie2377.escala.model.repositorio.FuncionarioRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
class FuncionarioServiceTest {

	
	@Autowired
	FuncionarioRepository funcionarioRepositorio;
	
    private String coren = "123456789";
    

	
	@BeforeEach
	void setUp() throws Exception {
		carregaFuncionario();
	}

	@AfterEach
	 void tearDownAfterClass() throws Exception {
		this.funcionarioRepositorio.deleteAll();
	}

	@Test
	void salvarFuncionarioCoremDuplicado() {
		//Funcionario funcionario = this.funcionarioRepositorio.findByCoren(coren);
		//Optional<Optional<Funcionario>> retorno = Optional.of(this.funcionarioRepositorio.findByCoren(coren));		
		//assertTrue(retorno.isPresent());
	}
	
	public void carregaFuncionario() {		
		Funcionario funcionario = new Funcionario();
		funcionario.setCategoria("testecat");
		funcionario.setCoren("123456789");
		funcionario.setNome("joao");
		
		this.funcionarioRepositorio.save(funcionario);
	}
	


}
