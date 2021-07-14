package com.example.factory;

import java.util.ArrayList;
import java.util.List;

import com.example.clients.dao.entities.Address;
import com.example.clients.dao.entities.CatalogCodeDesc;
import com.example.clients.dao.entities.Client;
import com.example.clients.dao.entities.Credential;
import com.example.clients.dao.entities.Name;
import com.example.clients.dao.entities.Nationality;

public class FactoryClient {
	
	public static Client createClient() {
		Client client = new Client();
		
		client.setId("111111");
		client.setName(createName());
		client.setGenre(createCatalogCodeDesc("M","Male"));
		client.setCredential(createCredential());	
		
		List<CatalogCodeDesc> identifiers = new ArrayList<>();
		identifiers.add(createCatalogCodeDesc("RAVI9011M22","RFC"));
		identifiers.add(createCatalogCodeDesc("RAVI90HDFMNG01","CURP"));
		client.setIdentifications(identifiers);
		
		List<Address> addresses = new ArrayList<>();
		addresses.add(createAddress());
		
		client.setNationality(createNationality());
		
		return client;
	}
	
	private static Credential createCredential() {
		final Credential credential = new Credential();
		credential.setUsername("user1");
		credential.setPassword("12345");
		
		return credential;
	}
	
	private static Name createName() {
		final Name name = new Name();
		name.setName("Jose");
		name.setLastName("Ramos");
		name.setSecondLastName("Vanegas");
		
		return name;
	}
	
	private static Nationality createNationality() {
		final Nationality nationality =  new Nationality();
		nationality.setBornCountry(createCatalogCodeDesc("MX", "México"));
		
		List<CatalogCodeDesc> nationalities = new ArrayList<CatalogCodeDesc>();
		nationalities.add(createCatalogCodeDesc("MX", "mexicana"));
		nationalities.add(createCatalogCodeDesc("EU", "estadounidense"));
		nationality.setNationalities(nationalities);
		
		return nationality;
	}
		
	private static Address createAddress() {
		final Address address = new Address();
		address.setStreet("Miguel Hidalgo");
		address.setNumber("10");
		address.setSuburb("Xalpa");
		address.setTownship(createCatalogCodeDesc("01", "Toluca"));
		address.setCountry(createCatalogCodeDesc("MX", "México"));
		
		return address;
	}
	
	private static CatalogCodeDesc createCatalogCodeDesc(final String code, 
			final String description) {
		final CatalogCodeDesc catalogCodeDesc = new CatalogCodeDesc();
		catalogCodeDesc.setCode(code);
		catalogCodeDesc.setDescription(description);
		
		return catalogCodeDesc;
	}

}
