package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.classes.Production;



@SpringBootApplication
public class SpringProfileApplication implements CommandLineRunner{
	
	@Autowired
	private Production production;

	public static void main(String[] args) {
	   SpringApplication.run(SpringProfileApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	   production.getDetails();
		
	}
  
	
   }


