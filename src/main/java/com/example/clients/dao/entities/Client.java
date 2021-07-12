package com.example.clients.dao.entities;

import java.util.List;

import com.example.clients.business.dtos.NameDtoInt;

public class Client {
	
	private String id;
	private NameDtoInt name;
	private List<CatalogCodeDesc> identifications;
	private List<Address> addresses;
	private CatalogCodeDesc genre;
	private Nationality nationality;
	private Credential credential;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public NameDtoInt getName() {
		return name;
	}
	
	public void setName(NameDtoInt name) {
		this.name = name;
	}
	
	public List<CatalogCodeDesc> getIdentifications() {
		return identifications;
	}
	
	public void setIdentifications(List<CatalogCodeDesc> identifications) {
		this.identifications = identifications;
	}
	
	public List<Address> getAddresses() {
		return addresses;
	}
	
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	public CatalogCodeDesc getGenre() {
		return genre;
	}
	
	public void setGenre(CatalogCodeDesc genre) {
		this.genre = genre;
	}
	
	public Nationality getNationality() {
		return nationality;
	}
	
	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}
	
	public Credential getCredential() {
		return credential;
	}
	
	public void setCredential(Credential credential) {
		this.credential = credential;
	}
	
}
