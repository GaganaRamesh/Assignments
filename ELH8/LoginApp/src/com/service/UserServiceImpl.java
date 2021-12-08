package com.service;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.exception.UserException;
import com.model.User;

public class UserServiceImpl implements UserService 
{
// userid length must be greater than 8
	@Override
	public User authorize(int userId, String password) throws UserException 
	{
		User user = null;
		int userLength = String.valueOf(userId).length();
		int passwordLength = password.length();
		if(userLength >= 5 && passwordLength >=8)
		{
		UserDao userdao = new UserDaoImpl();
		user =userdao.authorizeDao(userId, password);
		
		}
		else
		{
		throw new UserException("Incorrect user Id or password");
			
		}
		
		return null;
	}

}
