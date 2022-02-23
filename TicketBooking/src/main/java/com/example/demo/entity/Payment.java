package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paymentInfo")
public class Payment {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="paymentId")
	private int paymentId;
    @Column(name="acountNo")
	private  String accountNo;
	
	@Column(name="amount")
	private int  amount;
	@Column(name="passengerId")
	private int passenegerId;
	public Payment() {
		super();
	}
	public Payment(int paymentId, String accountNo, int amount, int passenegerId) {
		super();
		this.paymentId = paymentId;
		this.accountNo = accountNo;
		this.amount = amount;
		this.passenegerId = passenegerId;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPassenegerId() {
		return passenegerId;
	}
	public void setPassenegerId(int passenegerId) {
		this.passenegerId = passenegerId;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", accountNo=" + accountNo + ", amount=" + amount + ", passenegerId="
				+ passenegerId + "]";
	}
	
	
	
	
}