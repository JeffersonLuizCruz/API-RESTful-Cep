package com.restful.cep.dto.response;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import com.restful.cep.model.Cep;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CepResponseDTO {
	
	@NotNull(message="CEP não pode ser um campo nulo")
	private String cep;
	
	@NotNull(message="Logradouro não pode ser campo nulo")
	private String logradouro;
	
	@Column
	private String localidade;
	
	@Column
	private String uf;
	
	

	
	public CepResponseDTO(Cep cep) {
		
		this.cep = cep.getCep();
		this.logradouro = cep.getLogradouro();
		this.localidade = cep.getLocalidade();
		this.uf = cep.getUf();
	}

}
