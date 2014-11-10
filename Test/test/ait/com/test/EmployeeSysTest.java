package ait.com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class EmployeeSysTest {

	private EmployeeSys myEmployeeSys;

	@Before
	public void setUp(){
		myEmployeeSys = new EmployeeSys();
	}
	@Test	
	public void testUsername(){	
		EmployeeSys e1 = new EmployeeSys(true, "root", "admin");
		assertEquals("admin", myEmployeeSys.getUsername());
	}
	@Test	
	public void testGetPassword(){	
		EmployeeSys e1 = new EmployeeSys(true, "root", "admin");
		assertEquals("root",myEmployeeSys.getPassword());
	}
	@Test	
	public void testUsernameAndPasswordFalse(){	
		EmployeeSys e1 = new EmployeeSys(true, "woot", "addmin");
		assertFalse(myEmployeeSys.checkUsername("root"));
		assertFalse(myEmployeeSys.checkPassword("admin"));
	}
	@Test
	public void testNoEmployees(){
		EmployeeSys e1 = new EmployeeSys(true, "root", "admin");
		assertEquals(0,myEmployeeSys.getNumberOfEmployees());
	}
	public void testOneEmployees(){
		EmployeeSys e1 = new EmployeeSys(true, "root", "admin");
		Employee emp1 = new Employee();
		myEmployeeSys.addEmployee(emp1);
		assertEquals(1,myEmployeeSys.getNumberOfEmployees());
	}
	public void testTwoEmployees(){
		EmployeeSys e1 = new EmployeeSys(true, "root", "admin");
		Employee emp1 = new Employee("R123456","John",25);
		Employee emp2 = new Employee("Q123456","Jim",35);
		myEmployeeSys.addEmployee(emp1);
		myEmployeeSys.addEmployee(emp2);
		assertEquals(2,myEmployeeSys.getNumberOfEmployees());
	}
	public void userLoggedInAndOut(){
		EmployeeSys e1 = new EmployeeSys(true, "root", "admin");
		Employee emp1 = new Employee("R123456","John",25);
		myEmployeeSys.addEmployee(emp1);
		e1.setUserLoggedIn(false);
		assertFalse(myEmployeeSys.isUserLoggedIn());
	}
	public void testPasswordChange(){
		EmployeeSys e1 = new EmployeeSys(true, "root", "admin");
		Employee emp1 = new Employee("R123456","John",25);
		myEmployeeSys.addEmployee(emp1);
		e1.setPassword("nothing");
		assertEquals("nothing",myEmployeeSys.getPassword());
		Employee emp2 = new Employee("R123456","John",25);
		assertEquals(1,myEmployeeSys.getNumberOfEmployees());		
	}




}
