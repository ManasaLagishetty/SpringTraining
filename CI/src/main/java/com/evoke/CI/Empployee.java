package com.evoke.CI;

public class Empployee {
	private int empId;
	private String empName;
	public Empployee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Empployee [empId=" + empId + ", empName=" + empName + "]";
	}
	

}
