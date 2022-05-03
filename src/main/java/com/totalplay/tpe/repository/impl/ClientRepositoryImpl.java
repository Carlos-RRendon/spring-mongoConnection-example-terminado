package com.totalplay.tpe.repository.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;
import com.totalplay.tpe.model.Client;
import com.totalplay.tpe.repository.ClientRepository;

//@Repository
//public class ClientRepositoryImpl implements ClientRepository{
//	private final MongoTemplate mongoTemplate;
//	
//	@Autowired
//	public ClientRepositoryImpl(MongoTemplate mongoTemplate) {
//        Assert.notNull(mongoTemplate);
//        this.mongoTemplate = mongoTemplate;
//    }
//
//
//	@Override
//	public Optional<List<Client>> getAllClients() {
//		Query query = new Query();
//		query.with(Sort.by(Sort.Direction.ASC, "name"));
//		List<Client> clients = this.mongoTemplate.find(query, Client.class);
//		Optional<List<Client>> optionalUsers = Optional.ofNullable(clients);
//		return optionalUsers;
//	}
//
//}
