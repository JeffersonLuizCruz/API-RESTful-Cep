package com.restful.cep.dto.request;

import com.restful.cep.model.Cep;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CepRequestDTO {

	private String cep;
	private String logradouro;
	private String localidade;
	private String bairro;
	private String uf;
	private String unidade;
	private String ibge;
	
	public Cep build() {
		Cep cep = new Cep()
				.setCep(this.cep)
				.setLogradouro(this.logradouro)
				.setBairro(this.bairro)
				.setLocalidade(this.localidade)
				.setUf(this.uf)
				.setUnidade(this.unidade)
				.setIbge(this.ibge);
				
		
		return cep;
	}
	

}
