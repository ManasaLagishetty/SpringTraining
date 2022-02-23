package com.example.demo.classes;




import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Dev")
public class Dev implements Production {

	@Override
	public void getDetails() {
		System.out.println("Message from Dev Environment");
	}

}
