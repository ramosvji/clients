package com.example.clients.business.dtos;

import java.util.List;

public class NationalityDtoInt {
	
	private CatalogCodeDescDtoInt bornCountry;
	private List<CatalogCodeDescDtoInt> nationalities;
	
	public CatalogCodeDescDtoInt getBornCountry() {
		return bornCountry;
	}
	
	public void setBornCountry(CatalogCodeDescDtoInt bornCountry) {
		this.bornCountry = bornCountry;
	}
	
	public List<CatalogCodeDescDtoInt> getNationalities() {
		return nationalities;
	}
	
	public void setNationalities(List<CatalogCodeDescDtoInt> nationalities) {
		this.nationalities = nationalities;
	}

}
