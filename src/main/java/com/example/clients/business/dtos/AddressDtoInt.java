package com.example.clients.business.dtos;

public class AddressDtoInt {
	
	private String street;
	private String number;
	private String suburb;
	private CatalogCodeDescDtoInt township;
	private CatalogCodeDescDtoInt state;
	private CatalogCodeDescDtoInt country;
	
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
	
	public CatalogCodeDescDtoInt getTownship() {
		return township;
	}
	
	public void setTownship(CatalogCodeDescDtoInt township) {
		this.township = township;
	}
	
	public CatalogCodeDescDtoInt getState() {
		return state;
	}
	
	public void setState(CatalogCodeDescDtoInt state) {
		this.state = state;
	}
	
	public CatalogCodeDescDtoInt getCountry() {
		return country;
	}
	
	public void setCountry(CatalogCodeDescDtoInt country) {
		this.country = country;
	}

}
