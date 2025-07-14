package com.qualys.java.FoodPick.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Payment {

	@Id
	private int paymentId;

	@OneToOne
	@JoinColumn(name = "cust_id", referencedColumnName = "cust_id")
	private Customer cust_id;

	@OneToOne
	@JoinColumn(name = "orderId", referencedColumnName = "orderId")
	private CustFoodOrder orderId;

	@OneToOne
	@JoinColumn(name = "rest_id", referencedColumnName = "rest_id")
	private Restaurant rest_id;

	@Column
	private double amount;

	public Payment() {
		super();
	}

	public Payment(int paymentId, Customer cust_id, CustFoodOrder orderId, Restaurant rest_id, double amount) {
		super();
		this.paymentId = paymentId;
		this.cust_id = cust_id;
		this.orderId = orderId;
		this.rest_id = rest_id;
		this.amount = amount;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public Customer getCust_id() {
		return cust_id;
	}

	public void setCust_id(Customer cust_id) {
		this.cust_id = cust_id;
	}

	public CustFoodOrder getOrderId() {
		return orderId;
	}

	public void setOrderId(CustFoodOrder orderId) {
		this.orderId = orderId;
	}

	public Restaurant getRest_id() {
		return rest_id;
	}

	public void setRest_id(Restaurant rest_id) {
		this.rest_id = rest_id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}