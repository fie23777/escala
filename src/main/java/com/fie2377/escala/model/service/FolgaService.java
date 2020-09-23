package com.fie2377.escala.model.service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fie2377.escala.model.entidade.Folga;
import com.fie2377.escala.model.repositorio.FolgaRepository;
import com.fie2377.escala.model.serviceI.FolgaInterface;

@Service
public class FolgaService implements FolgaInterface {

	@Autowired
	FolgaRepository periodoRepositorio;

	@Override
	public List<Folga> listarTodos() {

	 return (List<Folga>) periodoRepositorio.findAll();
	}
	
	@Override
	public Folga listarPorId(String id) {

		return null;
	}
	@Override
	public Folga cadastrar(Folga folga) {

		return periodoRepositorio.save(folga);
	}
	
	@Override
	public Folga atualizar(Folga folga) {

		return null;
	}
	
	@Override
	public void remover(String id) {
		
	}
	
	public boolean limiteMaximoEscaladoNoDia(Folga folga) {
		List<Folga> periodo = (List<Folga>) this.periodoRepositorio.findAll();
		List<Folga> periodo2 = periodo.stream().filter(a -> a.getDiaFolga().equals(folga.getDiaFolga())).collect(Collectors.toList());
		
		if(periodo2.size() >= 7) {
			return true;
		}
	     return false;
	}
}
