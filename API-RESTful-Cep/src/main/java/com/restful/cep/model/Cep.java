package com.restful.cep.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cep implements Serializable{
	

	private static final long serialVersionUID = -8788029958699021675L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short id;
	
	@Column(length = 8, nullable = false, unique = true)
	private String cep;
	
	@Column(nullable = false, unique = true)
	private String logradouro;
	
	@Column
	private String complemento;
	
	private String bairro;
	
	@Column
	private String localidade;
	
	@Column
	private String uf;
	
	@Column
	private String unidade;
	
	@Column
	private String ibge;

}
