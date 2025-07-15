package com.qualys.java.FoodPick.DTO;

public class CustomerAddressRequest {

	private int cust_id;
	private String cust_Name;
	private String cust_email;
	private long cust_Phone_No;

	private int cust_addr_id;
	private int cust_flat_num;
	private int cust_floor_num;
	private String cust_wing;
	private String cust_bldg_name;
	private String cust_society_name;
	private String cust_street_name;
	private String cust_area;
	private String cust_city;
	private String cust_state;
	private int cust_pin_code;

	public CustomerAddressRequest(int cust_id, String cust_Name, String cust_email, long cust_Phone_No,
			int cust_addr_id, int cust_flat_num, int cust_floor_num, String cust_wing, String cust_bldg_name,
			String cust_society_name, String cust_street_name, String cust_area, String cust_city, String cust_state,
			int cust_pin_code) {
		super();
		this.cust_id = cust_id;
		this.cust_Name = cust_Name;
		this.cust_email = cust_email;
		this.cust_Phone_No = cust_Phone_No;
		this.cust_addr_id = cust_addr_id;
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

	public CustomerAddressRequest() {
		super();
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_Name() {
		return cust_Name;
	}

	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}

	public String getCust_email() {
		return cust_email;
	}

	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}

	public long getCust_Phone_No() {
		return cust_Phone_No;
	}

	public void setCust_Phone_No(long cust_Phone_No) {
		this.cust_Phone_No = cust_Phone_No;
	}

	public int getCust_addr_id() {
		return cust_addr_id;
	}

	public void setCust_addr_id(int cust_addr_id) {
		this.cust_addr_id = cust_addr_id;
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