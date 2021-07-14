package com.example.clients.business;

import com.example.clients.business.dtos.ClientDtoInt;

public interface ClientBusiness {
	
	public ClientDtoInt save(final ClientDtoInt request);
	
	public ClientDtoInt find(final String id);
	
	public ClientDtoInt update(final ClientDtoInt request, final String id); 
		
	public void delete(final String id); 

}
