package ait.com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {
	@Test
	public void testGetters() {
		Employee emp1 = new Employee("R123456","John",25);
		assertEquals("R123456", emp1.getPpsNumber());
		assertEquals("John", emp1.getName());
		assertEquals(25, emp1.getAge());

	}
	@Test
	public void testSetters() {
		Employee emp1 = new Employee();
		emp1.setPpsNumber("R123456");
		emp1.setName("John");
		emp1.setAge(25);
		assertEquals("R123456", emp1.getPpsNumber());
		assertEquals("John", emp1.getName());
		assertEquals(25, emp1.getAge());

	}
}
