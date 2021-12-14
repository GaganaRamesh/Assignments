package com.bean;

public class Student {
	private int studentNo;
	private String name;

	public Student(int studentNo, String name) {
		super();
		this.studentNo = studentNo;
		this.name = name;
	}

	public Student() 
	{
		super();
		System.out.println("Student constructor");
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
