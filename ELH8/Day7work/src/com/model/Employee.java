package com.model;

public class Employee {
	private int ID;
	private String name;
	
	public Employee(int iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}
	public Employee() {
		super();
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
