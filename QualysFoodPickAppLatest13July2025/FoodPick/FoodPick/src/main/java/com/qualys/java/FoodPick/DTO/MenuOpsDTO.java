package com.qualys.java.FoodPick.DTO;

public class MenuOpsDTO {

	private int item_id;
	private String item_name;
	private double item_price;
	private int rest_id;

	public MenuOpsDTO(int item_id, String item_name, double item_price, int rest_id) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.item_price = item_price;
		this.rest_id = rest_id;
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

	public int getRest_id() {
		return rest_id;
	}

	public void setRest_id(int rest_id) {
		this.rest_id = rest_id;
	}

}
