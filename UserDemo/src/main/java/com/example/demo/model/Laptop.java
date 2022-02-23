package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserLaptop")
public class Laptop {
	@Id
	@Column(name="lapId")
	private int lapId;
	@Column(name="lapName")
	private String lapName;
	public Laptop() {
		super();
	}
	public Laptop(int lapId, String lapName) {
		super();
		this.lapId = lapId;
		this.lapName = lapName;
	}
	public int getLapId() {
		return lapId;
	}
	public void setLapId(int lapId) {
		this.lapId = lapId;
	}
	public String getLapName() {
		return lapName;
	}
	public void setLapName(String lapName) {
		this.lapName = lapName;
	}
	@Override
	public String toString() {
		return "Laptop [lapId=" + lapId + ", lapName=" + lapName + "]";
	}

	

}
