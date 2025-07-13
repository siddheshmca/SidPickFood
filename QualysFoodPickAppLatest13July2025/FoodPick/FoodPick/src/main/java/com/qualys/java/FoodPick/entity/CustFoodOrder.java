package com.qualys.java.FoodPick.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CustFoodOrder {
	
	@Id
	private int orderId;
	@Column
	private int restaurantId;
	@Column
	private int customerId;
	@Column
	private LocalDate orderDate;
	

}
