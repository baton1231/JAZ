package com.example.jsfdemo.domain;

public class Flight {

	private long id;
	private String departureTime;
	private String arrivalTime;
	private String destination;
	private int id_airplane;
	private int id_passenger;

	public Flight() {

	}

	public Flight(String departureTime, String arrivalTime, String destination,
			int id_airplane, int id_passenger) {
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.departureTime = destination;
		this.id_airplane = id_airplane;
		this.id_passenger = id_passenger;

	}



	public Flight(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	
	public Flight(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getId_airplane() {
		return id_airplane;
	}

	public void setId_airplane(int id_airplane) {
		this.id_airplane = id_airplane;
	}

	public int getId_passenger() {
		return id_passenger;
	}

	public void setId_passenger(int id_passenger) {
		this.id_passenger = id_passenger;
	}

}
