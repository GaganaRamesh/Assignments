package com.main;

import java.util.ArrayList;
import java.util.HashSet;   // interface == API ==predefined
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.model.Employee;

public class MainProgram {

	public static void main(String[] args) 
	{
		Employee employee1 = new Employee(111, "One", 10000f);
		Employee employee2 = new Employee(222, "Two", 20000f);
		Employee employee3 = new Employee(333, "Three", 30000f);
		Employee employee4 = new Employee(444, "Four", 50000f);

		
//        Set set = new HashSet<>();
//        set.add(employee1);  //insertion order will not be maintained
//        set.add(employee2);
//        set.add(employee3);
//        set.add(employee4);
//        set.add(employee2); // no dup here and same memory address
        
		List list = new ArrayList();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee1);

        //Fetch all the employee details
        System.out.println("Display all the employee details");
        
		
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
			Object object = (Object) iterator.next();
						
			if (object instanceof Employee)
			{
				Employee employee = (Employee) object;	//typecasting, int var=(int) 23.5f;
				System.out.println("Employee number is " +employee.getEmpId());
				System.out.println("Employee name is " +employee.getEmpName());
				System.out.println("Employee salary is "+employee.getSalary());
			}
			
			}	
			
		}
       
        
	}


