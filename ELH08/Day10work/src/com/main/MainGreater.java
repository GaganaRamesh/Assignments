package com.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.model.Employee;

public class MainGreater {

	public static void main(String[] args)
	{
		Employee employee1 = new Employee(111, "One", 4500f);
		Employee employee2 = new Employee(222, "Two", 5000f);
		Employee employee3 = new Employee(333, "Three", 6000f);
		Employee employee4 = new Employee(444, "Four", 4000f);
		
		List list = new ArrayList();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee1);

        //Fetch all the employee details
        System.out.println("Display the employee details whose salary is greater than 5000");
        
		
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
			Object object = (Object) iterator.next();
						
//			if (object instanceof Employee)
			Employee employee = (Employee) object;
			
			if(employee.getSalary() > 5000)	
			{

				System.out.println("Employee number is " +employee.getEmpId());
				System.out.println("Employee name is " +employee.getEmpName());
				System.out.println("Employee salary is "+employee.getSalary());
							
			}
			}	
	}

}
