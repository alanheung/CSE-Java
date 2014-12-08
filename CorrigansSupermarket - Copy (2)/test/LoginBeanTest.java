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
	public void testDefaultConstructor(){
		myLogin = new LoginBean();
		assertEquals("", myLogin.getEmail());
		assertEquals("", myLogin.getPassword());
	}

	@Test
	public void testGettersANDSetters() {
		assertEquals("shazkeane335@msn.com", myLogin.getEmail());
		assertEquals("Dromoher", myLogin.getPassword());
		myLogin.setEmail("A00226318@student.ait.ie");
		myLogin.setPassword("Password");
		assertEquals("A00226318@student.ait.ie", myLogin.getEmail());
		assertEquals("Password", myLogin.getPassword());
		myLogin.setEmailFieldEmpty(false);
		myLogin.setPasswordFieldEmpty(false);
		myLogin.setEmailAndPasswordCorrect(true);
		myLogin.setUserLoggedIn(false);
		myLogin.setEmailValid(false);
		myLogin.setCurrentUser(null);
		assertEquals(false,myLogin.getEmailFieldEmpty());
		assertEquals(false,myLogin.getPasswordFieldEmpty());
		assertEquals(true,myLogin.getEmailAndPasswordCorrect());
		assertEquals(false,myLogin.getUserLoggedIn());
		assertEquals(false,myLogin.isEmailValid());
		assertEquals(null,myLogin.getCurrentUser());
	}


	@Test
	public void testEmptyFields(){
		myLogin.setEmail("");
		myLogin.setPassword("");
		myLogin.isEmailEmpty();
		myLogin.isPasswordEmpty();
		assertEquals(true,myLogin.getEmailFieldEmpty());
		assertEquals(true,myLogin.getPasswordFieldEmpty());
	}

	@Test
	public void testSuccessfulLogin(){
		myLogin.setEmail("skyboypower@gmail.com");
		myLogin.setPassword("password");
		myLogin.checkLogin();
		assertEquals(true,myLogin.getEmailAndPasswordCorrect());
	}

	@Test
	public void testInvalidPasswordLogin(){
		myLogin.setEmail("skyboypower@gmail.com");
		myLogin.setPassword("pasrd");
		myLogin.checkLogin();
		assertEquals(false,myLogin.getEmailAndPasswordCorrect());
	}

	@Test
	public void testInvalidEmailLogin(){
		myLogin.setEmail("skybower@gmail.com");
		myLogin.setPassword("password");
		myLogin.checkLogin();
		assertEquals(false,myLogin.isEmailValid());
	}

	@Test
	public void testLogout(){
		myLogin.setUserLoggedIn(false);
		User user = new User();
		myLogin.setCurrentUser(user);
		myLogin.setUserLoggedIn(true);
		myLogin.logout();
		assertFalse(myLogin.getUserLoggedIn());
	}



}
