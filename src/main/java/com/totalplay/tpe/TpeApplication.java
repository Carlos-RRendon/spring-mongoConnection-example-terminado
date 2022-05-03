package com.totalplay.tpe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class TpeApplication {	
	public static void main(String[] args) {
		SpringApplication.run(TpeApplication.class, args);
	}

}
