package com.fie2377.escala.model.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.fie2377.escala.model.entidade.EscalaServicoDiario;
import com.fie2377.escala.model.repositorio.EscalaServicoDiarioRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
class EscalaServicoDiarioServiceTest {

	@Autowired
	private EscalaServicoDiarioRepository escalaServicoRepositorio;
	
	private String nome = "joao";


	@BeforeEach
	public void setUp() throws Exception {
		carregarEscalaMaisDeCincoEscalas();
	}


	@AfterEach
	private void tearDown() throws Exception {
		this.escalaServicoRepositorio.deleteAll();
	}

	
	@Test
	public void isJatemSeteIguais() {
		List<EscalaServicoDiario> escala = (List<EscalaServicoDiario>) this.escalaServicoRepositorio.findAll();
		LocalDate data1 = LocalDate.of(2010, 3, 7);
		int contador = 0;
		
		for (EscalaServicoDiario escalaServicoDiario : escala) {
			if(escalaServicoDiario.getData().equals(data1)) {
				contador++;
			}
		}
		assertTrue(7 <= contador);
	}
	

	
	private void carregarEscalaMaisDeCincoEscalas() {
		
		LocalDate data1 = LocalDate.of(2010, 1, 7);
		LocalDate data2 = LocalDate.of(2010, 2, 7);
		LocalDate data3 = LocalDate.of(2010, 3, 7);
		LocalDate data4 = LocalDate.of(2010, 3, 7);
		LocalDate data5 = LocalDate.of(2010, 3, 7);
		LocalDate data6 = LocalDate.of(2010, 3, 7);
		LocalDate data7 = LocalDate.of(2010, 3, 7);
		LocalDate data8 = LocalDate.of(2010, 3, 7);
		LocalDate data9 = LocalDate.of(2010, 3, 7);
		
		EscalaServicoDiario escala1 = new EscalaServicoDiario();
		EscalaServicoDiario escala2 = new EscalaServicoDiario();
		EscalaServicoDiario escala3 = new EscalaServicoDiario();
		EscalaServicoDiario escala4 = new EscalaServicoDiario();
		EscalaServicoDiario escala5 = new EscalaServicoDiario();
		EscalaServicoDiario escala6 = new EscalaServicoDiario();
		EscalaServicoDiario escala7 = new EscalaServicoDiario();
		EscalaServicoDiario escala8 = new EscalaServicoDiario();
		EscalaServicoDiario escala9 = new EscalaServicoDiario();
		
		escala1.setData(data1);
		escala1.setSetor("medico");
		escala1.setId("@34453441");
		this.escalaServicoRepositorio.save(escala1);
		

		escala2.setData(data2);
		escala2.setSetor("medico");
		escala2.setId("@34453442");
		this.escalaServicoRepositorio.save(escala2);

		escala3.setData(data3);
		escala3.setSetor("medico");
		escala3.setId("@34453443");
		this.escalaServicoRepositorio.save(escala3);
		

		escala4.setData(data4);
		escala4.setSetor("medico");
		escala4.setId("@34453444");
		this.escalaServicoRepositorio.save(escala4);
		

		escala5.setData(data5);
		escala5.setSetor("medico");
		escala5.setId("@34453445");
		this.escalaServicoRepositorio.save(escala5);
		

		escala6.setData(data6);
		escala6.setSetor("medico");
		escala6.setId("@34453446");
		this.escalaServicoRepositorio.save(escala6);
		

		escala7.setData(data7);
		escala7.setSetor("medico");
		escala7.setId("@34453447");
		this.escalaServicoRepositorio.save(escala7);
		

		escala8.setData(data8);
		escala8.setSetor("medico");
		escala8.setId("@34453448");
		this.escalaServicoRepositorio.save(escala8);

		escala9.setData(data9);
		escala9.setSetor("medico");
		escala9.setId("@34453449");
		this.escalaServicoRepositorio.save(escala9);
	}
	
	
}
