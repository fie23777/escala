package com.fie2377.escala.model.entidade;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder(toBuilder= true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Folga {
	
	@Id
	@GeneratedValue
	private String id;
	private LocalDate diaFolga;
	
	@OneToOne
	@JoinColumn(name = "id", referencedColumnName = "id")
	Funcionario funcionario;
	

}
