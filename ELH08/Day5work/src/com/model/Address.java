package com.model;

public class Address 
{ 
	private String area;
	private String city;
	private long pincode;
	
	public Address(String area, String city, long pincode) {
		super();
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}
	public Address() {
		super();
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
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	} 

}
