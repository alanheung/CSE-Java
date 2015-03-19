package com.ait.exception;

/**
 * General exception.
 */
public class UserRevokedException extends UserLoginException {

	private static final long serialVersionUID = -7844164306968873458L;

	public UserRevokedException(final String userName) {
		super("User revoked: "+ userName);
	}

}
