package com.example.clients.dao.entities;

import java.io.Serializable;

public class Address implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String street;
	private String number;
	private String suburb;
	private CatalogCodeDesc township;
	private CatalogCodeDesc state;
	private CatalogCodeDesc country;
	
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
	
	public CatalogCodeDesc getTownship() {
		return township;
	}
	
	public void setTownship(CatalogCodeDesc township) {
		this.township = township;
	}
	
	public CatalogCodeDesc getState() {
		return state;
	}
	
	public void setState(CatalogCodeDesc state) {
		this.state = state;
	}
	
	public CatalogCodeDesc getCountry() {
		return country;
	}
	
	public void setCountry(CatalogCodeDesc country) {
		this.country = country;
	}
	
}
