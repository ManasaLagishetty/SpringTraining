package com.example.demo.dto;

import com.example.demo.entity.Passenger;

public class Acknowledgement {

	private Passenger passenger;


	

	public Acknowledgement() {
		super();
	}

	public Acknowledgement(Passenger passenger) {
		super();
		this.passenger = passenger;
	}


	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	@Override
	public String toString() {
		return "Acknowledgement [passenger=" + passenger + "]";
	}
}
