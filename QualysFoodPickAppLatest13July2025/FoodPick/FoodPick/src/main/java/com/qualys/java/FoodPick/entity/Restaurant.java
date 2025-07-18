package com.qualys.java.FoodPick.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Restaurant {

	@Id
	@Column(name = "rest_id")
	private int rest_id;

	@Column(name = "rest_name")
	private String rest_name;

	@Column(name = "rest_location")
	private String rest_location;

	@OneToMany(mappedBy = "rest_id", cascade = CascadeType.ALL, orphanRemoval = true)
	@Column(name = "menu_items")
	private List<Menu> menu_items;

	@Column(name = "rest_phone_no")
	private long rest_phone_no;

	public Restaurant(int rest_id, String rest_name, String rest_location, List<Menu> menu_items, long rest_phone_no) {
		super();
		this.rest_id = rest_id;
		this.rest_name = rest_name;
		this.rest_location = rest_location;
		this.menu_items = menu_items;
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

	public List<Menu> getMenu_items() {
		return menu_items;
	}

	public void setMenu_items(List<Menu> menu_items) {
		this.menu_items = menu_items;
	}

	public long getRest_phone_no() {
		return rest_phone_no;
	}

	public void setRest_phone_no(long rest_phone_no) {
		this.rest_phone_no = rest_phone_no;
	}

}