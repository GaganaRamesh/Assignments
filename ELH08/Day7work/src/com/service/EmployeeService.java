package com.service;

import com.model.Employee;

public interface EmployeeService 
{
	public abstract Employee[] searchByName(String name);  // name can be dup
	public abstract String searchById(int Id);
	public abstract Employee employeeById(int Id);
	
//	{
////		DAO data base
//		Employee employee1 = new Employee(111, "one");	
//		Employee employee2 = new Employee(222, "two");		
//		Employee employee3 = new Employee(333, "three");		
//		Employee employee4 = new Employee(444, "three");
//
//		
//		//Array
//		Employee[] employees = new Employee[4];
//		employees[0] = employee1;
//		employees[1] = employee2;
//		employees[2] = employee3;
//		employees[3] = employee4;
//		
//		return employee1;
//	}

}
