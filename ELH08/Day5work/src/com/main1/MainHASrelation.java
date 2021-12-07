package com.main1;

import com.model1.Department;
import com.model1.Employee;

public class MainHASrelation {

	public static void main(String[] args)
	{
Employee employee1 = new Employee(123, "niki");
Employee employee2 = new Employee(333, "meg");

//System.out.println(employee.getEmpid());
//System.out.println(employee.getEmpname());

Department department = new Department(111, "development");

department.setEmployee(employee2);
System.out.println(department.getDeptno());
System.out.println(department.getDeptname());
System.out.println(department.getEmployee().getEmpid());
System.out.println(department.getEmployee().getEmpname());

	}

}
