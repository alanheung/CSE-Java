package com.ait.users;

public interface User {
	String getName();

	boolean isLoggedIn();

	void setLoggedIn(boolean state);

	void setRevoked(boolean state);

	boolean isRevoked();

	boolean passwordMatches(String password);

	int getFailedLoginAttempts();

	void incrementFailedLoginAttempts();
}
