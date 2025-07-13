package com.qualys.java.FoodPick.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CustomerFoodOrder {
	
	@Id
	private int orderId;
	@Column
	private int restaurantId;
	@Column
	private int customerId;

}
