package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.Acknowledgement;
import com.example.demo.dto.FlightBooking;
import com.example.demo.entity.Passenger;
import com.example.demo.entity.Payment;
import com.example.demo.repository.PassengerRepo;
import com.example.demo.repository.PaymentRepo;
import com.example.demo.utils.PaymentUtils;

@Service
public class PassengerService {
	
	@Autowired
	private PassengerRepo passengerRepo;
	
	@Autowired
	private PaymentRepo paymentRepo;
	
	
//	@Transactional(readOnly = false, isolation= Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED);
   @Transactional
	public Acknowledgement savePassenger(FlightBooking  booking) {
	
		
	    Passenger passenger =booking.getPassenger();
	    
	   passenger= passengerRepo.save(passenger);
	   
	   
	   
	   Payment payment =booking.getPayment();
	   
	   PaymentUtils.validateAccoutBalance(payment.getAccountNo(),passenger.getFare());
	   
	   payment.setPassenegerId(passenger.getPassengerId());
	   payment.setAmount(passenger.getFare());
	   
	   paymentRepo.save(payment);
	   
		return new Acknowledgement(passenger);
		
		
}
}
