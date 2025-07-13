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
	@JoinColumn(name = "custID", referencedColumnName = "custID")
	private Customer customerId;

	@OneToOne
	@JoinColumn(name = "orderId", referencedColumnName = "orderId")
	private CustFoodOrder orderId;

	@OneToOne
	@JoinColumn(name = "restaurantId", referencedColumnName = "restaurantId")
	private Restaurant restaurantId;

	@Column
	private double amount;

	public Payment(int paymentId, Customer customerId, CustFoodOrder orderId, Restaurant restaurantId, double amount) {
		super();
		this.paymentId = paymentId;
		this.customerId = customerId;
		this.orderId = orderId;
		this.restaurantId = restaurantId;
		this.amount = amount;
	}

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public CustFoodOrder getOrderId() {
		return orderId;
	}

	public void setOrderId(CustFoodOrder orderId) {
		this.orderId = orderId;
	}

	public Restaurant getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Restaurant restaurantId) {
		this.restaurantId = restaurantId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}