package com.ait.employees;
import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testEmployeeName() {
		Employee employee = new Employee("John");
		assertEquals("John", employee.getName());
	}
}
