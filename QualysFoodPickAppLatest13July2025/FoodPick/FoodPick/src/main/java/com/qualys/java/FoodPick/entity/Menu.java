package com.qualys.java.FoodPick.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Menu {

	@Id
	private int menuId;
	@Column
	private int restId;
	@Column
	private String menuItems;
	@Column
	private double itemPrice;
	
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public int getRestId() {
		return restId;
	}
	public void setRestId(int restId) {
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
		
}