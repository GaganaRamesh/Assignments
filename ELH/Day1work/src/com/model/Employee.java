package com.model;

public class Employee 
{
	 int age;
	 String name;
	 String designation;
	 long phoneNo;
	
	 public void display(int age, String name, String designation, long phoneNo)
	{
		System.out.println("Employee age is " +age);
		System.out.println("Employee name is " +name);
		System.out.println("Employee designation is " +designation);
		System.out.println("Employee contact number is " +phoneNo);
	}

}
