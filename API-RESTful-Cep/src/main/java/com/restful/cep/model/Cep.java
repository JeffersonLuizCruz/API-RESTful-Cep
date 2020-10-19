package com.restful.cep.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@Accessors(chain = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cep implements Serializable{
	

	private static final long serialVersionUID = -8788029958699021675L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short id;
	
	@NotNull(message = "Não pode ser vazio")
	@Column(nullable = false)
	private String cep;
	@Column
	private String logradouro;
	@Column
	private String complemento;
	@Column
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
