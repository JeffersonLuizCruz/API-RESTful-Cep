package com.restful.cep.dto.request;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import com.restful.cep.model.Cep;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CepRequestDTO {
	
	@NotNull(message="CEP não pode ser um campo nulo")
	private String cep;
	
	@NotNull(message="Logradouro não pode ser campo nulo")
	private String logradouro;
	
	@Column
	private String complemento;
	
	@Column
	private String localidade;
	
	@Column
	private String uf;
	
	@Column
	private String unidade;
	
	@Column
	private String ibge;
	
	
	public Cep build() {
		Cep cep = new Cep()
				.setCep(this.cep)
				.setLogradouro(this.logradouro)
				.setComplemento(this.complemento)
				.setLocalidade(this.localidade)
				.setUf(this.localidade)
				.setUnidade(this.unidade)
				.setIbge(this.ibge);
				
		
		return cep;
	}
	

}
