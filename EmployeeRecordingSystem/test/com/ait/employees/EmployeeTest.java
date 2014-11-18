package com.ait.employees;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	
	
	@Test
	public void testEmployeeConstructors(){
		Employee aEmployee = new Employee("w222222", "Donal", 26);
		
		assertEquals("w222222", aEmployee.getPpsNumber());
		assertEquals("Donal", aEmployee.getName());
		assertEquals(26, aEmployee.getAge());
		
	}
	
	@Test
	public void testChangePpsNumber(){
		Employee aEmployee = new Employee("w222222", "Donal", 26);
		aEmployee.setPpsNumber("x333333");
		
		assertEquals("x333333", aEmployee.getPpsNumber());
	}
	
	@Test 
	public void testChangeName(){
		Employee aEmployee = new Employee("w222222", "Donal", 26);
		aEmployee.setName("Fred");
		
		assertEquals("Fred", aEmployee.getName());
	}
	
	@Test
	public void testChangeAge(){
		Employee aEmployee = new Employee("w222222", "Donal", 26);
		aEmployee.setAge(27);
		
		assertEquals(27, aEmployee.getAge());
	}
}
