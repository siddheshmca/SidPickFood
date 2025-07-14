package com.qualys.java.FoodPick.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	@Column(name = "cust_id")
	private int cust_id;

	@Column(name = "cust_Name")
	private String cust_Name;

	@Column(name = "cust_Addr")
	private String cust_Addr;

	@Column(name = "cust_Phone_No")
	private long cust_Phone_No;

	public Customer(int cust_id, String cust_Name, String cust_Addr, long cust_Phone_No) {
		super();
		this.cust_id = cust_id;
		this.cust_Name = cust_Name;
		this.cust_Addr = cust_Addr;
		this.cust_Phone_No = cust_Phone_No;
	}

	public Customer() {
		super();
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_Name() {
		return cust_Name;
	}

	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}

	public String getCust_Addr() {
		return cust_Addr;
	}

	public void setCust_Addr(String cust_Addr) {
		this.cust_Addr = cust_Addr;
	}

	public long getCust_Phone_No() {
		return cust_Phone_No;
	}

	public void setCust_Phone_No(long cust_Phone_No) {
		this.cust_Phone_No = cust_Phone_No;
	}

}