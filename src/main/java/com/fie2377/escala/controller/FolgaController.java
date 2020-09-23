package com.fie2377.escala.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fie2377.escala.model.dto.MockFolga;
import com.fie2377.escala.model.entidade.Folga;
import com.fie2377.escala.model.mock.MockService;
import com.fie2377.escala.model.service.FolgaService;
import com.fie2377.utils.ResponseGeneric;
@CrossOrigin(origins="*")
@RestController
public class FolgaController {

	
//	@Autowired
//	FolgaService folgaRepositorio;
//	
	@Autowired
	MockService escalaServico;
	
//	
//	@PostMapping("/adicionarFolga")
//	public ResponseEntity<ResponseGeneric<Folga>> cadastrar(@RequestBody Folga folga, BindingResult result){
//		
//		if(result.hasErrors() || folgaRepositorio.limiteMaximoEscaladoNoDia(folga)) {
//			List<String> erros = new ArrayList<String>();
//			
//			if(this.folgaRepositorio.limiteMaximoEscaladoNoDia(folga)) {				
//				erros.add("Já atingiu o número máximo de folgas neste dia! ") ;
//			}
//			
//			result.getAllErrors().forEach(erro-> erros.add(erro.getDefaultMessage()));
//			
//			return ResponseEntity.badRequest().body(new ResponseGeneric<Folga>(erros));
//		}
//		return ResponseEntity.ok(new ResponseGeneric<Folga>( this.folgaRepositorio.cadastrar(folga)));
//	}
	
	@GetMapping("/periodos")
	public List<MockFolga> buscarEscalaServicoDiario() throws Exception {
		return escalaServico.getFolga();
	}
}
