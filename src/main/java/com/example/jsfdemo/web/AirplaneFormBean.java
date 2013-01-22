package com.example.jsfdemo.web;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jsfdemo.domain.Airplane;
import com.example.jsfdemo.service.AirplaneManager;

@SessionScoped
@Named("airplaneBean")
public class AirplaneFormBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Airplane airplane = new Airplane();

	private ListDataModel<Airplane> airplanes = new ListDataModel<Airplane>();

	@Inject
	private AirplaneManager pm;

	public Airplane getAirplane() {
		return airplane;
	}

	public void setPerson(Airplane airplane) {
		this.airplane = airplane;
	}

	public ListDataModel<Airplane> getAllAirplanes() {
		airplanes.setWrappedData(pm.getAllAirplanes());
		return airplanes;
	}

	// Actions
	public String addPerson() {
		pm.addAirplane(airplane);
		return "showAirplanes";
		//return null;
	}

}
