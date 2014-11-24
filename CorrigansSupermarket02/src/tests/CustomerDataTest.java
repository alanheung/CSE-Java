import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import corrigan.CustomerData;
import corrigan.User;


public class CustomerDataTest {
	private CustomerData customer;

	@Before
	public void setUp() {
		customer = new CustomerData();
	}

	@Test
	public void testOneEmployeeInArray(){
		assertEquals(1,customer.getNumberOfCustomers());

	}
	
	@Test
	public void testAddNewEmployee(){
		User sharon =new User("Sharon Keane","shazkeane335@msn.com","Athlone");
		customer.addCustomer(sharon);
		assertEquals(2,customer.getNumberOfCustomers());
		customer.removeCustomer(sharon);
	}
	
	
	@Test
	public void testRemoveEmployees(){
		User sharon =new User("Sharon Keane","shazkeane335@msn.com","Dromoher");
		User colm =new User("Colm Fitzgerald","c.fits@gmail.com","Athlone");
		customer.addCustomer(sharon);
		customer.addCustomer(colm);
		assertEquals(3,customer.getNumberOfCustomers());
		customer.removeCustomer(sharon);
		assertEquals(2,customer.getNumberOfCustomers());
		customer.removeCustomer(colm);
	}
	
	@Test
	public void testGetAllCustomers(){
		User sharon =new User("Sharon Keane","shazkeane335@msn.com","Dromoher");
		User colm =new User("Colm Fitzgerald","c.fits@gmail.com","Athlone");
		customer.addCustomer(sharon);
		customer.addCustomer(colm);
		CustomerData.getAllCustomers();
		assertEquals(3,customer.getNumberOfCustomers());
		customer.removeCustomer(sharon);
		customer.removeCustomer(colm);
		
	}
}
