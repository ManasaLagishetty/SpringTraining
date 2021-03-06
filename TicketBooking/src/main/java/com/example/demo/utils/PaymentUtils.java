package com.example.demo.utils;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.exception.InsuficientAmountException;

public class PaymentUtils {
	
	private static Map<String,Integer> paymentMap=new HashMap<>();
	
	static {
		paymentMap.put("acc1",12000);
		paymentMap.put("acc2",10000);
		paymentMap.put("acc3",5000);
		paymentMap.put("acc4",8000);
	}
	
	public static boolean validateAccoutBalance(String accNo, int paidAmount) {
		if(paidAmount>paymentMap.get(accNo)) {
			throw new InsuficientAmountException("Insufficient Amount...");
		}
		
		else {
		return true;
		}
	}

}
