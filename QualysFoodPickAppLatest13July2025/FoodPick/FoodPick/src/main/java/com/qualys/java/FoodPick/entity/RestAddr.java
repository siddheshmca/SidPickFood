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
	private int rest_street_name;

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

}