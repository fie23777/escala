package com.fie2377.escala.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fie2377.escala.model.dto.MockEscalaDTO;
import com.fie2377.escala.model.entidade.EscalaServicoDiario;
import com.fie2377.escala.model.mock.MockService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/fie")
public class EscalaServicoDiarioController {
	
	@Autowired
	MockService escalaServico;
	
	@PostMapping("/adicionarEscala")
	@ApiOperation(value="")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Package found")
	})
	public String adicionarFuncionario(@RequestParam LocalDate data,@RequestParam String setor, 
			@RequestParam String nome) {
		EscalaServicoDiario escala = new EscalaServicoDiario();
		escala.setData(data);
		escala.setSetor(setor);
        return "adicionado com sucesso!";
	}
	
	
	@GetMapping("/escalas")
	@ApiOperation(value="")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Package found")
	})
	public List<MockEscalaDTO> buscarEscalaServicoDiario() throws Exception {
		return escalaServico.getEscala();
	}

}
