package com.abhi.quizexam.pojo;

import java.io.Serializable;

public class UserContacts implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String userId;
	private String address;
	private String city;
	private String state;
	private double pinCode;
	private double landlineNo;
	private double mobileNo;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public double getPinCode() {
		return pinCode;
	}
	public void setPinCode(double pinCode) {
		this.pinCode = pinCode;
	}
	public double getLandlineNo() {
		return landlineNo;
	}
	public void setLandlineNo(double landlineNo) {
		this.landlineNo = landlineNo;
	}
	public double getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(double mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	

}
