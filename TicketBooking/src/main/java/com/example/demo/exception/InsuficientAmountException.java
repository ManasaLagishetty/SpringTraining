package com.example.demo.exception;

public class InsuficientAmountException extends RuntimeException {
	
	public InsuficientAmountException(String msg) {
		super(msg);
	}

}
