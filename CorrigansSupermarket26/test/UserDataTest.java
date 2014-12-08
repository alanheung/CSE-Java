import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class UserDataTest {
	private UserData customer;

	@Before
	public void setUp() {
		customer = new UserData();
	}

	@Test
	public void testOneEmployeeInArray(){
		assertEquals(4,customer.getNumberOfUsers());

	}
	
	@Test
	public void testAddNewEmployee(){
		User sharon =new User("Sharon Keane","shazkeane335@msn.com","Athlone","Customer");
		customer.addUser(sharon);
		assertEquals(5,customer.getNumberOfUsers());
		customer.removeUser(sharon);
	}
	
	
	@Test
	public void testRemoveEmployees(){
		User sharon =new User("Sharon Keane","shazkeane335@msn.com","Dromoher","Customer");
		User colm =new User("Colm Fitzgerald","c.fits@gmail.com","Athlone","Manager");
		customer.addUser(sharon);
		customer.addUser(colm);
		assertEquals(6,customer.getNumberOfUsers());
		customer.removeUser(sharon);
		assertEquals(5,customer.getNumberOfUsers());
		customer.removeUser(colm);
	}
	
	@Test
	public void testGetAllCustomers(){
		User sharon =new User("Sharon Keane","shazkeane335@msn.com","Dromoher","Customer");
		User colm =new User("Colm Fitzgerald","c.fits@gmail.com","Athlone","Manager");
		customer.addUser(sharon);
		customer.addUser(colm);
		UserData.getAllUsers();
		assertEquals(6,customer.getNumberOfUsers());
		customer.removeUser(sharon);
		customer.removeUser(colm);
		
	}
}
