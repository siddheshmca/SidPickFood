package com.qualys.java.FoodPick.DTO;

import java.time.LocalDateTime;
import java.util.List;

public class CustOrderDTO {

	private LocalDateTime cf_order_date;
	private List<CustMenuDTO> item_price_map;
	private double cf_order_amount;
	private String cf_order_status;
	private String cf_restaurant_location;
	private String cf_order_delivery_location;

	public CustOrderDTO(LocalDateTime cf_order_date, List<CustMenuDTO> item_price_map, double cf_order_amount,
			String cf_order_status, String cf_restaurant_location, String cf_order_delivery_location) {
		super();
		this.cf_order_date = cf_order_date;
		this.item_price_map = item_price_map;
		this.cf_order_amount = cf_order_amount;
		this.cf_order_status = cf_order_status;
		this.cf_restaurant_location = cf_restaurant_location;
		this.cf_order_delivery_location = cf_order_delivery_location;
	}

	public CustOrderDTO() {
		super();
	}

	public LocalDateTime getCf_order_date() {
		return cf_order_date;
	}

	public void setCf_order_date(LocalDateTime cf_order_date) {
		this.cf_order_date = cf_order_date;
	}

	public List<CustMenuDTO> getItem_price_map() {
		return item_price_map;
	}

	public void setItem_price_map(List<CustMenuDTO> item_price_map) {
		this.item_price_map = item_price_map;
	}

	public double getCf_order_amount() {
		return cf_order_amount;
	}

	public void setCf_order_amount(double cf_order_amount) {
		this.cf_order_amount = cf_order_amount;
	}

	public String getCf_order_status() {
		return cf_order_status;
	}

	public void setCf_order_status(String cf_order_status) {
		this.cf_order_status = cf_order_status;
	}

	public String getCf_restaurant_location() {
		return cf_restaurant_location;
	}

	public void setCf_restaurant_location(String cf_restaurant_location) {
		this.cf_restaurant_location = cf_restaurant_location;
	}

	public String getCf_order_delivery_location() {
		return cf_order_delivery_location;
	}

	public void setCf_order_delivery_location(String cf_order_delivery_location) {
		this.cf_order_delivery_location = cf_order_delivery_location;
	}

}