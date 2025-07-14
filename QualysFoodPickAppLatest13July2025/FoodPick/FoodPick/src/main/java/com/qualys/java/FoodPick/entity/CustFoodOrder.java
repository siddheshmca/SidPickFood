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
	@OneToOne
	@JoinColumn(name = "restaurantId", referencedColumnName = "restaurantId")
	private Restaurant restaurantId;
	@OneToOne
	@JoinColumn(name = "cust_id", referencedColumnName = "cust_id")
	private Customer cust_id;
	@Column
	private LocalDate orderDate;
	@Column
	private List<String> orderItems;
	@Column
	private double totalPrice;
	
	public CustFoodOrder() {
		super();
	}

	public CustFoodOrder(int orderId, Restaurant restaurantId, Customer cust_id, LocalDate orderDate,
			List<String> orderItems, double totalPrice) {
		super();
		this.orderId = orderId;
		this.restaurantId = restaurantId;
		this.cust_id = cust_id;
		this.orderDate = orderDate;
		this.orderItems = orderItems;
		this.totalPrice = totalPrice;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Restaurant getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Restaurant restaurantId) {
		this.restaurantId = restaurantId;
	}

	public Customer getCust_id() {
		return cust_id;
	}

	public void setCust_id(Customer cust_id) {
		this.cust_id = cust_id;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public List<String> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<String> orderItems) {
		this.orderItems = orderItems;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}