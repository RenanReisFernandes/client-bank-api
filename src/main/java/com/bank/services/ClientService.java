package com.bank.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.entities.Client;
import com.bank.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	//create
	public Client create(Client client) {
		return clientRepository.save(client);
	}
	
	//findAll
	public List<Client> findAll(){
		List<Client> list = clientRepository.findAll();
		return list;
	}
}
