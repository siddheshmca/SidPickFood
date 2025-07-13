package com.qualys.java.FoodPick.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class CustFoodOrder {
	
	@Id
	private int orderId;
	@Column
	private int restaurantId;
	@OneToOne
	@JoinColumn(name = "custID", referencedColumnName = "custID")
	private int customerId;
	@Column
	private LocalDate orderDate;
	@Column
	private List<List<String>> orderItems;
	@Column
	private int totalPrice;
	
	public CustFoodOrder(int orderId, int restaurantId, int customerId, LocalDate orderDate,
			List<List<String>> orderItems, int totalPrice) {
		super();
		this.orderId = orderId;
		this.restaurantId = restaurantId;
		this.customerId = customerId;
		this.orderDate = orderDate;
		this.orderItems = orderItems;
		this.totalPrice = totalPrice;
	}

	public CustFoodOrder() {
		super();
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

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public List<List<String>> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<List<String>> orderItems) {
		this.orderItems = orderItems;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}