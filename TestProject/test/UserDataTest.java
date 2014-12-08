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
		assertEquals(5,customer.getNumberOfUsers());

	}
	
	@Test
	public void testAddNewEmployee(){
		User sharon =new User("Sharon Keane","123 Fake Street", "0871224921","shazkeane335@msn.com","1234Ab","Customer");
		customer.addUser(sharon);
		assertEquals(6,customer.getNumberOfUsers());
		customer.removeUser(sharon);
	}
	
	
	@Test
	public void testRemoveEmployees(){
		User sharon =new User("Sharon Keane","123 Fake Street", "0871224921","shazkeane335@msn.com","1234Ab","Customer");
		User colm =new User("Colm Fitzgerald","123 Fake Street", "0871224921","c.fits@gmail.com","Athlone","Manager");
		customer.addUser(sharon);
		customer.addUser(colm);
		assertEquals(7,customer.getNumberOfUsers());
		customer.removeUser(sharon);
		assertEquals(6,customer.getNumberOfUsers());
		customer.removeUser(colm);
	}
	
	@Test
	public void testGetAllCustomers(){
		User sharon =new User("Sharon Keane","123 Fake Street", "0871224921","shazkeane335@msn.com","1234Ab","Customer");
		User colm =new User("Colm Fitzgerald","123 Fake Street", "0871224921","c.fits@gmail.com","Athlone","Manager");
		customer.addUser(sharon);
		customer.addUser(colm);
		UserData.getAllUsers();
		assertEquals(7,customer.getNumberOfUsers());
		customer.removeUser(sharon);
		customer.removeUser(colm);
		
	}
	
	@Test
	public void testSetUserInfo(){
		User sharon =new User("Sharon Keane","123 Fake Street", "0871224921","shazkeane335@msn.com","1234Ab","Customer");
		customer.setFullName("Not Sharon");
		customer.setAddress("1234 Fake Street");
		customer.setMobileNumber("086666666");
		customer.setEmailAddress("notanEmail@email.com");
		customer.setPassword("1234Ac");
		customer.setUserType("Manager");
		assertEquals("Manager",customer.getUserType());
		assertEquals("1234Ac",customer.getPassword());
		assertEquals("notanEmail@email.com",customer.getEmailAddress());
		assertEquals("086666666",customer.getMobileNumber());
		assertEquals("1234 Fake Street",customer.getAddress());
		assertEquals("Not Sharon",customer.getFullName());
	}
	
	
	@Test
	public void testDeleteUser(){
		User aSharon = new User("Sharon Keane","123 Fake Street", "0871224921","shazkeane335@msn.com","1234Ab","Customer");
		customer.addUser(aSharon);
		customer.deleteUser(aSharon);
		assertEquals(5, customer.getNumberOfUsers());
	}
	
	
	@Test
	public void testEditUser(){
		User sharon =new User("Sharon Keane","123 Fake Street", "0871224921","shazkeane335@msn.com","1234Ab","Customer");
		customer.addUser(sharon);
		customer.editUser(sharon);
		assertTrue(sharon.isCanEditUser());
		customer.saveAction();
		assertFalse(sharon.isCanEditUser());
		customer.removeUser(sharon);
		
	}
	
	@Test
	public void testAddUserEmpty(){
		customer.setFullName("refver");
		customer.setAddress("rewf");
		customer.setEmailAddress("rgreg");
		customer.setMobileNumber("erger");
		customer.addUser();
		assertEquals(6,customer.getNumberOfUsers());
	}
}
