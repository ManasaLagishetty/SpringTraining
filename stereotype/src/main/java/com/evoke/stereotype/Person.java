package com.evoke.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value("1")
 private int personId;
	@Value("Manasa")
 private String personName;
public Person() {
	super();
}
public Person(int personId, String personName) {
	super();
	this.personId = personId;
	this.personName = personName;
}

public int getPersonId() {
	return personId;
}
public void setPersonId(int personId) {
	this.personId = personId;
}

public String getPersonName() {
	return personName;
}
public void setPersonName(String personName) {
	this.personName = personName;
}
@Override
public String toString() {
	return "Person [personId=" + personId + ", personName=" + personName + "]";
}
 
 

}
