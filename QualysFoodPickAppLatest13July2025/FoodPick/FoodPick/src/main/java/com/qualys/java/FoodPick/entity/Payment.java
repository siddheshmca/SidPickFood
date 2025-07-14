package com.qualys.java.FoodPick.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Payment {

	@Id
	@Column(name = "payment_id")
	private int payment_id;

	@OneToOne
	@JoinColumn(name = "cust_id", referencedColumnName = "cust_id")
	private Customer cust_id;

	@OneToOne
	@JoinColumn(name = "cf_order_id", referencedColumnName = "cf_order_id")
	private CustFoodOrder orderId;

	@OneToOne
	@JoinColumn(name = "rest_id", referencedColumnName = "rest_id")
	private Restaurant rest_id;

	@Column(name = "payment_total_amount")
	private double payment_total_amount;

	@Column(name = "payment_mode")
	private String payment_mode;

	@Column(name = "payment_status")
	private String payment_status;

	public Payment() {
		super();
	}

	public Payment(int payment_id, Customer cust_id, CustFoodOrder orderId, Restaurant rest_id,
			double payment_total_amount, String payment_mode, String payment_status) {
		super();
		this.payment_id = payment_id;
		this.cust_id = cust_id;
		this.orderId = orderId;
		this.rest_id = rest_id;
		this.payment_total_amount = payment_total_amount;
		this.payment_mode = payment_mode;
		this.payment_status = payment_status;
	}

	public int getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
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

	public double getPayment_total_amount() {
		return payment_total_amount;
	}

	public void setPayment_total_amount(double payment_total_amount) {
		this.payment_total_amount = payment_total_amount;
	}

	public String getPayment_mode() {
		return payment_mode;
	}

	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}

	public String getPayment_status() {
		return payment_status;
	}

	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}

}