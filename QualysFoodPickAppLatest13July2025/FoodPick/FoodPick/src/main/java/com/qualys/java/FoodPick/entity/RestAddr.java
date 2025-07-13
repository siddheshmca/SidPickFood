package com.qualys.java.FoodPick.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RestAddr {

	@Id
	private int restAddId;

	@Column
	private int shopNo;

	@Column
	private int streetName;

	@Column
	private int floorNum;

	@Column
	private String area;
	
	@Column
	private String city;
	
	@Column
	private String state;
	
	@Column
	private int pincode;

	public RestAddr(int restAddId, int shopNo, int streetName, int floorNum, String area, String city, String state,
			int pincode) {
		super();
		this.restAddId = restAddId;
		this.shopNo = shopNo;
		this.streetName = streetName;
		this.floorNum = floorNum;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public RestAddr() {
		super();
	}

	public int getRestAddId() {
		return restAddId;
	}

	public void setRestAddId(int restAddId) {
		this.restAddId = restAddId;
	}

	public int getShopNo() {
		return shopNo;
	}

	public void setShopNo(int shopNo) {
		this.shopNo = shopNo;
	}

	public int getStreetName() {
		return streetName;
	}

	public void setStreetName(int streetName) {
		this.streetName = streetName;
	}

	public int getFloorNum() {
		return floorNum;
	}

	public void setFloorNum(int floorNum) {
		this.floorNum = floorNum;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}