package com.example.clients.business;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.clients.business.dtos.ClientDtoInt;
import com.example.clients.dao.ClientRepository;
import com.example.clients.dao.entities.Client;

@Service
public class ClientBusinessImpl implements ClientBusiness {
	
	@Autowired
	private ClientRepository repository;
	
	private ModelMapper mapper = new ModelMapper();

	@Override
	public ClientDtoInt save(final ClientDtoInt request) {
		
		Client client = mapper.map(request, Client.class);		
		client = repository.save(client);
		client.getCredential().setPassword("*****");
		ClientDtoInt clientDtoInt = mapper.map(client, ClientDtoInt.class);
		
		return clientDtoInt;
	}

	@Override
	public ClientDtoInt find(final String id) {
		ClientDtoInt clientDtoInt = null;
		
		Optional<Client> optionalClient = repository.findById(id);
		
		if(optionalClient.isPresent()) {
			Client client = optionalClient.get();
			client.getCredential().setPassword(null);
			clientDtoInt = mapper.map(client, ClientDtoInt.class);
		}
		
		return clientDtoInt;
	}

	@Override
	public ClientDtoInt update(final ClientDtoInt request,final String id) {
		ClientDtoInt clientDtoInt = null;
		
		Optional<Client> optionalClient = repository.findById(id);
		
		if(optionalClient.isPresent()) {
			Client client = optionalClient.get();
			client = mapper.map(request, Client.class);
			client = repository.save(client);
			client.getCredential().setPassword(null);
			clientDtoInt = mapper.map(client, ClientDtoInt.class);
		}
		
		return clientDtoInt;
	}

	@Override
	public void delete(final String id) {
		repository.deleteById(id);
	}

}
