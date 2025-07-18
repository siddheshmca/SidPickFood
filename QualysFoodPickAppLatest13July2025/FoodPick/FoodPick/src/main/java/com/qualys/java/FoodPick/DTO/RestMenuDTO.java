package com.qualys.java.FoodPick.DTO;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RestMenuDTO {

	private int rest_id;
	private String rest_name;
	private String rest_location;
	private long rest_phone_no;
	@JsonIgnore
	private String item_name;
	@JsonIgnore
	private double item_price;

	private Map<String, Double> itemANDprice = new LinkedHashMap<>();

	public RestMenuDTO(int rest_id, String rest_name, String rest_location, long rest_phone_no) {
		this.rest_id = rest_id;
		this.rest_name = rest_name;
		this.rest_location = rest_location;
		this.rest_phone_no = rest_phone_no;
	}

	@JsonProperty("itemANDprice")
	public Map<String, Double> getItemANDprice() {
		return itemANDprice;
	}

	public void addItem(String itemName, double itemPrice) {
		this.itemANDprice.put(itemName, itemPrice);
	}

	public RestMenuDTO() {
		super();
	}

	public int getRest_id() {
		return rest_id;
	}

	public void setRest_id(int rest_id) {
		this.rest_id = rest_id;
	}

	public String getRest_name() {
		return rest_name;
	}

	public void setRest_name(String rest_name) {
		this.rest_name = rest_name;
	}

	public String getRest_location() {
		return rest_location;
	}

	public void setRest_location(String rest_location) {
		this.rest_location = rest_location;
	}

	public long getRest_phone_no() {
		return rest_phone_no;
	}

	public void setRest_phone_no(long rest_phone_no) {
		this.rest_phone_no = rest_phone_no;
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

}