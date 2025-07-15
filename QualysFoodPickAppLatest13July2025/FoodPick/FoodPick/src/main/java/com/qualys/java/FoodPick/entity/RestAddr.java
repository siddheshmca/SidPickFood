package com.qualys.java.FoodPick.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class RestAddr {

	@Id
	@Column(name = "rest_addr_id")
	private int rest_addr_id;

	@OneToOne
	@JoinColumn(name = "rest_id", referencedColumnName = "rest_id")
	private Restaurant rest_id;

	@Column(name = "rest_shop_no")
	private int rest_shop_no;

	@Column(name = "rest_street_name")
	private String rest_street_name;

	@Column(name = "rest_floor_num")
	private int rest_floor_num;

	@Column(name = "rest_area")
	private String rest_area;

	@Column(name = "rest_city")
	private String rest_city;

	@Column(name = "rest_state")
	private String rest_state;

	@Column(name = "rest_pin_code")
	private int rest_pin_code;

	public RestAddr(int rest_addr_id, Restaurant rest_id, int rest_shop_no, String rest_street_name, int rest_floor_num,
			String rest_area, String rest_city, String rest_state, int rest_pin_code) {
		super();
		this.rest_addr_id = rest_addr_id;
		this.rest_id = rest_id;
		this.rest_shop_no = rest_shop_no;
		this.rest_street_name = rest_street_name;
		this.rest_floor_num = rest_floor_num;
		this.rest_area = rest_area;
		this.rest_city = rest_city;
		this.rest_state = rest_state;
		this.rest_pin_code = rest_pin_code;
	}

	public RestAddr() {
		super();
	}

	public int getRest_addr_id() {
		return rest_addr_id;
	}

	public void setRest_addr_id(int rest_addr_id) {
		this.rest_addr_id = rest_addr_id;
	}

	public Restaurant getRest_id() {
		return rest_id;
	}

	public void setRest_id(Restaurant rest_id) {
		this.rest_id = rest_id;
	}

	public int getRest_shop_no() {
		return rest_shop_no;
	}

	public void setRest_shop_no(int rest_shop_no) {
		this.rest_shop_no = rest_shop_no;
	}

	public String getRest_street_name() {
		return rest_street_name;
	}

	public void setRest_street_name(String rest_street_name) {
		this.rest_street_name = rest_street_name;
	}

	public int getRest_floor_num() {
		return rest_floor_num;
	}

	public void setRest_floor_num(int rest_floor_num) {
		this.rest_floor_num = rest_floor_num;
	}

	public String getRest_area() {
		return rest_area;
	}

	public void setRest_area(String rest_area) {
		this.rest_area = rest_area;
	}

	public String getRest_city() {
		return rest_city;
	}

	public void setRest_city(String rest_city) {
		this.rest_city = rest_city;
	}

	public String getRest_state() {
		return rest_state;
	}

	public void setRest_state(String rest_state) {
		this.rest_state = rest_state;
	}

	public int getRest_pin_code() {
		return rest_pin_code;
	}

	public void setRest_pin_code(int rest_pin_code) {
		this.rest_pin_code = rest_pin_code;
	}

}