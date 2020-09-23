package com.fie2377.escala.model.serviceI;

import java.util.List;

import com.fie2377.escala.model.entidade.Folga;

public interface FolgaInterface {
	List<Folga> listarTodos(); 

	Folga listarPorId(String id);
	
	Folga cadastrar(Folga folga);
	
	Folga atualizar(Folga folga);
	
	
	void remover(String id);
}
