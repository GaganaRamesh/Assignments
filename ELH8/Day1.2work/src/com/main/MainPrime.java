package com.main;

import java.util.Scanner;

public class MainPrime {

	public static void main(String[] args)
	{

		int input1, input2, diff;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		 input1 = scanner.nextInt();
		 System.out.println("Enter the second number");
		input2 = scanner.nextInt();
		diff = input1 - input2;
		boolean flag = false;
		for (int i = 2; i <=diff/2; ++i) 
		{
		if(diff%i==0)
		{
			flag = true;
			break;
		}
		}
		if(!flag)
		{
			System.out.println(diff+" is a prime number");
		}
		else
		{
			System.out.println(diff+" is not a prime number");
		}
		
		
	}

}
