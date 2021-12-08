package com.model;

import java.util.Comparator;

public class BasedOnMarks implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) 
	{
		return (int) (o2.getMark() - o1.getMark());
	}

}
