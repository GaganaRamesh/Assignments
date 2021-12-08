package com.service;

import com.model.Employee;

public class EmployeeServiceImpl implements EmployeeService 
{

	@Override
	public Employee[] searchByName(String name)
	{
		Employee employee1 = new Employee(111, "one");	
		Employee employee2 = new Employee(222, "two");		
		Employee employee3 = new Employee(333, "three");		
		Employee employee4 = new Employee(444, "four");

		
		//Array
		Employee[] employees = new Employee[4];
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;
		employees[3] = employee4;
		
//		out of 4 employees search for specific employee
		Employee[] temp = new Employee[1];  // searched employee name will be stored here
		for (int i = 0; i < employees.length; i++)
		{
			if(employees[i].getName().equals(name))
			{
				for (int j = 0; j < temp.length; j++) 
				{
					temp[j] = employees[i];
				}
			}
			else
			{
			}
			}
		return temp;
		}
		
		
	

	@Override
	public String searchById(int Id) {
		return null;
	}

	@Override
	public Employee employeeById(int Id) {
		return null;
	}

}
