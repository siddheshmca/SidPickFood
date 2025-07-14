package com.qualys.java.FoodPick.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class CustAddr {

	@Id
	@Column(name = "cust_addr_id")
	private int cust_addr_id;
	
	@OneToOne
	@JoinColumn(name = "cust_id", referencedColumnName = "cust_id")
	private Customer cust_id;
	
	@Column(name = "cust_flat_num")
	private int cust_flat_num;
	
	@Column(name = "cust_floor_num")
	private int cust_floor_num;
	
	@Column(name = "cust_wing")
	private String cust_wing;
	
	@Column(name = "cust_bldg_name")
	private String cust_bldg_name;
	
	@Column(name = "cust_society_name")
	private String cust_society_name;
	
	@Column(name = "cust_street_name")
	private String cust_street_name;
	
	@Column(name = "cust_area")
	private String cust_area;
	
	@Column(name = "cust_city")
	private String cust_city;
	
	@Column(name = "cust_state")
	private String cust_state;
	
	@Column(name = "cust_pin_code")
	private int cust_pin_code;

	public CustAddr(int cust_addr_id, Customer cust_id, int cust_flat_num, int cust_floor_num, String cust_wing,
			String cust_bldg_name, String cust_society_name, String cust_street_name, String cust_area,
			String cust_city, String cust_state, int cust_pin_code) {
		super();
		this.cust_addr_id = cust_addr_id;
		this.cust_id = cust_id;
		this.cust_flat_num = cust_flat_num;
		this.cust_floor_num = cust_floor_num;
		this.cust_wing = cust_wing;
		this.cust_bldg_name = cust_bldg_name;
		this.cust_society_name = cust_society_name;
		this.cust_street_name = cust_street_name;
		this.cust_area = cust_area;
		this.cust_city = cust_city;
		this.cust_state = cust_state;
		this.cust_pin_code = cust_pin_code;
	}

	public CustAddr() {
		super();
	}

	public int getCust_addr_id() {
		return cust_addr_id;
	}

	public void setCust_addr_id(int cust_addr_id) {
		this.cust_addr_id = cust_addr_id;
	}

	public Customer getCust_id() {
		return cust_id;
	}

	public void setCust_id(Customer cust_id) {
		this.cust_id = cust_id;
	}

	public int getCust_flat_num() {
		return cust_flat_num;
	}

	public void setCust_flat_num(int cust_flat_num) {
		this.cust_flat_num = cust_flat_num;
	}

	public int getCust_floor_num() {
		return cust_floor_num;
	}

	public void setCust_floor_num(int cust_floor_num) {
		this.cust_floor_num = cust_floor_num;
	}

	public String getCust_wing() {
		return cust_wing;
	}

	public void setCust_wing(String cust_wing) {
		this.cust_wing = cust_wing;
	}

	public String getCust_bldg_name() {
		return cust_bldg_name;
	}

	public void setCust_bldg_name(String cust_bldg_name) {
		this.cust_bldg_name = cust_bldg_name;
	}

	public String getCust_society_name() {
		return cust_society_name;
	}

	public void setCust_society_name(String cust_society_name) {
		this.cust_society_name = cust_society_name;
	}

	public String getCust_street_name() {
		return cust_street_name;
	}

	public void setCust_street_name(String cust_street_name) {
		this.cust_street_name = cust_street_name;
	}

	public String getCust_area() {
		return cust_area;
	}

	public void setCust_area(String cust_area) {
		this.cust_area = cust_area;
	}

	public String getCust_city() {
		return cust_city;
	}

	public void setCust_city(String cust_city) {
		this.cust_city = cust_city;
	}

	public String getCust_state() {
		return cust_state;
	}

	public void setCust_state(String cust_state) {
		this.cust_state = cust_state;
	}

	public int getCust_pin_code() {
		return cust_pin_code;
	}

	public void setCust_pin_code(int cust_pin_code) {
		this.cust_pin_code = cust_pin_code;
	}
}