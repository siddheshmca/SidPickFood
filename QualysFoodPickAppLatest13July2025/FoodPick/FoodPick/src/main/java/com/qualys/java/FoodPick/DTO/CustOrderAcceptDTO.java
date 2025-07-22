package com.qualys.java.FoodPick.DTO;

import java.time.LocalDateTime;
import java.util.Map;

public class CustOrderAcceptDTO {

	// @Column(name = "cust_id") from Customer Table
	private int cust_id;

	// @Column(name = "cust_addr_id") from CUST_ADDR Table
	private int cust_addr_id;

	// @Column(name = "rest_id") from Restaurant Table
	private int rest_id;
	// @Column(name = "rest_addr_id") from REST_ADDR Table
	private int rest_addr_id;

	private LocalDateTime cf_order_date;

	/*
	 * From Menu Table
	 * 
	 * @Column(name = "item_name", nullable = false, length = 255) private String
	 * item_name;
	 * 
	 * @Column(name = "item_price", nullable = false) private double item_price;
	 * 
	 * @Column(name = "item_id") from MENU Table //private int item_id; Fetch
	 * itemPriceMap with this field from Menu Table
	 */
	private Map<String, Double> itemPriceMap;
	private double cf_order_quantity;
	private double cf_order_amount;
	private String cf_order_status;
	private String cf_restaurant_location;
	private String cf_order_delivery_location;

	public CustOrderAcceptDTO(int cust_id, int cust_addr_id, int rest_id, int rest_addr_id, LocalDateTime cf_order_date,
			Map<String, Double> itemPriceMap, double cf_order_quantity, double cf_order_amount, String cf_order_status,
			String cf_restaurant_location, String cf_order_delivery_location) {
		super();
		this.cust_id = cust_id;
		this.cust_addr_id = cust_addr_id;
		this.rest_id = rest_id;
		this.rest_addr_id = rest_addr_id;
		this.cf_order_date = cf_order_date;
		this.itemPriceMap = itemPriceMap;
		this.cf_order_quantity = cf_order_quantity;
		this.cf_order_amount = cf_order_amount;
		this.cf_order_status = cf_order_status;
		this.cf_restaurant_location = cf_restaurant_location;
		this.cf_order_delivery_location = cf_order_delivery_location;
	}

	public CustOrderAcceptDTO() {
		super();
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public int getCust_addr_id() {
		return cust_addr_id;
	}

	public void setCust_addr_id(int cust_addr_id) {
		this.cust_addr_id = cust_addr_id;
	}

	public int getRest_id() {
		return rest_id;
	}

	public void setRest_id(int rest_id) {
		this.rest_id = rest_id;
	}

	public int getRest_addr_id() {
		return rest_addr_id;
	}

	public void setRest_addr_id(int rest_addr_id) {
		this.rest_addr_id = rest_addr_id;
	}

	public LocalDateTime getCf_order_date() {
		return cf_order_date;
	}

	public void setCf_order_date(LocalDateTime cf_order_date) {
		this.cf_order_date = cf_order_date;
	}

	public Map<String, Double> getItemPriceMap() {
		return itemPriceMap;
	}

	public void setItemPriceMap(Map<String, Double> itemPriceMap) {
		this.itemPriceMap = itemPriceMap;
	}

	public double getCf_order_quantity() {
		return cf_order_quantity;
	}

	public void setCf_order_quantity(double cf_order_quantity) {
		this.cf_order_quantity = cf_order_quantity;
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