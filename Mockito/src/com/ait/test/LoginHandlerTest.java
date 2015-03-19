package com.ait.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.ait.boundaries.NotificationService;
import com.ait.boundaries.UserDAO;
import com.ait.exception.UserLoginException;
import com.ait.exception.UserUnknownUsernameException;
import com.ait.login.LoginHandler;
import com.ait.users.User;

import static org.mockito.Mockito.*;

public class LoginHandlerTest {

	private UserDAO userDAO;
	private NotificationService notServDAO;
	private User user;

	private LoginHandler loginHand;
	
	@Before
	public void setUP(){
		userDAO = mock(UserDAO.class);
		notServDAO = mock(NotificationService.class);
		
		loginHand = new LoginHandler(userDAO, notServDAO);		
	}
	
//	@Test
//	public void testNoTransactions() {
//		assertEquals(0, loginHand.login("asdf", "asdf"));
//	}
	
	@Test
	public void testLoginSuccessful() throws UserLoginException {
// 		Your test should verify that setLoggedIn is called one time on the user object with 
//		parameter true. Verify that notifyAdmin is called on the NotificationService.
//		assertEquals(1,loginHand);
		user.setLoggedIn(true);
//		verify(1,NotificationService.notifyAdmin(user,"true"));
	}
	
	@Test(expected=IOException.class)
	public void UserNotFound()throws IOException{
		//Test the exception “UserUnknownUsernameException is thrown
		doThrow(new IOException()).when(userDAO).findUser(null);
	}
	
	@Test
	public void testUserLoggedIn() {
//		Test that when “isLoggedIn returns “true”, the exception 
//		“UserLoginLimitReachedException” is thrown.
//		user.isLoggedIn();
		
		when(userDAO).UserLoginLimitReachedException();
		
		then(UserLoginLimitReachedException()){
			.isInstanceof(UserUnknownUsernameException.class)
			.hasMessage("Exception Message.");
			verify(notServDAO).notifyAdmin(userDAO,"");
//		}
	}
	
	@Test
	public void testUserHasBeenRevoked() {
//		If the user has three unsuccessful login attempts their account is revoked. 
//		Check that UserRevokedException is received if “isRevoked” returns true.
	}
	
	@Test
	public void testUserEntersWrongPassword() {
//		If the user enters the incorrect password (passwordMatches returns false) but 
//		their account has not been revoked (they have not entered the password incorrectly 
//		more than 3 times ) or they are not already logged in, check that 
//		UserLoginBadPasswordException is thrown.
	}
	
	@Test
	public void testUserEntersWrongPassword3Times() {
//		If the user enters the incorrect password and getFailedLoginAttempts returns 3, 
//		check that setRevoked is call and that notifyUser is called on the notification 
//		service.
	}

}
	


