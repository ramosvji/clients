package com.example.clients.exposure.dtos;

import java.io.Serializable;
import java.util.List;

public class ClientDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	private NameDto name;
	private List<CatalogCodeDescDto> identifications;
	private List<AddressDto> addresses;
	private CatalogCodeDescDto genre;
	private NationalityDto nationality;
	private Credential credential;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public NameDto getName() {
		return name;
	}
	
	public void setName(NameDto name) {
		this.name = name;
	}
	
	public List<CatalogCodeDescDto> getIdentifications() {
		return identifications;
	}
	
	public void setIdentifications(List<CatalogCodeDescDto> identifications) {
		this.identifications = identifications;
	}
	
	public List<AddressDto> getAddresses() {
		return addresses;
	}
	
	public void setAddresses(List<AddressDto> addresses) {
		this.addresses = addresses;
	}
	
	public CatalogCodeDescDto getGenre() {
		return genre;
	}
	
	public void setGenre(CatalogCodeDescDto genre) {
		this.genre = genre;
	}
	
	public NationalityDto getNationality() {
		return nationality;
	}

	public void setNationality(NationalityDto nationality) {
		this.nationality = nationality;
	}

	public Credential getCredential() {
		return credential;
	}
	
	public void setCredential(Credential credential) {
		this.credential = credential;
	}
	
}
