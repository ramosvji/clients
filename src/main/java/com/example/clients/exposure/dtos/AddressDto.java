package com.example.clients.exposure.dtos;

import java.io.Serializable;

public class AddressDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String street;
	private String number;
	private String suburb;
	private CatalogCodeDescDto township;
	private CatalogCodeDescDto state;
	private CatalogCodeDescDto country;
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getSuburb() {
		return suburb;
	}
	
	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}
	
	public CatalogCodeDescDto getTownship() {
		return township;
	}
	
	public void setTownship(CatalogCodeDescDto township) {
		this.township = township;
	}
	
	public CatalogCodeDescDto getState() {
		return state;
	}
	
	public void setState(CatalogCodeDescDto state) {
		this.state = state;
	}
	
	public CatalogCodeDescDto getCountry() {
		return country;
	}
	
	public void setCountry(CatalogCodeDescDto country) {
		this.country = country;
	}
	
}
