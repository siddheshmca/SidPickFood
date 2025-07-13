package com.qualys.java.FoodPick.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	private int custID;
	@Column
	private String custName;
	@Column
	private String custAddr;
	@Column
	private long custPhoneNo;

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddr() {
		return custAddr;
	}

	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}

	public long getCustPhoneNo() {
		return custPhoneNo;
	}

	public void setCustPhoneNo(long custPhoneNo) {
		this.custPhoneNo = custPhoneNo;
	}

	public Customer(int custID, String custName, String custAddr, long custPhoneNo) {
		super();
		this.custID = custID;
		this.custName = custName;
		this.custAddr = custAddr;
		this.custPhoneNo = custPhoneNo;
	}

	public Customer() {
		super();
	}

}