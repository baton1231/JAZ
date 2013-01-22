package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Airplane;

@ApplicationScoped
public class AirplaneManager {
	private List<Airplane> db = new ArrayList<Airplane>();

	public void addAirplane(Airplane Airplane) {
		Airplane newAirplane = new Airplane(null);

		newAirplane.setName(Airplane.getName());
		newAirplane.setOwner(Airplane.getOwner());
		newAirplane.setCapacity(Airplane.getCapacity());
		newAirplane.setPilots(Airplane.getPilots());

		db.add(newAirplane);
	}


	public List<Airplane> getAllAirplanes() {
		return db;
	}
}
