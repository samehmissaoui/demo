package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Client;
import com.example.demo.repository.ClientRepo;

@Service
public class ClientService {
	
	@Autowired
	ClientRepo clientrepo;

	public Client addClientService(Client client) {

		return clientrepo.save(client);
	}

	public List<Client> getAllClientservice() {
		
		return clientrepo.findAll();
	}

	public Client getClientserviceById(Long id) {
	
		return clientrepo.findById(id).get();
	}

	public Client updateClientService(Client client,Long id) {
		Client c = clientrepo.findById(id).orElse(null);
		 if (c!=null) {
			 c.setCreation_date(client.getCreation_date());
			 c.setName(client.getName());
		return clientrepo.save(c);}
		 return null;
		 
	}

	public void deleteClientservice(Long id) {
		
		 clientrepo.deleteById(id);
	}



}
