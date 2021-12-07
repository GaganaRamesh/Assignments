package com.service;

import com.exception.UserException;
import com.model.User;

public interface UserService 
{
//public abstract User createValidate(User user) throws UserException;
//public abstract User readValidateUserId(int userId) throws UserException;
public abstract User authorize(int userId, String password) throws UserException;
//public abstract int updateValidate(User user) throws UserException;
//public abstract boolean deleteValidateByUserId(int userId) throws UserException;

}
