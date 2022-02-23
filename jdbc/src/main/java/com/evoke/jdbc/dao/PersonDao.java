package com.evoke.jdbc.dao;

import java.util.List;

import com.evoke.jdbc.entity.Person;

public interface PersonDao {
	
	public int save(Person person);
	public int update(Person person);
	public int delete(int id);
	public Person getPerson(int id);
	public List<Person> getAllRecords();

}
