package com.qualys.java.FoodPick.DTO;

public class RestaurantDTO {

	private int rest_id;
	private String rest_name;
	private String rest_location;
	private String rest_category;
	private String rest_menu;
	private long rest_phone_no;

	private int rest_addr_id;
	private int rest_shop_no;
	private String rest_street_name;
	private int rest_floor_num;
	private String rest_area;
	private String rest_city;
	private String rest_state;
	private int rest_pin_code;

	public RestaurantDTO() {
		super();
	}

	public RestaurantDTO(int rest_id, String rest_name, String rest_location, String rest_category, String rest_menu,
			long rest_phone_no, int rest_addr_id, int rest_shop_no, String rest_street_name, int rest_floor_num,
			String rest_area, String rest_city, String rest_state, int rest_pin_code) {
		super();
		this.rest_id = rest_id;
		this.rest_name = rest_name;
		this.rest_location = rest_location;
		this.rest_category = rest_category;
		this.rest_menu = rest_menu;
		this.rest_phone_no = rest_phone_no;
		this.rest_addr_id = rest_addr_id;
		this.rest_shop_no = rest_shop_no;
		this.rest_street_name = rest_street_name;
		this.rest_floor_num = rest_floor_num;
		this.rest_area = rest_area;
		this.rest_city = rest_city;
		this.rest_state = rest_state;
		this.rest_pin_code = rest_pin_code;
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

	public int getRest_addr_id() {
		return rest_addr_id;
	}

	public void setRest_addr_id(int rest_addr_id) {
		this.rest_addr_id = rest_addr_id;
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