import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class LoginBeanTest {

	private LoginBean myLogin;
	
	@Before
	public void setUp(){
		myLogin = new LoginBean("shazkeane335@msn.com", "Dromoher");
		
	}

	@Test
	public void testLoginBean() {
		assertEquals("shazkeane335@msn.com", myLogin.getEmail());
		assertEquals("Dromoher", myLogin.getPassword());
		myLogin.setEmail("A00226318@student.ait.ie");
		myLogin.setPassword("Password");
		assertEquals("A00226318@student.ait.ie", myLogin.getEmail());
		assertEquals("Password", myLogin.getPassword());
		}
	
	
	@Test
	public void testEmail(){
		myLogin.setEmailFieldEmpty(true);
		assertTrue(myLogin.getEmailFieldEmpty());
		myLogin.setEmailFieldEmpty(false);
		assertFalse(myLogin.getEmailFieldEmpty());
		myLogin.setEmail("shazkeane335@msn.com");
		assertTrue(myLogin.getEmailValid());
		
		
	}
	
	@Test
	public void testPassword(){
		myLogin.setPasswordFieldEmpty(true);
		assertTrue(myLogin.getPasswordFieldEmpty());
		myLogin.setPasswordFieldEmpty(false);
		assertFalse(myLogin.getPasswordFieldEmpty());
	}
	
	@Test
	public void testEmailAndPassword(){
		myLogin.setEmailAndPasswordCorrect(true);
		assertTrue(myLogin.getEmailAndPasswordCorrect());
		myLogin.setEmailAndPasswordCorrect(false);
		assertFalse(myLogin.getEmailAndPasswordCorrect());
		
	}
	
	@Test
	public void testValidation(){
		myLogin.setValidationComplete(true);
		assertTrue(myLogin.getValidationComplete());
		myLogin.setValidationComplete(false);
		assertFalse(myLogin.getValidationComplete());
		
		
	}
	
	@Test
	public void testConstructor(){
		LoginBean constructorLogin = new LoginBean();
	}
	
	@Test
	public void testGetSetUserLoggedIn(){
		myLogin.setUserLoggedIn(false);
		assertFalse(myLogin.getUserLoggedIn());
		myLogin.setUserLoggedIn(true);
		assertTrue(myLogin.getUserLoggedIn());
		myLogin.setUserLoggedIn(false);
	}
	
	@Test
	public void testGetSetCurrentUser(){
		User user = new User();
		assertEquals(null,myLogin.getCurrentUser());
		myLogin.setCurrentUser(user);
		assertEquals(user,myLogin.getCurrentUser());
	}
	
	@Test
	public void testLogout(){
		myLogin.setUserLoggedIn(false);
		User temp = new User();
		User user = new User();
		myLogin.setCurrentUser(user);
		myLogin.setUserLoggedIn(true);
		myLogin.logout();
		assertFalse(myLogin.getUserLoggedIn());
	}
	
	

}
