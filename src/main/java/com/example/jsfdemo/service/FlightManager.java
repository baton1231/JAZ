package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Flight;


@ApplicationScoped
public class FlightManager {
	private List<Flight> db = new ArrayList<Flight>();

	public void addFlight(Flight Flight) {
		Flight newFlight = new Flight(null);

		newFlight.setId(Flight.getId());
		newFlight.setDepartureTime(Flight.getDepartureTime());
		newFlight.setArrivalTime(Flight.getArrivalTime());
		newFlight.setId_airplane(Flight.getId_airplane());
		newFlight.setId_passenger(Flight.getId_passenger());
		
		db.add(newFlight);
	}


	public List<Flight> getAllFlights() {
		return db;
	}
}
