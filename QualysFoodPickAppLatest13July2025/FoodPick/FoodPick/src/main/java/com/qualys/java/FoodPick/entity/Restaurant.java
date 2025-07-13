package com.qualys.java.FoodPick.entity;

import java.util.List;

import com.qualys.java.FoodPick.converter.StringListConverter;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
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
	@Column
	@Convert(converter = StringListConverter.class)
	private List<String> restaurantMenu;
	
	public Restaurant(int restaurantId, String restaurantName, String restaurantLocation, String restaurantCategory,
			List<String> restaurantMenu) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.restaurantLocation = restaurantLocation;
		this.restaurantCategory = restaurantCategory;
		this.restaurantMenu = restaurantMenu;
	}

	public Restaurant() {
		super();
	}

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

	public List<String> getRestaurantMenu() {
		return restaurantMenu;
	}

	public void setRestaurantMenu(List<String> restaurantMenu) {
		this.restaurantMenu = restaurantMenu;
	}

}