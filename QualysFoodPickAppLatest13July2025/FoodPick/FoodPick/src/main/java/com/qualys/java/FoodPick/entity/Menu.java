package com.qualys.java.FoodPick.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Menu {

	@Id
	private int menuId;
	@OneToOne
	@JoinColumn(name = "restaurantId", referencedColumnName = "restaurantId")
	private Restaurant restId;
	@Column
	private String menuItems;
	@Column
	private double itemPrice;
	@Column
	private String cuisine;
	
	public Menu(int menuId, Restaurant restId, String menuItems, double itemPrice, String cuisine) {
		super();
		this.menuId = menuId;
		this.restId = restId;
		this.menuItems = menuItems;
		this.itemPrice = itemPrice;
		this.cuisine = cuisine;
	}

	public Menu() {
		super();
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public Restaurant getRestId() {
		return restId;
	}

	public void setRestId(Restaurant restId) {
		this.restId = restId;
	}

	public String getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(String menuItems) {
		this.menuItems = menuItems;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	
}