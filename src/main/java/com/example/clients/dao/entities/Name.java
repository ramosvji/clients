package com.example.clients.dao.entities;

import java.io.Serializable;

public class Name implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String lastName;
	private String secondLastName;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getSecondLastName() {
		return secondLastName;
	}
	
	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}
	
}
