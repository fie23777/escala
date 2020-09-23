package com.fie2377.escala.model.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fie2377.escala.model.entidade.Funcionario;
@EnableJpaRepositories
@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, String> {

	

}
