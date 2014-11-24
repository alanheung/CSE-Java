import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import corrigan.Registration;

public class RegistrationTest {

	private Registration register;

	@Before
	public void setUp(){
		register = new Registration("Colm Fitzgerald","colm@gmail.com","Corrigans");
	}

	@Test
	public void testConstructorANDGetters(){
		assertEquals("Colm Fitzgerald",register.getFullName());
		assertEquals("colm@gmail.com",register.getEmailAddress());
		assertEquals("Corrigans",register.getPassword());
		assertEquals(null,register.getVerifyPassword());
		assertEquals(false,register.getFullNameEmpty());
		assertEquals(false,register.getEmailEmpty());
		assertEquals(false,register.getPasswordEmpty());
		assertEquals(false,register.getVerifyPasswordEmpty());
		assertEquals(false,register.getStep1Valid());
		assertEquals(false,register.getStep2Valid());
		assertEquals(false,register.getAllDetailsValid());
		assertEquals(false,register.getVerifyPasswordValid());
		assertEquals(false,register.getPasswordValid());
		assertEquals(false,register.getEmailValid());
	}

	@Test
	public void testSetters(){
		register.setFullName("j");
		assertEquals("j",register.getFullName());
		register.setEmailAddress("too");
		assertEquals("too",register.getEmailAddress());
		register.setPassword("root2");
		assertEquals("root2",register.getPassword());
		register.setVerifyPassword("root2");
		assertEquals("root2",register.getVerifyPassword());
	}

	@Test
	public void testFieldsAreEmpty(){
		register.setFullName("");
		register.setEmailAddress("");
		register.setPassword("");
		register.setVerifyPassword("");
		register.isEmailEmpty();
		register.isFullNameEmpty();
		register.isPasswordEmpty();
		register.isVerifyPasswordEmpty();
		assertEquals(true,register.getFullNameEmpty());
		assertEquals(true,register.getEmailEmpty());
		assertEquals(true,register.getPasswordEmpty());
		assertEquals(true,register.getVerifyPasswordEmpty());
	}
	
	@Test
	public void testFieldsNotEmpty(){
		register.setFullName("fv");
		register.setEmailAddress("fbsd");
		register.setPassword("fegb");
		register.setVerifyPassword("eev");
		register.isEmailEmpty();
		register.isFullNameEmpty();
		register.isPasswordEmpty();
		register.isVerifyPasswordEmpty();
		assertEquals(false,register.getFullNameEmpty());
		assertEquals(false,register.getEmailEmpty());
		assertEquals(false,register.getPasswordEmpty());
		assertEquals(false,register.getVerifyPasswordEmpty());
	}
	
	@Test
	public void testEmailIsValid(){
		register.setEmailAddress("root@gmail.com");
		register.isEmailValid();
		assertEquals(true,register.getEmailValid());
	}
	
	@Test
	public void testEmailInvalid(){
		register.setEmailAddress("");
		register.isEmailValid();
		assertEquals(false,register.getEmailValid());
		
	}
	
	@Test
	public void testPasswordValid(){
		register.setPassword("Corrigans");
		register.isPasswordValid();
		assertEquals(true,register.getPasswordValid());
	}
	
	@Test
	public void testPasswordInvalid(){
		register.setPassword("corrigans");
		register.isPasswordValid();
		assertEquals(false,register.getPasswordValid());
	}
	
	@Test
	public void testValidPersonalDetaials(){
		register.setFullName("Colm");
		register.setEmailAddress("c.fitz@gmail.com");
		register.validPersonalDetails();
		assertEquals(true,register.getStep1Valid());
	}
	
	@Test
	public void testInvalidPersonalDetails(){
		register.setFullName("");
		register.setEmailAddress("");
		register.validPersonalDetails();
		assertEquals(false,register.getStep1Valid());
		
	}
	
	@Test
	public void testValidVerifyPassword(){
		register.setVerifyPassword("Corrigans");
		register.setPassword("Corrigans");
		register.isVerifyPasswordValid();
		assertEquals(true,register.getVerifyPasswordValid());
	}
	
	@Test
	public void testInvalidVerifyPassword(){
		register.setVerifyPassword("corrigans");
		register.setPassword("corrgans");
		register.isVerifyPasswordValid();
		assertEquals(false,register.getVerifyPasswordValid());
	}
	
	@Test
	public void testValidPasswordDetails(){
		register.setVerifyPassword("Corrigans");
		register.setPassword("Corrigans");
		register.validPasswordDetails();
		assertEquals(true,register.getStep2Valid());
	}
	
	@Test 
	public void testInvalidPasswordDetails(){
		register.setVerifyPassword("corrigans");
		register.setPassword("corrigans");
		assertEquals(false,register.getStep2Valid());
	}
	
	@Test
	public void testValidationComplete(){
		register.setVerifyPassword("Corrigans");
		register.setPassword("Corrigans");
		register.setFullName("colm");
		register.setEmailAddress("colm@gmail.com");
		register.validationComplete();
		assertEquals(true,register.getAllDetailsValid());
	}
	
	@Test
	public void testValidationNotComplete(){
		register.setVerifyPassword("Corrigans");
		register.setPassword("crrigans");
		register.setFullName("");
		register.setEmailAddress("colm@gmail.com");
		register.validationComplete();
		assertEquals(false,register.getAllDetailsValid());
	}
}
