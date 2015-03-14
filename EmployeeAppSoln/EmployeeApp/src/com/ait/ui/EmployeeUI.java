package com.ait.ui;

import java.util.List;
import java.util.Scanner;
import com.ait.entities.*;

public class EmployeeUI {
    // declare two class variables
    private static Scanner scanner = null;

    final public static void main(final String args[]){
        System.out.println("Welcome to the Employee Maintenance application\n");

        // set the class variables
        scanner = new Scanner(System.in);

        // display the command menu
        displayMenu();

        // perform 1 or more actions
        String action = "";
        while (!action.equalsIgnoreCase("exit")){
            // get the input from the user
            action = Validator.getString(scanner,"Enter a command: ");
            System.out.println();

            if (action.equalsIgnoreCase("list")){
                displayAllEmployees();
            }else if (action.equalsIgnoreCase("add")){
                addEmployee();
            }else if (action.equalsIgnoreCase("exit")){
                System.out.println("Bye.\n");
            }else{
                System.out.println("Error! Not a valid command.\n");
            }
        }
        scanner.close();
    }

    public static void displayMenu(){
        System.out.println("COMMAND MENU");
        System.out.println("list    - List all employees");
        System.out.println("add     - Add an employee");
        System.out.println("help    - Show this menu");
        System.out.println("exit    - Exit this application\n");
    }

    public static void displayAllEmployees(){
        System.out.println("EMPLOYEE LIST");
        final EmployeeManager employeeManager= new EmployeeManager();
        final List<Employee> employees = employeeManager.getEmployees();
        for (final Employee employee : employees){
			System.out.println(employee.getEmployeeId()+" "+employee.getEmployeeName()+" "+employee.getEmployeeAddress());
		}
    }

    public static void addEmployee(){
    	final int employeeId = Validator.getInt(scanner, "Enter employeeId: ");
    	final String employeeName = Validator.getLine(scanner, "Enter employee name: ");
    	final String employeeAddress = Validator.getLine(scanner, "Enter employee address: ");
  
    	final EmployeeManager employeeManager= new EmployeeManager();
        employeeManager.addEmployee(employeeId,employeeName,employeeAddress) ;
        
        System.out.println();
        System.out.println("Employee "+employeeName+ " has been added.\n");
    }
}
