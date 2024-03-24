  package com.bank.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.bank.entities.Client;
import com.bank.repositories.ClientRepository;

@Configuration
@Profile("testing")
public class TestBankConfig implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Client c1 = new Client(null,"a","b","c","d","e");
		Client c2 = new Client(null,"a","b","c","d","e");
		
		clientRepository.saveAll(Arrays.asList(c1,c2));
		
	}

}
