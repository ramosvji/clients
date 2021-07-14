package com.example.business;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.clients.business.ClientBusinessImpl;
import com.example.clients.business.dtos.ClientDtoInt;
import com.example.clients.dao.ClientRepository;
import com.example.clients.dao.entities.Client;
import com.example.factory.FactoryClient;

@ExtendWith(MockitoExtension.class)
class ClientBusinessImplTest {
	
	@Mock
	private ClientRepository repository;
	
	@InjectMocks
	private ClientBusinessImpl business;
	
	@Test
	public void testFindById() {
		Client client = FactoryClient.createClient();
		Optional<Client> optionalClient = Optional.of(client);
		when(repository.findById(Mockito.anyString())).thenReturn(optionalClient);	
	
		ClientDtoInt clientDtoInt =  business.find(Mockito.anyString());
		assertNotNull(clientDtoInt);
	}
	
	@Test
	public void testFindByIdWithoutResult() {
		Client client = null;
		Optional<Client> optionalClient = Optional.ofNullable(client);
		when(repository.findById(Mockito.anyString())).thenReturn(optionalClient);	
	
		ClientDtoInt clientDtoInt =  business.find(Mockito.anyString());
		assertNull(clientDtoInt);
	}
	
	public void testSave() {
		
	}
	
}
