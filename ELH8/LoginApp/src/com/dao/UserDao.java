package com.dao;

import com.exception.UserException;
import com.model.User;

public interface UserDao 
{
//	CRUD
	public abstract User authorizeDao(int userId, String password) throws UserException; 
	
}
