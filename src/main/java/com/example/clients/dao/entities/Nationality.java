package com.example.clients.dao.entities;

import java.util.List;

public class Nationality {
	
	private CatalogCodeDesc bornCountry;
	private List<CatalogCodeDesc> nationalities;
	
	public CatalogCodeDesc getBornCountry() {
		return bornCountry;
	}
	
	public void setBornCountry(CatalogCodeDesc bornCountry) {
		this.bornCountry = bornCountry;
	}
	
	public List<CatalogCodeDesc> getNationalities() {
		return nationalities;
	}
	
	public void setNationalities(List<CatalogCodeDesc> nationalities) {
		this.nationalities = nationalities;
	}

}
