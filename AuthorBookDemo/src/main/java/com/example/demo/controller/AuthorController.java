package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Author;

import com.example.demo.service.AuthorService;

@RestController
public class AuthorController{

	@Autowired
	private AuthorService authorService;
	 @PostMapping("/saveDetails")
	 public ResponseEntity<Author> saveUser(@RequestBody Author author) {
		 
		 Author AuthorData= authorService.saveUser(author);
		 return new ResponseEntity<Author>(AuthorData,HttpStatus.CREATED);
		 
	 }
	 
	 @GetMapping("/getDetails")
	 public ResponseEntity<List<Author>> getUser(){
	 return new ResponseEntity<List<Author>>(authorService.getAuthor(),HttpStatus.ACCEPTED);
       }
	

}
