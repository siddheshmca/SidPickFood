package com.qualys.java.FoodPick.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Restaurant {

	@Id
	private int restaurantId;
	@Column
	private String restaurantName;
	@Column
	private String restaurantLocation;
	@Column
	private String restaurantCategory;
	
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantLocation() {
		return restaurantLocation;
	}
	public void setRestaurantLocation(String restaurantLocation) {
		this.restaurantLocation = restaurantLocation;
	}
	public String getRestaurantCategory() {
		return restaurantCategory;
	}
	public void setRestaurantCategory(String restaurantCategory) {
		this.restaurantCategory = restaurantCategory;
	}
	
}