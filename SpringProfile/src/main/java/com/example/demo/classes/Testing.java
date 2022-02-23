package com.example.demo.classes;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class Testing implements Production {

	@Override
	public void getDetails() {
	System.out.println("message from Test Environment");
	}

}
