package com.qualys.java.FoodPick.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class CustAddr {

	@Id
	private int custAddrId;

	@OneToOne
	@JoinColumn(name = "custID", referencedColumnName = "custID")
	private Customer custId;
	@Column
	private int flatNum;
	@Column
	private int floorNum;
	@Column
	private String wing;
	@Column
	private String bldgName;
	@Column
	private String societyName;
	@Column
	private String streetName;
	@Column
	private String area;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private int pincode;

	public int getCustAddrId() {
		return custAddrId;
	}

	public void setCustAddrId(int custAddrId) {
		this.custAddrId = custAddrId;
	}

	public Customer getCustId() {
		return custId;
	}

	public void setCustId(Customer custId) {
		this.custId = custId;
	}

	public int getFlatNum() {
		return flatNum;
	}

	public void setFlatNum(int flatNum) {
		this.flatNum = flatNum;
	}

	public int getFloorNum() {
		return floorNum;
	}

	public void setFloorNum(int floorNum) {
		this.floorNum = floorNum;
	}

	public String getWing() {
		return wing;
	}

	public void setWing(String wing) {
		this.wing = wing;
	}

	public String getBldgName() {
		return bldgName;
	}

	public void setBldgName(String bldgName) {
		this.bldgName = bldgName;
	}

	public String getSocietyName() {
		return societyName;
	}

	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
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

	public CustAddr(int custAddrId, Customer custId, int flatNum, int floorNum, String wing, String bldgName,
			String societyName, String streetName, String area, String city, String state, int pincode) {
		super();
		this.custAddrId = custAddrId;
		this.custId = custId;
		this.flatNum = flatNum;
		this.floorNum = floorNum;
		this.wing = wing;
		this.bldgName = bldgName;
		this.societyName = societyName;
		this.streetName = streetName;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public CustAddr() {
		super();
		// TODO Auto-generated constructor stub
	}

}
