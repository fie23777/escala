package com.fie2377.escala.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fie2377.escala.model.dto.MockFuncionario;
import com.fie2377.escala.model.entidade.Funcionario;
import com.fie2377.escala.model.mock.MockService;
import com.fie2377.escala.model.service.CarregarDadosExcell;
@CrossOrigin(origins="*")
@RestController

public class FuncionarioController {

//	@Autowired
//	FuncionarioService funcionarioRepositorio;
	
	@Autowired
	MockService escalaServico;
	
	@Autowired
	CarregarDadosExcell doExcell;
	
	
//	@PostMapping("/funcionarios")
//	public ResponseEntity<ResponseGeneric<Funcionario>> cadastrar(@RequestBody Funcionario funcionario, BindingResult result){
//		
//		if(result.hasErrors() || this.funcionarioRepositorio.salvarFuncionarioCoremDuplicado(funcionario.getCoren())) {
//			List<String> erros = new ArrayList<String>();
//			
//			if(this.funcionarioRepositorio.salvarFuncionarioCoremDuplicado(funcionario.getCoren())) {				
//				erros.add("Já existe um funcionário com este coren cadastrado! ");
//			}
//			
//			result.getAllErrors().forEach(erro-> erros.add(erro.getDefaultMessage()));
//			
//			return ResponseEntity.badRequest().body(new ResponseGeneric<Funcionario>(erros));
//		}
//		return ResponseEntity.ok(new ResponseGeneric<Funcionario>( this.funcionarioRepositorio.cadastrar(funcionario)));
//	}
	

	
//	@GetMapping("/funcionarios")
//	public List<MockFuncionario> buscarEscalaServicoDiario() throws Exception {
//		return escalaServico.getFuncionario();
//	}

	@GetMapping("/funcionarios")
	public List<Funcionario> buscarEscalaServicoDiario() throws Exception {
		return doExcell.buscarFuncionarioExcell();
	}
}
