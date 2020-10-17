package com.restful.cep.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.restful.cep.dto.request.CepRequestDTO;
import com.restful.cep.dto.response.CepResponseDTO;
import com.restful.cep.exception.Message;
import com.restful.cep.model.Cep;
import com.restful.cep.repository.CepRepository;

@RestController
@RequestMapping("/api/cep")
public class CepController {
	
	@Autowired
	private CepRepository repository;
	
	@PostMapping
	public ResponseEntity<Object> postCep(@Valid @RequestBody CepRequestDTO dto) {
		if(dto.getCep() == "" || dto.getCep() == null) {
			return new ResponseEntity<>(new Message("Cep Obrigatório"), HttpStatus.BAD_REQUEST);
		}if(dto.getLogradouro() == "" || dto.getCep() == null) {		
			return new ResponseEntity<>(new Message("Logradouro Obrigatório"), HttpStatus.BAD_REQUEST);
		}
		Cep saveCep = repository.save(dto.build());
		return new ResponseEntity<>(new CepResponseDTO(saveCep), HttpStatus.CREATED);
	}
	
	@GetMapping("/{cep}")
	public ResponseEntity<Object> getCep(@PathVariable String cep){
		Cep cepResponse = repository.getByCep(cep);
		if(cepResponse != null) {
			return new ResponseEntity<>(new CepResponseDTO(cepResponse), HttpStatus.OK);
		}else {
			String url = "https://viacep.com.br/ws/"+cep+"/json/";
			RestTemplate restTamplate = new RestTemplate();
			
			try {
			Cep cepRestTamplate = restTamplate.getForObject(url, Cep.class);
			repository.save(cepRestTamplate);
			
			return new ResponseEntity<>(new CepResponseDTO(cepRestTamplate), HttpStatus.OK);
			}catch(HttpClientErrorException err) {
				
				return new ResponseEntity<>(new Message("Não encontrado"), HttpStatus.NOT_FOUND);
			}
			
		}
	}

}
