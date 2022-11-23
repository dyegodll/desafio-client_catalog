package com.devsuperior.client_catalog.resourses;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.client_catalog.entities.Client;
import com.devsuperior.client_catalog.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResourse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Autowired
	private ClientService service;
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		
		List<Client> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
}
