package com.ait.login;

import com.ait.boundaries.NotificationService;
import com.ait.boundaries.UserDAO;
import com.ait.exception.UserLoginException;
import com.ait.exception.UserLoginLimitReachedException;
import com.ait.exception.UserRevokedException;
import com.ait.exception.UserLoginBadPasswordException;
import com.ait.exception.UserUnknownUsernameException;
import com.ait.users.User;

public class LoginHandler {
	
	private final UserDAO userDAO;
	private final NotificationService notificationService;
	public LoginHandler(final UserDAO userDAO, final NotificationService notificationService){
		this.userDAO=userDAO;
		this.notificationService = notificationService;
	}

	public void login(final String userName, final String password) throws UserLoginException {
		final User user=userDAO.findUser(userName);
		if (user==null){  
			throw new UserUnknownUsernameException(userName);
		}
		if (user.passwordMatches(password)) {
			if (user.isLoggedIn()){
				throw new UserLoginLimitReachedException(userName);
			}
			if (user.isRevoked()){
				throw new UserRevokedException(userName);
			}
			user.setLoggedIn(true);
			notificationService.notifyAdmin(user, getUserLoginMessage(user));

		} else {
			if (user.getFailedLoginAttempts()<3){
				user.incrementFailedLoginAttempts();
				throw new UserLoginBadPasswordException(userName);
			}
			else{
				user.setRevoked(true);
				notificationService.notifyAdmin(user, getUserRevokedMessage(user));
			}
		}
	}
	
	private String getUserRevokedMessage(final User user) {
		return String.format("account has been revoked:"+user.getName());
	}
	
	private String getUserLoginMessage(final User user) {
		return String.format("user has logged in:"+user.getName());
	}
}
