package com.example.clients.business.dtos;

import java.util.List;

public class ClientDtoInt {
	
	private String id;
	private NameDtoInt name;
	private List<CatalogCodeDescDtoInt> identifications;
	private List<AddressDtoInt> addresses;
	private CatalogCodeDescDtoInt genre;
	private NationalityDtoInt nationality;
	private CredentialDtoInt credential;
	
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
	
	public List<CatalogCodeDescDtoInt> getIdentifications() {
		return identifications;
	}
	
	public void setIdentifications(List<CatalogCodeDescDtoInt> identifications) {
		this.identifications = identifications;
	}
	
	public List<AddressDtoInt> getAddresses() {
		return addresses;
	}
	
	public void setAddresses(List<AddressDtoInt> addresses) {
		this.addresses = addresses;
	}
	
	public CatalogCodeDescDtoInt getGenre() {
		return genre;
	}
	
	public void setGenre(CatalogCodeDescDtoInt genre) {
		this.genre = genre;
	}
	
	public NationalityDtoInt getNationality() {
		return nationality;
	}
	
	public void setNationality(NationalityDtoInt nationality) {
		this.nationality = nationality;
	}
	
	public CredentialDtoInt getCredential() {
		return credential;
	}
	
	public void setCredential(CredentialDtoInt credential) {
		this.credential = credential;
	}
	
}
