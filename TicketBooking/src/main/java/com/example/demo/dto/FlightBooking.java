package com.example.demo.dto;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.Payment;

public class FlightBooking {
	
	private Passenger passenger;
	private Payment payment;
	public FlightBooking() {
		super();
	}
	public FlightBooking(Passenger passenger, Payment payment) {
		super();
		this.passenger = passenger;
		this.payment = payment;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	

}
