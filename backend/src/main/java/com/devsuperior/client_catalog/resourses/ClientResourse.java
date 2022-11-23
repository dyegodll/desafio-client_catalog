package com.devsuperior.client_catalog.resourses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.client_catalog.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResourse implements Serializable {
	private static final long serialVersionUID = 1L;

	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		
		//teste
		List<Client> list = new ArrayList<>();
		Client c1 = new Client();
		c1.setName("Isaac Azevedo");
		Client c2 = new Client();
		c2.setName("Esther Campos");
		Client c3 = new Client();
		c3.setName("Lorena Lopes");
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		return ResponseEntity.ok().body(list);
	}
	
}
