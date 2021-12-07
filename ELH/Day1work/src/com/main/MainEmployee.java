package com.main;

import com.model.Employee;

public class MainEmployee {

	public static void main(String[] args) 
	{
Employee employee = new Employee();
System.out.println("Display the employee details");
employee.display(26, "Nikitha", "Developer", 8904656629l);
employee.display(28, "Meghana", "Support", 9538382140l);
employee.display(22, "Sanjana", "Testing", 7019095052l);
employee.display(40, "Suni", "Networks", 8123617606l);


	}

}
