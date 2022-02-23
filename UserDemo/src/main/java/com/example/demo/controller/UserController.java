package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
     @Autowired
	private UserService userService;
	 
	 @PostMapping("/saveDetails")
	 public ResponseEntity<User> saveUser(@RequestBody User user) {
		 
		User userData= userService.saveUser(user);
		 return new ResponseEntity<User>(userData,HttpStatus.CREATED);
		 
	 }
	 
	 @GetMapping("/getDetails")
	 public ResponseEntity<List<User>> getUser(){
	 return new ResponseEntity<List<User>>(userService.getUser(),HttpStatus.ACCEPTED);
       }}