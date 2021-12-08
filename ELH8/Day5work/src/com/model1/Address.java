package com.model1;

public class Address 
{
private String city;
private long pincode;

public Address(String city, long pincode) {
	super();
	this.city = city;
	this.pincode = pincode;
}
public Address() {
	super();
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
