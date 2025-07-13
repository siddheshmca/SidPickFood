package com.qualys.java.FoodPick.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Payment {

	@Id
	private int paymentId;
	
	@Column
	private int customerId;
	
	@Column
	private int orderId;
	
	@Column
	private int restaurantId;
	
	@Column
	private double amount;

	

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public Payment() {
		super();
	}

	public Payment(int paymentId, int customerId, int orderId, int restaurantId, double amount) {
		super();
		this.paymentId = paymentId;
		this.customerId = customerId;
		this.orderId = orderId;
		this.restaurantId = restaurantId;
		this.amount = amount;
	}

}