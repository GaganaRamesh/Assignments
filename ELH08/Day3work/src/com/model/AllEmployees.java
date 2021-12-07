package com.model;

public class AllEmployees {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setEmpId(111);
		employee1.setEmpName("Nikitha");
		employee1.setSalary(50000f);

		Employee employee2 = new Employee();
		employee2.setEmpId(222);
		employee2.setEmpName("Meghana");
		employee2.setSalary(60000f);

		Employee employee3 = new Employee();
		employee3.setEmpId(333);
		employee3.setEmpName("Sanjna");
		employee3.setSalary(55000f);
		
		System.out.println("Display all the employee details");
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);

	}

}
