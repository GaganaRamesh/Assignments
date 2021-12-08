package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.model.BasedOnAge;
import com.model.BasedOnMarks;
import com.model.Student;

public class MainList {

	public static void main(String[] args)
	{
		Student student1 = new Student(111, 16, "Nikitha", 95);
		Student student2 = new Student(222, 14, "Meghana", 92);
		Student student3 = new Student(333, 10, "Sanjana", 92);
		Student student4 = new Student(444, 17, "Suni", 90);

		List<Student> list = new ArrayList<Student>();
		// treeset=sorted(print in order)
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		
		System.out.println(+list.size() + " objects are there in the collection");
		System.out.println();
		for (Student student : list) 
		{
			System.out.println("Student number is " +student.getStudentNo());
			System.out.println("Student age is " +student.getAge());
			System.out.println("Student name is " +student.getName());
			System.out.println("Student mark is " +student.getMark());
		}
		
		System.out.println();
		System.out.println("Sort the employes based on age");
		System.out.println();
		Collections.sort(list, new BasedOnAge());
		for (Student student : list) 
		{
			System.out.println("Student number is " +student.getStudentNo());
			System.out.println("Student age is " +student.getAge());
			System.out.println("Student name is " +student.getName());
			System.out.println("Student marks is " +student.getMark());
		}
		
		System.out.println();
		System.out.println("Sort the employes based on marks");
		System.out.println();
		Collections.sort(list, new BasedOnMarks());
		for (Student student : list) 
		{
			System.out.println("Student number is " +student.getStudentNo());
			System.out.println("Student age is " +student.getAge());
			System.out.println("Student name is " +student.getName());
			System.out.println("Student marks is " +student.getMark());
		}
		
		System.out.println();
		System.out.println("Sort the employes based on names");
		System.out.println();
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println("Student name is " +list.get(i).getName()+ "");
			System.out.println("Student age is " +list.get(i).getAge()+ "");
			System.out.println("Student marks is " +list.get(i).getMark()+ "");
			System.out.println("Student number is " +list.get(i).getStudentNo()+ "");
			
		}
		
	}

}
