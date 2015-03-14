package com.ait.addEmployees;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import com.ait.entities.*;

public class AddEmployeesTest {
	private static final int firstEmployeeId = 12345;
	private static final String firstEmployeeName = "Tom";
	private static final String firstEmployeeAddress = "Athlone";
	private static final int secondEmployeeId = 678910;
	private static final String secondEmployeeName = "John";
	private static final String secondEmployeeAddress = "Dublin";

	@Test
	public void addOneEmployeeSucessful() {
		final EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.addEmployee(firstEmployeeId, firstEmployeeName,
				firstEmployeeAddress);
		final Employee employee = employeeManager.getEmployee(firstEmployeeId);
		assertEquals(firstEmployeeId, employee.getEmployeeId());
		assertEquals(firstEmployeeName, employee.getEmployeeName());
		assertEquals(firstEmployeeAddress, employee.getEmployeeAddress());
	}

	@Test
	public void addTwoEmployeesSucessful() {
		final EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.addEmployee(firstEmployeeId, firstEmployeeName,
				firstEmployeeAddress);
		employeeManager.addEmployee(secondEmployeeId, secondEmployeeName,
				secondEmployeeAddress);
		final List<Employee> employees = employeeManager.getEmployees();
		assertEquals(2, employees.size());
	}
	
}
