package com.qualys.java.FoodPick.entity;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OneToOne;

@Entity
public class CustFoodOrder {

	@Id
	@Column(name = "cf_order_id")
	private int cf_order_id;

	@OneToOne
	@JoinColumn(name = "rest_id", referencedColumnName = "rest_id")
	private Restaurant rest_id;

	@OneToOne
	@JoinColumn(name = "cust_id", referencedColumnName = "cust_id")
	private Customer cust_id;

	@Column(name = "cust_Phone_No")
	private long cust_Phone_No;

	@OneToOne
	@JoinColumn(name = "cust_addr_id", referencedColumnName = "cust_addr_id")
	private CustAddr cust_addr_id;

	@Column(name = "cf_order_date")
	private LocalDateTime cf_order_date;

	@ElementCollection
	@CollectionTable(name = "item_price", joinColumns = @JoinColumn(name = "cf_order_id"))
	@MapKeyColumn(name = "item_name")
	@Column(name = "item_price")
	private Map<String, Double> item_price_map = new HashMap<>();

	@Column(name = "cf_order_quantity")
	private double cf_order_quantity;

	@Column(name = "cf_order_amount")
	private double cf_order_amount;

	@Column(name = "cf_order_status")
	private String cf_order_status;

	@Column(name = "cf_order_delivery_location")
	private String cf_order_delivery_location;

	public CustFoodOrder(int cf_order_id, Restaurant rest_id, Customer cust_id, long cust_Phone_No,
			CustAddr cust_addr_id, LocalDateTime cf_order_date, Map<String, Double> item_price_map,
			double cf_order_quantity, double cf_order_amount, String cf_order_status,
			String cf_order_delivery_location) {
		super();
		this.cf_order_id = cf_order_id;
		this.rest_id = rest_id;
		this.cust_id = cust_id;
		this.cust_Phone_No = cust_Phone_No;
		this.cust_addr_id = cust_addr_id;
		this.cf_order_date = cf_order_date;
		this.item_price_map = item_price_map;
		this.cf_order_quantity = cf_order_quantity;
		this.cf_order_amount = cf_order_amount;
		this.cf_order_status = cf_order_status;
		this.cf_order_delivery_location = cf_order_delivery_location;
	}

	public CustFoodOrder() {
		super();
	}

	public int getCf_order_id() {
		return cf_order_id;
	}

	public void setCf_order_id(int cf_order_id) {
		this.cf_order_id = cf_order_id;
	}

	public Restaurant getRest_id() {
		return rest_id;
	}

	public void setRest_id(Restaurant rest_id) {
		this.rest_id = rest_id;
	}

	public Customer getCust_id() {
		return cust_id;
	}

	public void setCust_id(Customer cust_id) {
		this.cust_id = cust_id;
	}

	public long getCust_Phone_No() {
		return cust_Phone_No;
	}

	public void setCust_Phone_No(long cust_Phone_No) {
		this.cust_Phone_No = cust_Phone_No;
	}

	public CustAddr getCust_addr_id() {
		return cust_addr_id;
	}

	public void setCust_addr_id(CustAddr cust_addr_id) {
		this.cust_addr_id = cust_addr_id;
	}

	public LocalDateTime getCf_order_date() {
		return cf_order_date;
	}

	public void setCf_order_date(LocalDateTime cf_order_date) {
		this.cf_order_date = cf_order_date;
	}

	public Map<String, Double> getItem_price_map() {
		return item_price_map;
	}

	public void setItem_price_map(Map<String, Double> item_price_map) {
		this.item_price_map = item_price_map;
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

	public String getCf_order_delivery_location() {
		return cf_order_delivery_location;
	}

	public void setCf_order_delivery_location(String cf_order_delivery_location) {
		this.cf_order_delivery_location = cf_order_delivery_location;
	}

}