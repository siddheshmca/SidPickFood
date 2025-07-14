package com.qualys.java.FoodPick.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Menu {

	@Id
	@Column(name = "menu_id")
	private int menu_id;

	@OneToOne
	@JoinColumn(name = "rest_id", referencedColumnName = "rest_id")
	private Restaurant rest_id;

	@Column(name = "menu_items")
	private String menu_items;

	@Column(name = "menu_item_price")
	private double menu_item_price;

	public Menu() {
		super();
	}

	public int getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}

	public Restaurant getRest_id() {
		return rest_id;
	}

	public void setRest_id(Restaurant rest_id) {
		this.rest_id = rest_id;
	}

	public String getMenu_items() {
		return menu_items;
	}

	public void setMenu_items(String menu_items) {
		this.menu_items = menu_items;
	}

	public double getMenu_item_price() {
		return menu_item_price;
	}

	public void setMenu_item_price(double menu_item_price) {
		this.menu_item_price = menu_item_price;
	}

	public Menu(int menu_id, Restaurant rest_id, String menu_items, double menu_item_price) {
		super();
		this.menu_id = menu_id;
		this.rest_id = rest_id;
		this.menu_items = menu_items;
		this.menu_item_price = menu_item_price;
	}

}