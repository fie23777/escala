package com.fie2377.escala.model.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.fie2377.escala.model.entidade.EscalaServicoDiario;

@EnableJpaRepositories
@Repository
public interface EscalaServicoDiarioRepository extends JpaRepository<EscalaServicoDiario, String>{

	
}
