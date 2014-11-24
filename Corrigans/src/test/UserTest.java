import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class UserTest {

	private User user;
	
	@Before
	public void setUp() {
		user = new User("colm","colm.fitz@gmail.com","Corrigans");
	}
	
	@Test
	public void testConstructorANDGetters(){
		assertEquals("colm",user.getFullName());
		assertEquals("colm.fitz@gmail.com",user.getEmailAddress());
		assertEquals("Corrigans",user.getPassword());
	}
	
	@Test
	public void testSetters(){
		user.setFullName("joe");
		user.setEmailAddress("john@gmail.com");
		user.setPassword("Password");
		user.setBasket(null);
		assertEquals("joe",user.getFullName());
		assertEquals("john@gmail.com",user.getEmailAddress());
		assertEquals("Password",user.getPassword());
		assertEquals(null,user.getBasket());
	}

}
