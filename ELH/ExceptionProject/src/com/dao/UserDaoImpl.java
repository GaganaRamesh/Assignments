package com.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.exception.UserException;
import com.model.User;

public class UserDaoImpl implements UserDao {

	public List<User> init() // database
	{
		User user1 = new User(11111, "one", "one12345");
		User user2 = new User(22222, "two", "two12345");
		User user3 = new User(33333, "three", "three12345");

		List<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		users.add(user3);

		return users;
	}

	@Override
	public User authorizeDao(int userId, String password) throws UserException
		{
		System.out.println("Data in dao is " +userId+ "" +password);
		User user = null;
		List<User> users = this.init();
		//fetch every user in collection and iterate to find my user
		for (User user2 : users)
		{ System.out.println(user2);
			if(user2.getUserId() == userId && user2.getPassword().equals(password))
			{
				user= user2;
			}
		}
		if(user != null)
		{
		return user;
		}
		else
		{
			throw new UserException("No such user in the database");
		}
		}
	}


