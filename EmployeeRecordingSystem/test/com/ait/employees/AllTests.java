package com.ait.employees;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ EmployeeSysTest.class, EmployeeTest.class })
public class AllTests {

}
