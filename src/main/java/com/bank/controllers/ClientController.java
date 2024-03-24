package com.bank.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entities.Client;

@RestController
@RequestMapping(value = "clients")
public class ClientController {
	
	@GetMapping
	public ResponseEntity<Client> findAll(){
		Client c = new Client(1L,"ReBank","1234","renan","renan@email.com","999999");
		return ResponseEntity.ok().body(c);
	}

}
