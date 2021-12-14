package com.bean;

public class Employee {
	private int empId;
	private String empName;
	private float salary;

	public Employee(int empId, String empName, float salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public Employee() {
		super();
		System.out.println("Employee Constructor");
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary)
	{
		this.salary = salary;
	}
	
	public String hello()
	{
		return "HELLO GOOD MORNING";
	}

}
