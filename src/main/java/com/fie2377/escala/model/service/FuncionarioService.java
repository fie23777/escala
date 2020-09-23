package com.fie2377.escala.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fie2377.escala.model.entidade.Funcionario;
import com.fie2377.escala.model.repositorio.FuncionarioRepository;
import com.fie2377.escala.model.serviceI.FuncionarioInterface;

@Service
public class FuncionarioService implements FuncionarioInterface{
	@Autowired
	FuncionarioRepository funcionarioRepositorio;
	
	public void adicionarFuncionario(Funcionario funcionario) {
		funcionarioRepositorio.save(funcionario);
	}
	
	public List<Funcionario> buscarFuncionario() {
		return (List<Funcionario>) funcionarioRepositorio.findAll();
	}
	
	//public boolean salvarFuncionarioCoremDuplicado(String coren) {
		//return this.funcionarioRepositorio.findByCoren(coren).isPresent();
	//}

	@Override
	public List<Funcionario> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Funcionario listarPorId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Funcionario cadastrar(Funcionario funcionario) {
		return funcionarioRepositorio.save(funcionario);
	}

	@Override
	public Funcionario atualizar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(String id) {
		// TODO Auto-generated method stub
		
	}
}
