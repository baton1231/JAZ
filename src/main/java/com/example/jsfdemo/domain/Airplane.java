package com.example.jsfdemo.domain;

public class Airplane {
	private long id;
	private String name;
	private String owner;
	private String capacity;
	private String pilots;

	public Airplane(String name, String owner, String capacity, String pilots) {
		this.name = name;
		this.owner = owner;
		this.capacity = capacity;
		this.pilots = pilots;
	}

	public Airplane() {

	}

	public Airplane(String owner) {
		this.owner = owner;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getPilots() {
		return pilots;
	}

	public void setPilots(String pilots) {
		this.pilots = pilots;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airplane other = (Airplane) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
