package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Client;
import com.example.demo.service.ClientService;

@RestController
@RequestMapping("client")
public class ClientController {
	
	@Autowired
	ClientService clientService;
	
	@GetMapping("/{id}")
	public Client getMessage(@PathVariable("id") Long id) {
		return clientService.getClientserviceById(id);
	}
	 
	@PostMapping ("/")
	public Client addClient(@RequestBody Client client) {

	return clientService.addClientService(client);
	}
	
	@GetMapping ("/")
	public List<Client> getAllClient(){
		return clientService.getAllClientservice();
	}
	
	@PatchMapping ("/{id}")
	public Client updateClient(@RequestBody Client client,@PathVariable("id") Long id) {

		return clientService.updateClientService(client,id);
		}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		 clientService.deleteClientservice(id);
	}
	
}
