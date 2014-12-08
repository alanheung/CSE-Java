import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class EmployeeDataTest {
	private EmployeeData myEmployeeData;

	@Before
	public void setUp() {
		myEmployeeData = new EmployeeData();
	}

	@Test
	public void testOneEmployeeInArray(){
		assertEquals(1,myEmployeeData.getNumberOfEmployees());

	}
	
	@Test
	public void testAddNewEmployee(){
		User sharon =new User("Sharon Keane","shazkeane335@msn.com","Athlone");
		myEmployeeData.addEmployee(sharon);
		assertEquals(2,myEmployeeData.getNumberOfEmployees());
		myEmployeeData.removeEmployee(sharon);
	}
	
	
	@Test
	public void testRemoveEmployees(){
		User sharon =new User("Sharon Keane","shazkeane335@msn.com","Dromoher");
		User colm =new User("Colm Fitzgerald","c.fits@gmail.com","Athlone");
		myEmployeeData.addEmployee(sharon);
		myEmployeeData.addEmployee(colm);
		assertEquals(3,myEmployeeData.getNumberOfEmployees());
		myEmployeeData.removeEmployee(sharon);
		assertEquals(2,myEmployeeData.getNumberOfEmployees());
		myEmployeeData.removeEmployee(colm);


	}
	
	@Test
	public void testShowAllEmployees(){
		User sharon =new User("Sharon Keane","shazkeane335@msn.com","Dromoher");
		User colm =new User("Colm Fitzgerald","c.fits@gmail.com","Athlone");
		myEmployeeData.addEmployee(sharon);
		myEmployeeData.addEmployee(colm);
		EmployeeData.getAllEmployees();
		assertEquals(3, myEmployeeData.getNumberOfEmployees());
		myEmployeeData.removeEmployee(sharon);
		myEmployeeData.removeEmployee(colm);
	}

}
