package com.devsuperior.client_catalog.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.client_catalog.entities.Client;
import com.devsuperior.client_catalog.repositories.ClientRepository;

@Service
public class ClientService implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ClientRepository repository;
	
	public List<Client> findAll(){
		
		return repository.findAll();
	}

}
