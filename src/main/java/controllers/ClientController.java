package controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
	
	@GetMapping
	public ResponseEntity<Client> findAll(){
		Client c = new Client(1L,"111","ses","derf","ggg","999");
		return ResponseEntity.ok().body(c);
	}

}
