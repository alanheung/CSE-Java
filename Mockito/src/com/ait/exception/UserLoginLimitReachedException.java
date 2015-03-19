package com.ait.exception;

public class UserLoginLimitReachedException extends UserLoginException {

	private static final long serialVersionUID = 334051992916748022L;

	public UserLoginLimitReachedException(final String userName) {
		super("Too many login attempts: "+ userName);
	}

}
