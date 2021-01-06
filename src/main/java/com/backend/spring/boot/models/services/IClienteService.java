package com.backend.spring.boot.models.services;

import java.util.List;

import com.backend.spring.boot.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();

}
