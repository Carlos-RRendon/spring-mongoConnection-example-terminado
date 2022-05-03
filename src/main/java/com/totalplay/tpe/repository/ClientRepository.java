package com.totalplay.tpe.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.totalplay.tpe.model.Client;

@Repository//("clientRepository")
public interface ClientRepository extends MongoRepository<Client, String>{
	public List<Client> findByName(String name);

}
