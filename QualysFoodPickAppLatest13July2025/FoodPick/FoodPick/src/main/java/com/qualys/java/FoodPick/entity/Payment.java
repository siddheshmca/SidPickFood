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

	public Payment(int paymentId, int customerId, int orderId, int restaurantId) {
		super();
		this.paymentId = paymentId;
		this.customerId = customerId;
		this.orderId = orderId;
		this.restaurantId = restaurantId;
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
	
	
	
}
