package com.fie2377.escala.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.fie2377.escala.model.entidade.EscalaServicoDiario;
import com.fie2377.escala.model.repositorio.EscalaServicoDiarioRepository;

@Service
public class EscalaServicoDiarioService implements EscalaServicoDiarioRepository {



	@Autowired
	EscalaServicoDiarioRepository escalaServicoRepositorio;
	
	public void adicionarEscalaDiario(EscalaServicoDiario escala) {
		escalaServicoRepositorio.save(escala);
	}
	
	
	public List<EscalaServicoDiario> buscarEscala() {
		return (List<EscalaServicoDiario>) escalaServicoRepositorio.findAll();
	}


	@Override
	public List<EscalaServicoDiario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<EscalaServicoDiario> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<EscalaServicoDiario> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends EscalaServicoDiario> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public <S extends EscalaServicoDiario> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteInBatch(Iterable<EscalaServicoDiario> entities) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public EscalaServicoDiario getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends EscalaServicoDiario> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends EscalaServicoDiario> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Page<EscalaServicoDiario> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends EscalaServicoDiario> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Optional<EscalaServicoDiario> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(EscalaServicoDiario entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAll(Iterable<? extends EscalaServicoDiario> entities) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public <S extends EscalaServicoDiario> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends EscalaServicoDiario> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends EscalaServicoDiario> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public <S extends EscalaServicoDiario> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}



	


}