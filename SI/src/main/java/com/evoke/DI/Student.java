package com.evoke.DI;

public class Student {
	private int id;
	private String name;
 private  String Address;
public Student() {
	super();
}
public Student(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.Address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	System.out.println("setting Id");
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	System.out.println("setting Name");
	this.name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	System.out.println("setting Address");
	Address = address;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", Address=" + Address + "]";
}
 
}
