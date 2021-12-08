package com.model1;

public class Department 
{
private int deptno;
private String deptname;
private Employee employee; //address

public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}
public Department() {
	super();
}
public Department(int deptno, String deptname) {
	super();
	this.deptno = deptno;
	this.deptname = deptname;
}
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
	
}
