package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="passengerInfo")
public class Passenger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="passengerId")
	private int passengerId;
	@Column(name="passengerName")
	private String passengerName;
	@Column(name="email")
	private String email;
	@Column(name="source")
	private String source;
	@Column(name="destination")
	private String destination;
	
	@Column(name="fare")
	private int fare;

	public Passenger() {
		super();
	}

	public Passenger(int passengerId, String passengerName, String email, String source, String destination, int fare) {
		super();
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.email = email;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", passengerName=" + passengerName + ", email=" + email
				+ ", source=" + source + ", destination=" + destination + ", fare=" + fare + "]";
	}
	

}
 