package com.ait.exception;

public class UserLoginBadPasswordException extends UserLoginException {

	private static final long serialVersionUID = 334051992916748022L;

	public UserLoginBadPasswordException(final String userName) {
		super("Incorrect Password: "+ userName);
	}

}
