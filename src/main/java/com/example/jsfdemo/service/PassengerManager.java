package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Passenger;


@ApplicationScoped
public class PassengerManager {
	private List<Passenger> db = new ArrayList<Passenger>();

	public void addPassenger(Passenger Passenger) {
		Passenger newPassenger = new Passenger(null);

		newPassenger.setId(Passenger.getId());
		newPassenger.setName(Passenger.getName());
		newPassenger.setSurname(Passenger.getSurname());
		newPassenger.setDestination(Passenger.getDestination());
		
		db.add(newPassenger);
	}


	public List<Passenger> getAllPassengers() {
		return db;
	}
}
