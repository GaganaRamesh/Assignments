package com.main;

import com.model.Address;
import com.model.Department;
import com.model.Employee;

public class MainProgram {

	public static void main(String[] args) {
		Department department = new Department(11, "Development");
		Department department1 = new Department(22, "Testing");
		Department department2 = new Department(33, "Networks");


		Employee employee1 = new Employee(111, "Nikitha");
		Employee employee2 = new Employee(222, "Meghana");
		Employee employee3 = new Employee(333, "Sanjana");

		Address address1 = new Address("Sadhashiv nagar", "Banglore", 560076l);
		Address address2 = new Address("Vinob nagar", "Shimoga", 577302l);
		Address address3 = new Address("Siddaruda nagar", "Bhadravathi", 577301l);

		// array

		Employee[] employes1 = new Employee[3];
		employes1[0] = employee1;
		employes1[1] = employee2;
		employes1[2] = employee3;
		department.setEmployees(employes1);

		Employee[] employes2 = new Employee[3];
		employes2[0] = employee1;
		employes2[1] = employee2;
		employes2[2] = employee3;
		department1.setEmployees(employes2);

		Address[] address11 = new Address[3];
		address11[0] = address1;
		address11[1] = address2;
		address11[2] = address3;
		employee1.setAddress(address11);
		
		Address[] address12 = new Address[3];
		address12[0] = address1;
		address12[1] = address2;
		address12[2] = address3;
		employee2.setAddress(address12);
		
//		display the details of the department
		System.out.println("Display the department details");
		System.out.println("Department ID is " +department.getDeptId());
		System.out.println("Department name is " +department.getDeptName());
		
	Employee[] arrayemployee = department.getEmployees();
	System.out.println("List of employees");
	//iterate
	for (int i = 0; i < arrayemployee.length; i++) 
	{
		if(arrayemployee[i] != null)
		{
		System.out.println("Employee ID is " +arrayemployee[i].getEmpId());
		System.out.println("Employee name is " +arrayemployee[i].getEmpName());
		}
		else
		{
			System.out.println("No such data");
		}
		Address[] arrayaddress = arrayemployee[i].getAddress();
		if(arrayaddress != null)
		{
		//iterate
//		for (int j = 0; j < arrayaddress.length; j++) 
//		{
//			if(arrayaddress[j] != null)
			{System.out.println("Area name is " +arrayaddress[0].getArea());
			System.out.println("City name is " +arrayaddress[1].getCity());
			System.out.println("Pincode is " +arrayaddress[2].getPincode());
			}
//			else
//			{
//				System.out.println("No such data");
//			}
//			}
		}
		}
	}

	}


