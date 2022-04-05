package com.model;

import java.sql.Date;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Flight {
	@Id
	@GeneratedValue
	private int id;
	private String departureLocation;
	private String arrivalLocation;
	@OneToOne
	private Fleet fleet;
	@OneToOne
	private FlightStatus status;
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date departureTime;
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date arrivalTime;
	public Flight() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartureLocation() {
		return departureLocation;
	}
	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}
	public String getArrivalLocation() {
		return arrivalLocation;
	}
	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}
	public Fleet getFleet() {
		return fleet;
	}
	public void setFleet(Fleet fleet) {
		this.fleet = fleet;
	}
	public FlightStatus getStatus() {
		return status;
	}
	public void setStatus(FlightStatus status) {
		this.status = status;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	

}
