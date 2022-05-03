package com.totalplay.tpe.model;

import java.io.Serializable;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class Address implements Serializable{
	private static final long serialVersionUID = 2357967853658713599L;
	@Field("Street")
	private String street;
	@Field("Number")
	private Long number;
	@Field("City")
	private String city;


}
