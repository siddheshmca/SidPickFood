package com.qualys.java.FoodPick.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
public class Customer {

	@Id
	@Column(name = "cust_id")
	private int cust_id;

	@Column(name = "cust_Name")
	@Pattern(regexp = "^[A-Za-z]+$", message = "Name must contain only letters")
	private String cust_Name;

	@Column(name = "cust_email")
	@Email(message = "Email should be valid (e.g. user@example.com)")
	private String cust_email;

	@NotBlank(message = "Phone number is required")
	@Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be exactly 10 digits")
	@Column(name = "cust_Phone_No")
	private long cust_Phone_No;

	public Customer(int cust_id, String cust_Name, String cust_email, long cust_Phone_No) {
		super();
		this.cust_id = cust_id;
		this.cust_Name = cust_Name;
		this.cust_email = cust_email;
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

	public String getCust_Email() {
		return cust_email;
	}

	public void setCust_Email(String cust_email) {
		this.cust_email = cust_email;
	}

	public long getCust_Phone_No() {
		return cust_Phone_No;
	}

	public void setCust_Phone_No(long cust_Phone_No) {
		this.cust_Phone_No = cust_Phone_No;
	}

}