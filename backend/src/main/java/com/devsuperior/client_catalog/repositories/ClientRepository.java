package com.devsuperior.client_catalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.client_catalog.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
