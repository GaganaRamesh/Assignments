package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;
import com.bean.Teacher;

public class MainProgram {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Springconfig.xml");
		Teacher object = (Teacher) applicationContext.getBean("teacher");
		
		System.out.println();
		System.out.println("Teacher ID is " + object.getTeacherId());
		System.out.println("Teacher name is " + object.getTeacherName());

		List<Student> students = object.getStudents();
		for (Student student : students) {
			System.out.println("Student number is " + student.getStudentNo());
			System.out.println("Student name is " + student.getName());
		}
		System.out.println();
		System.out.println("THE END");
	}

}
