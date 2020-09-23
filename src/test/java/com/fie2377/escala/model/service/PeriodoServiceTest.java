package com.fie2377.escala.model.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.fie2377.escala.model.entidade.Folga;
import com.fie2377.escala.model.repositorio.FolgaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
class PeriodoServiceTest {
	
	@Autowired
	private FolgaRepository periodoRepositorio;

	@BeforeEach
	void setUp() throws Exception {
		carregarEscalaMaisDeCincoEscalas();
	}

	@AfterEach
	private void tearDownAfterClass() throws Exception {
		this.periodoRepositorio.deleteAll();
	}


	@Test
	void isJatemSeteIguais() {
		List<Folga> periodo = (List<Folga>) this.periodoRepositorio.findAll();
		LocalDate data1 = LocalDate.of(2010, 3, 7);
		int contador = 0;
		
		for (Folga periodoItem : periodo) {
			if(periodoItem.getDiaFolga().equals(data1)) {
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
		
		Folga escala1 = new Folga();
		Folga escala2 = new Folga();
		Folga escala3 = new Folga();
		Folga escala4 = new Folga();
		Folga escala5 = new Folga();
		Folga escala6 = new Folga();
		Folga escala7 = new Folga();
		Folga escala8 = new Folga();
		Folga escala9 = new Folga();
		

		escala1.setDiaFolga(data1);
		escala1.setId("@34453441");
		this.periodoRepositorio.save(escala1);
		
		escala2.setDiaFolga(data2);
		escala2.setId("@34453442");
		this.periodoRepositorio.save(escala2);
		

		escala3.setDiaFolga(data3);
		escala3.setId("@34453443");
		this.periodoRepositorio.save(escala3);
		

		escala4.setDiaFolga(data4);
		escala4.setId("@34453444");
		this.periodoRepositorio.save(escala4);
		

		escala5.setDiaFolga(data5);
		escala5.setId("@34453445");
		this.periodoRepositorio.save(escala5);
		

		escala6.setDiaFolga(data6);
		escala6.setId("@34453446");
		this.periodoRepositorio.save(escala6);
		

		escala7.setDiaFolga(data7);
		escala7.setId("@34453447");
		this.periodoRepositorio.save(escala7);
		

		escala8.setDiaFolga(data8);
		escala8.setId("@34453448");
		this.periodoRepositorio.save(escala8);
		

		escala9.setDiaFolga(data9);
		escala9.setId("@34453449");
		this.periodoRepositorio.save(escala9);
	}
	
	
}
