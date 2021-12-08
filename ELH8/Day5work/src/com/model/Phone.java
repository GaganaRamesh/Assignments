package com.model;

import com.service.Calculator;
import com.service.ScientificCal;

public class Phone implements Calculator, ScientificCal 
{

	@Override
	public int sub(int num1, int num2) 
	{    
		return num1 + num2;
	}

	@Override
	public int mul(int num1, int num2)
	{
		return num1 - num2;
	}
	
	
	
	public String music(String song)
	{   
		return "The song is playing";
	}

}
