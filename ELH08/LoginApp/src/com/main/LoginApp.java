package com.main;

import java.util.Scanner;

import com.exception.UserException;
import com.model.User;
import com.service.UserService;
import com.service.UserServiceImpl;

public class LoginApp {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter user ID");
		int userId = input.nextInt();
		System.out.println("Enter password");
		String password = input.next();
		UserService userService = new UserServiceImpl();

		try {
			User user = userService.authorize(userId, password);			
		} 
		catch (UserException e) {
			System.out.println(e.getMessage());
		}

	}

}
