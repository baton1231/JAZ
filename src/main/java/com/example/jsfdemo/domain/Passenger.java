package com.example.jsfdemo.domain;

import javax.validation.constraints.Size;

public class Passenger {

	protected int id;
	protected String name;
	protected String surname;
	protected String destination;

	
	public Passenger() {

	}

	public Passenger(String destination) {
		this.destination = destination;
	}
	
	
	@Size(min = 1)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

}
