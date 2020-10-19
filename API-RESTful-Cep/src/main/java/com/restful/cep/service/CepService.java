package com.restful.cep.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.restful.cep.exception.Message;
import com.restful.cep.model.Cep;
import com.restful.cep.repository.CepRepository;

@Service
public class CepService {
	
	@Autowired
	CepRepository repository;
	
	public Cep saveCep(Cep cep) throws Message {
		Cep existCep = repository.getByCep(cep.getCep());
		
		if(existCep != null && !existCep.equals(cep)) {
			throw new Message("teste");
		}
		return repository.save(cep);
	}

}
