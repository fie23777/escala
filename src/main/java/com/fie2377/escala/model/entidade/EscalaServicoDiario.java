package com.fie2377.escala.model.entidade;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
@Entity(name="escala")
public class EscalaServicoDiario {

	@Id
	@GeneratedValue
	private String id;
	
	private LocalDate data;
	private String setor;
	
	@OneToMany
	@JoinColumn(name = "id", referencedColumnName = "id")
	List<Funcionario> funcionario;

	
	
	
}
