package com.fie2377.escala.model.entidade;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Builder(toBuilder= true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "funcionario")
public class Funcionario {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private String id;
	
	private String nome;
	private String categoria;
	private String coren;
	
	@OneToMany
	@JoinColumn(name = "id", referencedColumnName = "id")
	private List<Cliente> cliente; 
	
	
	
	
}
