package com.example.demo.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="Book")
public class Book {
	@Id
	@Column(name="bookId")
	private int bookId;
	@Column(name="bookName")
	private String bookName;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER,mappedBy = "books" )
	private List<Author> authors;

	public Book() {
		super();
	}

	public Book(int bookId, String bookName, List<Author> authors) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authors = authors;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authors=" + authors + "]";
	}



}
