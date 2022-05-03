package com.totalplay.tpe.model;

import java.io.Serializable;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="Client")
@Data
public class Client implements Serializable {
	private static final long serialVersionUID = -5558113372695507412L;
	
	@Id
	private String id;
	@Field("Name")
	private String name;
	@Field("Age")
	private Long age;
	@Field("Address")
	private Address address;
	@Field("Phone")
	private String phone;

}
