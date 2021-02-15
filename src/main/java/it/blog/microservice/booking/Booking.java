package it.blog.microservice.booking;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class Booking implements Serializable{

	@Id
	protected String code;
	
	protected String flightNumber;
	
	protected String name;
	
	protected String surname;
	
	protected String seat; 
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
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

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}
}
