package com.qualys.java.FoodPick.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Restaurant {

	@Id
	@Column(name = "rest_id")
	private int rest_id;
	
	@Column(name = "rest_name")
	private String rest_name;
	
	@Column(name = "rest_location")
	private String rest_location;
	
	@Column(name = "rest_category")
	private String rest_category;
	
	@Column(name = "rest_menu")
	private String rest_menu;
	
	@Column(name = "rest_phone_no")
	private long rest_phone_no;

	public Restaurant(int rest_id, String rest_name, String rest_location, String rest_category, String rest_menu,
			long rest_phone_no) {
		super();
		this.rest_id = rest_id;
		this.rest_name = rest_name;
		this.rest_location = rest_location;
		this.rest_category = rest_category;
		this.rest_menu = rest_menu;
		this.rest_phone_no = rest_phone_no;
	}

	public Restaurant() {
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

	public String getRest_category() {
		return rest_category;
	}

	public void setRest_category(String rest_category) {
		this.rest_category = rest_category;
	}

	public String getRest_menu() {
		return rest_menu;
	}

	public void setRest_menu(String rest_menu) {
		this.rest_menu = rest_menu;
	}

	public long getRest_phone_no() {
		return rest_phone_no;
	}

	public void setRest_phone_no(long rest_phone_no) {
		this.rest_phone_no = rest_phone_no;
	}

}