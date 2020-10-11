package com.restful.cep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restful.cep.model.Cep;

@Repository
public interface CepRepository extends JpaRepository<Cep, Short>{
	public Cep getByCep(String cep);

}
