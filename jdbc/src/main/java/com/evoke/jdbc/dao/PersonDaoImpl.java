package com.evoke.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.evoke.jdbc.entity.Person;

public class PersonDaoImpl implements PersonDao {

	private JdbcTemplate jdbcTemplate;
	@Override
	public int save(Person person) {
		
		  String query="insert into person(id,name,city) values(?,?,?)";
		  
		int r=jdbcTemplate.update(query,person.getId(),person.getName(),person.getCity());
		return r;
	}
	
	@Override
	public int update(Person person) {
		String query="update person set name=?, city=? where id=? ";
		
		int r=jdbcTemplate.update(query,person.getName(),person.getCity(),person.getId());
  		return r;
	}
	

	@Override
	public int delete(int id) {
		
		
		String query="delete from person where id=?";
		int r=jdbcTemplate.update(query,id);
		return r;
	}
	

	@Override
	public Person getPerson(int id) {
		String query="select *  from person where id=?";
		RowMapper<Person> rowMapper=new RowMapperImpl();
		Person person=jdbcTemplate.queryForObject(query, rowMapper, id);
		return person;
	}
	

	@Override
	public List<Person> getAllRecords() {
		
		String query="select * from person";
	List<Person> list=jdbcTemplate.query(query, new RowMapperImpl());
		return list;
	}


	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
}
