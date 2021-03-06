import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RegistrationTest {

	private Registration register;

	@Before
	public void setUp(){
		register = new Registration("Colm Fitzgerald","Athlone","0861288369","colm@gmail.com","Corrigans","Customer");
	}
	
	@Test
	public void testDefaultConstructor(){
		register = new Registration();
		assertEquals("",register.getFullName());
		assertEquals("",register.getEmailAddress());
		assertEquals("",register.getPassword());
		assertEquals("",register.getVerifyPassword());
		assertEquals("Customer",register.getUserType());
		assertEquals("",register.getAddress());
		assertEquals("",register.getMobileNumber());
	}

	@Test
	public void testConstructorANDGetters(){
		assertEquals("Colm Fitzgerald",register.getFullName());
		assertEquals("colm@gmail.com",register.getEmailAddress());
		assertEquals("Corrigans",register.getPassword());
		assertEquals("Athlone",register.getAddress());
		assertEquals("0861288369",register.getMobileNumber());
		assertEquals(false,register.getAddressEmpty());
		assertEquals(false,register.getMobileNumberEmpty());
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
		assertEquals(false,register.isManagerLoggedIn());
		assertEquals("Customer",register.getUserType());
		assertEquals(false,register.isUserAlreadyRegistered());
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
		register.setManagerLoggedIn(true);
		assertEquals(true,register.isManagerLoggedIn());
		register.setUserType("Manager");
		assertEquals("Manager",register.getUserType());
		register.setUserAlreadyRegistered(true);
		assertEquals(true,register.isUserAlreadyRegistered());
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
		register.setAddress("Athlone");
		register.setMobileNumber("0861288963");
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
		register.setAddress("Athlone");
		register.setMobileNumber("0861288963");
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
	
	@Test
	public void testFourUsersAleadyListed(){
		assertEquals(4,register.getNumberOfUsers());
	}
	
	@Test
	public void testAddingOneUser(){
		register.addRegisteredCustomerOrEmployee();
		assertEquals(5,register.getNumberOfUsers());
		register.removeUser();
	}
	
	@Test
	public void testCheckingIfMangerIsLoggedIn(){
		User currentUser = new User("Colm","Athlone","0861288369","colm.fitz@gmail.com","Password","Manager");
		LoginBean current = new LoginBean();
		current.setCurrentUser(currentUser);
		register.checkCurrentUser();
		assertEquals(true,register.isManagerLoggedIn());
	}
	
	@Test
	public void testCheckingIfManagerNotLoggedIn(){
		User currentUser = new User("Colm","Athlone","0861288369","colm.fitz@gmail.com","Password","Stock");
		LoginBean current = new LoginBean();
		current.setCurrentUser(currentUser);
		register.checkCurrentUser();
		assertEquals(false,register.isManagerLoggedIn());
	}
	
	@Test
	public void testAddingAnEmployee(){
		register.setUserType("Manager");
		register.addRegisteredCustomerOrEmployee();
		assertEquals("Customer",register.getUserType());
	}
	
	@Test
	public void testUserAlreadyRegistered(){
		register.setEmailAddress("colm.fitzgerald10@gmail.com");
		register.checkIfUserAlreadyRegistered();
		assertEquals(true,register.isUserAlreadyRegistered());
	}
	
	@Test
	public void testToRedirectToManagerHome(){
		User currentUser = new User("Colm","Athlone","0861288369","colm.fitz@gmail.com","Password","Manager");
		LoginBean current = new LoginBean();
		current.setCurrentUser(currentUser);
		assertEquals("managerpage?faces-redirect=true",register.checkManagerToRedirectToHomeOrManagerHome());
	}
	
	@Test
	public void testToRedirectToIndex(){
		User currentUser = new User("Colm","Athlone","0861288369","colm.fitz@gmail.com","Password","Stock");
		LoginBean current = new LoginBean();
		current.setCurrentUser(currentUser);
		assertEquals("index?faces-redirect=true",register.checkManagerToRedirectToHomeOrManagerHome());
	}
}
