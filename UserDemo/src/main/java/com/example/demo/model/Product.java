package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserProducts")
public class Product {
	@Id
	@Column(name="pId")
	private int pId;
	@Column(name="pName")
	private String pName;
	@Column(name="numOfProducts")
	private int numOfProducts;
	public Product() {
		super();
	}
	public Product(int pId, String pName, int numOfProducts) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.numOfProducts = numOfProducts;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getNumOfProducts() {
		return numOfProducts;
	}
	public void setNumOfProducts(int numOfProducts) {
		this.numOfProducts = numOfProducts;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", numOfProducts=" + numOfProducts + "]";
	}
	
	

}
