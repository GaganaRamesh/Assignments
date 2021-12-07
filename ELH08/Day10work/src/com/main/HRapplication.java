package com.main;

import java.util.HashMap;
import java.util.Map;

import com.model.Employee;

public class HRapplication {

	public static void main(String[] args) {
//	Interface var = new InterfaceImpl();

		Map map = new HashMap(); // also use TreeMap()==unsorted
		
		Employee employee1 = new Employee(111, "One", 10000f);
		Employee employee2 = new Employee(222, "Two", 20000f);
		Employee employee3 = new Employee(333, "Three", 30000f);
		Employee employee4 = new Employee(444, "Four", 40000f);
		
		map.put("1one", employee1);
		map.put("2two", employee2); // key is also an object and object value
		map.put("3three", employee3);
		map.put("4four", employee4);// key(who gave the value), value
  
	Employee data = (Employee) map.get("1one"); // 2two gave me Employee data, 2two(converted to employee)
	System.out.println("Employee number is " +data.getEmpId());
System.out.println("Employee number is " +data.getEmpName());
System.out.println("Employee number is " +data.getSalary());

	}

}
