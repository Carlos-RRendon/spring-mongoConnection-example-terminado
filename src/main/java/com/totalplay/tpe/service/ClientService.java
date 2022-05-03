package com.totalplay.tpe.service;

import java.util.List;

import com.totalplay.tpe.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.tpe.model.Client;
import com.totalplay.tpe.repository.ClientRepository;

@Service
public class ClientService {
	@Autowired
	ClientRepository clientRepository;
	
	public List<Client> findByName(String name){
		List<Client> clients = clientRepository.findByName(name);
		clients.forEach(client -> {
			Address addrees = client.getAddress();

			System.out.println(addrees.toString());
		});

		return (List<Client>) clientRepository.findByName(name);
	}

	public List<Client> findAll(){
		List<Client> clients = clientRepository.findAll();
		return clients;
	}

	public void save(Client client){
		System.out.println(client.getAge());
		clientRepository.save(client);
	}
}
