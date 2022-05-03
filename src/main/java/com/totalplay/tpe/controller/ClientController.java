package com.totalplay.tpe.controller;

import java.util.List;

import com.totalplay.tpe.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.totalplay.tpe.model.Client;
import com.totalplay.tpe.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {
	@Autowired
	ClientService clientService;

	@GetMapping("/")
	public ResponseEntity<Response> findAll(){
		List<Client> client = clientService.findAll();
		Response response = new Response();

		if(client.isEmpty()){
			response.setResponse(null);
			response.setMessage("Datos no encontrados");
			response.setStatus("0");
			return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		} else
		{
			response.setResponse(client);
			response.setMessage("Datos encontrados " + client.size());
			response.setStatus("1");
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
	}
	
	@GetMapping("/name")
	public ResponseEntity <List<Client>>findByName (@RequestParam(name = "name") String name){
		List<Client> client = clientService.findByName(name);
		if(client.isEmpty()){
			return new ResponseEntity(HttpStatus.valueOf(400));
		} else
		{
			return new ResponseEntity<>(clientService.findByName(name),HttpStatus.OK);
		}
	}

	@PostMapping("/")
	public ResponseEntity<String> save(@RequestBody Client client){
		System.out.println(client.getAge());
		clientService.save(client);
		return new ResponseEntity("Te la he insertado correctamente",HttpStatus.CREATED);
	}
}
