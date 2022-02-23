package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="userId")
	private int userId;
    @Column(name="userName")
	private String userName;
    @Column(name="userNum")
	private int userNum;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   // laptop_lapId
	private Laptop laptop;
    
    @OneToMany(targetEntity = Product.class, cascade =CascadeType.ALL, fetch=FetchType.EAGER )
    @JoinColumn(name="userProducts", referencedColumnName = "userId")
    private List<Product> products;
	public User() {
		super();
	}
	
	public User(int userId, String userName, int userNum, Laptop laptop, List<Product> products) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userNum = userNum;
		this.laptop = laptop;
		this.products = products;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserNum() {
		return userNum;
	}
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userNum=" + userNum + ", laptop=" + laptop
				+ ", products=" + products + "]";
	}

	
	

}


