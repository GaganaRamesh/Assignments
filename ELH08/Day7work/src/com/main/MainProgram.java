package com.main;

import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class MainProgram {

	public static void main(String[] args) 
	{
//abstraction (all methods of interface can be used)
		EmployeeService employeeservice = new EmployeeServiceImpl();
		Employee[] emp = employeeservice.searchByName("four");
		if(emp.length > 0)
		{
		for (int i = 0; i < emp.length; i++) 
		{
			System.out.println(emp[i].getID());
		}
		}
		else
		{
			System.out.println("No such employees");
		}
		}
	}




