package com.qualys.java.FoodPick.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Menu {

	@Id
	@Column(name = "item_id")
	private int item_id;

	@Column(name = "item_name", nullable = false, length = 255)
	private String item_name;

	@Column(name = "item_price", nullable = false)
	private double item_price;

	@ManyToOne
	@JoinColumn(name = "rest_id")
	private Restaurant rest_id;

	public Menu(int item_id, String item_name, double item_price, Restaurant rest_id) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.item_price = item_price;
		this.rest_id = rest_id;
	}

	public Menu() {
		super();
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public double getItem_price() {
		return item_price;
	}

	public void setItem_price(double item_price) {
		this.item_price = item_price;
	}

	public Restaurant getRest_id() {
		return rest_id;
	}

	public void setRest_id(Restaurant rest_id) {
		this.rest_id = rest_id;
	}

}