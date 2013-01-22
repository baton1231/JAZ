package com.example.jsfdemo.web;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jsfdemo.domain.Flight;

import com.example.jsfdemo.service.FlightManager;



@SessionScoped
@Named("flightBean")
public class FlightFormBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Flight flight = new Flight();

	private ListDataModel<Flight> flights = new ListDataModel<Flight>();

	@Inject
	private FlightManager pm;

	public Flight getFlight() {
		return flight;
	}

	public void setPerson(Flight flight) {
		this.flight = flight;
	}

	public ListDataModel<Flight> getAllFlights() {
		flights.setWrappedData(pm.getAllFlights());
		return flights;
	}

	// Actions
	public String addPerson() {
		pm.addFlight(flight);
		return "showFlights";
		//return null;
	}

}
