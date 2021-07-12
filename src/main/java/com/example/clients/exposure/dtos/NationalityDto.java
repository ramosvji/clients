package com.example.clients.exposure.dtos;

import java.io.Serializable;
import java.util.List;

public class NationalityDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private CatalogCodeDescDto bornCountry;
	private List<CatalogCodeDescDto> nationalities;
	
	public CatalogCodeDescDto getBornCountry() {
		return bornCountry;
	}
	
	public void setBornCountry(CatalogCodeDescDto bornCountry) {
		this.bornCountry = bornCountry;
	}
	
	public List<CatalogCodeDescDto> getNationalities() {
		return nationalities;
	}
	
	public void setNationalities(List<CatalogCodeDescDto> nationalities) {
		this.nationalities = nationalities;
	}
	
}
