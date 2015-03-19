package com.ait.exception;

/**
 * General exception.
 */
public class UserUnknownUsernameException extends UserLoginException {

	private static final long serialVersionUID = -7844164306968873458L;

	public UserUnknownUsernameException(final String userName) {
		super("Unknown user "+userName);
	}

}
