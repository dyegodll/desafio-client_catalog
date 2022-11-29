package com.devsuperior.client_catalog.services;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.client_catalog.dto.ClientDTO;
import com.devsuperior.client_catalog.entities.Client;
import com.devsuperior.client_catalog.repositories.ClientRepository;

@Service
public class ClientService implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll(){
		List<Client> list = repository.findAll();
		return list.stream().map( x -> new ClientDTO(x) ).collect(Collectors.toList());
	}

}
