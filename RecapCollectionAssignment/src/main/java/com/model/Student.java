package com.model;

public class Student implements  Comparable<Student>
{
	private int studentNo;
	private int age;
	private String name;
	private float mark;

	public Student(int studentNo, int age, String name, float mark) {
		super();
		this.studentNo = studentNo;
		this.age = age;
		this.name = name;
		this.mark = mark;
	}

	public Student() {
		super();
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMark() {
		return mark;
	}

	public void setMark(float mark) {
		this.mark = mark;
	}

	@Override
	public int compareTo(Student otherName) 
	{
	int compareInt = this.name.compareTo(otherName.name);
	if(compareInt < 0)  // this.name is bigger
		return -1;
	if(compareInt > 0)  // othername.name is bigger
	return 1;
	return 0; // they are equal
	}
	

}
