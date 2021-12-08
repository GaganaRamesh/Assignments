package com.model1;

public class Employee 
{
private int empid;
private String empname;

public Employee() {       //default constructor
	super();
}
public Employee(int empid, String empname) {
	super();
	this.empid = empid;
	this.empname = empname;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
}
