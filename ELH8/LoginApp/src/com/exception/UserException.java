package com.exception;

public class UserException extends Exception {
	private String errorMessage; // constructor

	public UserException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	@Override
	public String getMessage() {
		return this.errorMessage;
	}

}
