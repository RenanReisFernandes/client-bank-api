package com.bank.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entities.Client;
import com.bank.services.ClientService;

@RestController
@RequestMapping(value = "clients")
public class ClientController {

	@Autowired
	private ClientService clientService;

	public ResponseEntity<Client> save(Client client) {
		Client obj = clientService.create(client);
		return ResponseEntity.ok().body(obj);
	}

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = clientService.findAll();
		return ResponseEntity.ok().body(list);
	}

}
