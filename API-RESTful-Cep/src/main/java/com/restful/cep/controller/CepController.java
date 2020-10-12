package com.restful.cep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restful.cep.dto.request.CepRequestDTO;
import com.restful.cep.dto.response.CepResponseDTO;
import com.restful.cep.repository.CepRepository;

@RestController
@RequestMapping("/api/cep")
public class CepController {
	
	@Autowired
	private CepRepository repository;
	
	@PostMapping
	public CepRequestDTO postCep(@RequestBody CepRequestDTO dto) {
		repository.save(dto.build());
		return dto;
	}
	
	@GetMapping("/{cep}")
	public CepResponseDTO getCep(@PathVariable String cep) {
		return new CepResponseDTO(repository.getByCep(cep));
	}

}
