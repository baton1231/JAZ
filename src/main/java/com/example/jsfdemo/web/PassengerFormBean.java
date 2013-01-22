package com.example.jsfdemo.web;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jsfdemo.domain.Passenger;
import com.example.jsfdemo.service.PassengerManager;

@SessionScoped
@Named("passengerBean")
public class PassengerFormBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Passenger passenger = new Passenger();

	private ListDataModel<Passenger> passengers = new ListDataModel<Passenger>();

	@Inject
	private PassengerManager pm;

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPerson(Passenger passenger) {
		this.passenger = passenger;
	}

	public ListDataModel<Passenger> getAllPassengers() {
		passengers.setWrappedData(pm.getAllPassengers());
		return passengers;
	}

	// Actions
	public String addPerson() {
		pm.addPassenger(passenger);
		return "showPassengers";
		//return null;
	}

}
