package com.backend.spring.boot.models.services;

import java.util.List;

import com.backend.spring.boot.models.entity.Cliente;

public interface IClienteService {
	
	
	public List<Cliente> findAll();
	
	
	public Cliente findbyId(Long id);
	
	
	public Cliente save(Cliente cliente);
	

	public void delete (Long id);

}
