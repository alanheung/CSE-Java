import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class UserTest {

	private User user;
	
	@Before
	public void setUp() {
		user = new User("Colm Fitzgerald","123 Fake Street", "0871224921","c.fits@gmail.com","Athlone","Manager");
	}
	
	@Test
	public void testDefaultConstructor(){
		user = new User();
		assertEquals("",user.getFullName());
		assertEquals("",user.getEmailAddress());
		assertEquals("",user.getPassword());
		assertEquals("",user.getUserType());
		assertEquals("",user.getAddress());
		assertEquals("",user.getMobileNumber());
	}
	
	@Test
	public void testGetters(){
		
		assertEquals("Colm Fitzgerald",user.getFullName());
		assertEquals("c.fits@gmail.com",user.getEmailAddress());
		assertEquals("Athlone",user.getPassword());
		assertEquals("Manager",user.getUserType());
		assertEquals(false,user.isCanEditUser());
	}
	
	@Test
	public void testSetters(){
		user.setFullName("joe");
		user.setEmailAddress("john@gmail.com");
		user.setPassword("Password");
		user.setBasket(null);
		user.setUserType("Stock");
		user.setMobileNumber("0862119242");
		user.setAddress("123 Fake Street");
		user.setCanEditUser(true);
		assertEquals("joe",user.getFullName());
		assertEquals("john@gmail.com",user.getEmailAddress());
		assertEquals("Password",user.getPassword());
		assertEquals(null,user.getBasket());
		assertEquals("Stock",user.getUserType());
		assertEquals("0862119242",user.getMobileNumber());
		assertEquals("123 Fake Street", user.getAddress());
		assertEquals(true,user.isCanEditUser());
	}

}
