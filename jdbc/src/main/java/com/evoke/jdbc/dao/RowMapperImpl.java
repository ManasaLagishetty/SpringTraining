package com.evoke.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.evoke.jdbc.entity.Person;

public class RowMapperImpl implements RowMapper<Person> {

	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		Person person=new Person();
		person.setId(rs.getInt(1));
		person.setName(rs.getString(2));
		person.setCity(rs.getString(3));
		
		return person;
	}
	

}
