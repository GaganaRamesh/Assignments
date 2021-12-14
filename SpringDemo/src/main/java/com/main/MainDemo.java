package com.main;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Department;
import com.bean.Employee;

public class MainDemo {

	public static void main(String[] args) 
	{
ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringConfig.xml");
Employee object = (Employee) applicationContext.getBean("employee");
System.out.println(object.hello());
System.out.println("Employee ID is " +object.getEmpId());
System.out.println("Employee name is " +object.getEmpName());
System.out.println("THE END");

	}

}
