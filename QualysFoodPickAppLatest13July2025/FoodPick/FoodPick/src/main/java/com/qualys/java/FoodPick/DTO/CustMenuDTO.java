package com.qualys.java.FoodPick.DTO;

public class CustMenuDTO {

	private String item_name;
	private double item_price;
	private double item_quantity;

	public CustMenuDTO(String item_name, double item_price, double item_quantity) {
		super();
		this.item_name = item_name;
		this.item_price = item_price;
		this.item_quantity = item_quantity;
	}

	public CustMenuDTO() {
		super();
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

	public double getItem_quantity() {
		return item_quantity;
	}

	public void setItem_quantity(double item_quantity) {
		this.item_quantity = item_quantity;
	}

}