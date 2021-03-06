package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Acknowledgement;
import com.example.demo.dto.FlightBooking;
import com.example.demo.service.PassengerService;

@RestController
public class PassengerController {

	@Autowired
	private PassengerService pService;
	
	@PostMapping("/save")
	public Acknowledgement savePassenger(@RequestBody FlightBooking booking) throws Exception {
		
		return pService.savePassenger(booking);
		
	}
}
