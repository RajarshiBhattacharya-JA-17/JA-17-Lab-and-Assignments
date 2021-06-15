/**
 * 
 */
package com.capgemini.service;

/**
 * @author Rajarshi
 *
 */
public class EmployeeService {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeRepository e = new EmployeeRepository();
		e.addEmployee();
		
		System.out.println("Sum of salary of all employees: "+e.salSum());
		System.out.println();
		System.out.println("Departments and their count of employee:");
		e.deptAndEmpCount();
		System.out.println();
		System.out.println("Senior most Employee: "+e.getSeniorEmployee());
		System.out.println();
		System.out.println("List of employees and their duration of service in days and months:");
		e.getEmpAndDuration();
		System.out.println();
		System.out.println("Employees without departments:");
		e.getEmpWithoutDepartment();
		System.out.println();
		System.out.println("Department with highest employees: "+e.getDepartmentWithHighestEmployee());
		System.out.println();
		System.out.println("List of employees with Name, hiredate and day of week on which they started:");
		e.getEmpNameHireDateAndDayOfWeekOfStarting();
		System.out.println();
		System.out.println("List of employees with Name, hiredate and day of week is Friday:");
		e.getEmpNameHireDateAndDayOfWeekOfStartingIsFriday();
		System.out.println();
		System.out.println("Employee manager report:");
		e.getEmployeeManagerDetails();
		System.out.println();
		System.out.println("List of employees without any manager:");
		e.getEmployeeWithoutManager();
		System.out.println();
		System.out.println("List of subordinates of a manager:");
		e.getEmployeeByManagerName();
		System.out.println();
		System.out.println("Employee sorted by id:");
		e.sortEmployeeById();
		System.out.println();
		System.out.println("Employee sorted by department id:");
		e.sortEmployeeByDepartmentId();
		System.out.println();
		System.out.println("Employee sorted by name:");
		e.sortEmployeeByName();
		System.out.println();
		
	}

}
