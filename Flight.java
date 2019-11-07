package com.jpaprog1.model;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="flight")
public class Flight {
	@Id
	private String flightid;
	private String airline;
	private String source;
	private String destination;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="flightid")
	 private java.util.List<Booking> bookinglist= new ArrayList<Booking>();

	public String getFlightid() {
		return flightid;
	}

	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public java.util.List<Booking> getBookinglist() {
		return bookinglist;
	}

	public void setBookinglist(java.util.List<Booking> bookinglist) {
		this.bookinglist = bookinglist;
	}

	public Flight() {
		super();
	}

	public Flight(String flightid, String source, String destination, String airline,
			java.util.List<Booking> bookinglist) {
		super();
		this.flightid = flightid;
		this.source = source;
		this.destination = destination;
		this.airline = airline;
		this.bookinglist = bookinglist;
	}
	
	
	

}
