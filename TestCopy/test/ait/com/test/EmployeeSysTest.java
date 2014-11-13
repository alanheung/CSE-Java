package ait.com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class EmployeeSysTest {

//	private EmployeeSys myEmployeeSys;

//	@Before
//	public void setUp(){
//		myEmployeeSys = new EmployeeSys();
//	}
	@Test
	public void testLogin(){
		EmployeeSys aEmployeeSys = new EmployeeSys();
		//correct username and password
		assertTrue(aEmployeeSys.login("root","admin"));
		//incorrect username and password
		assertFalse(aEmployeeSys.login("notRoot", "notAdmin"));
		//incorrect password
		assertFalse(aEmployeeSys.login("root","notAdmin"));
	}
	
	@Test
	public void testCheckNumberOfEmployees(){
		EmployeeSys aEmployeeSys = new EmployeeSys();
		//should be no employees in system.
		assertEquals(0,aEmployeeSys.getNumberOfEmployees());
		 
	}
	
	@Test
	public void testLoginAndAddingEmployeesToSys(){
		EmployeeSys aEmployeeSys = new EmployeeSys();
		Employee aEmployee = new Employee();
		//user must be logged in
		aEmployeeSys.login("root", "admin");
		//add employee to system
		aEmployeeSys.addEmployee(aEmployee);
		assertEquals(1,aEmployeeSys.getNumberOfEmployees());
	}
	
	@Test
	public void testLoginFailureAndAddingEmployeesToSys(){
		EmployeeSys aEmployeeSys = new EmployeeSys();
		Employee aEmployee = new Employee();
		//add employee to system without login
		aEmployeeSys.addEmployee(aEmployee);
		assertEquals(0,aEmployeeSys.getNumberOfEmployees());
	}
	
	@Test
	public void testLoginSuccessAndAddingTwoEmployeesToSys(){
		EmployeeSys aEmployeeSys = new EmployeeSys();
		Employee aEmployee = new Employee();
		//user must be logged in
		aEmployeeSys.login("root", "admin");
		//add 2 employee to system
		aEmployeeSys.addEmployee(aEmployee);
		aEmployeeSys.addEmployee(aEmployee);
		assertEquals(2,aEmployeeSys.getNumberOfEmployees());
	}
	
	@Test
	public void testLogOutTest(){
		EmployeeSys aEmployeeSys = new EmployeeSys();
		Employee aEmployee = new Employee();
		//user must be logged in
		aEmployeeSys.login("root", "admin");
		//adds employee to system
		aEmployeeSys.addEmployee(aEmployee);
		//user logs out
		aEmployeeSys.logOut();
		aEmployeeSys.addEmployee(aEmployee);
		assertEquals(1,aEmployeeSys.getNumberOfEmployees());
	}




}
