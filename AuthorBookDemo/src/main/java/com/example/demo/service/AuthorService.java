package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Author;
import com.example.demo.repository.AuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository authorRepo;

	public Author saveUser(Author author) {
		return authorRepo.save(author);
	}

	public List<Author> getAuthor() {
		
		return authorRepo.findAll();
	}
	

}
