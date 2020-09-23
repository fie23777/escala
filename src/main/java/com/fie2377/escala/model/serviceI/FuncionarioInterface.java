package com.fie2377.escala.model.serviceI;

import java.util.List;

import com.fie2377.escala.model.entidade.Funcionario;

public interface FuncionarioInterface {
	
	
	List<Funcionario> listarTodos(); 

	Funcionario listarPorId(String id);
	
	Funcionario cadastrar(Funcionario funcionario);
	
	Funcionario atualizar(Funcionario funcionario);
	
	
	void remover(String id);

}
