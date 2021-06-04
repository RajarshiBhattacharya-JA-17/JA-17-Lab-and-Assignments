/**
 * 
 */
package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.beans.Employee;
import com.cg.eis.service.EmployeeInsuranceSystem;

/**
 * @author Rajarshi
 *
 */
public class UserInput {
	
	static Scanner sc = new Scanner(System.in);
	static Long empId;
	static String empName, empDesignation, empInsuranceScheme;
	static double empSalary;
	
	public static void input() {
		
		char ch = 'y';
		EmployeeInsuranceSystem emps = new EmployeeInsuranceSystem();
		
		while(ch == 'y') {
			System.out.println("Enter your choice:");
			System.out.println();
			System.out.println("1) Add New Employee Details\n"
					+ "2) Find Employee By Employee ID\n"
					+ "3) Display Employees Under a Particular Insurance Scheme\n"
					+ "4) Delete Employee Record\n"
					+ "5) Exit App\n");
			int choice = sc.nextInt();
			switch(choice) {
			case 1://Add New Employee Record
				System.out.println("Enter Employee Details");
				System.out.println();
				readDetails();
				boolean added = emps.addEmployee(new Employee(empId, empDesignation,
						empName, emps.getInsuranceScheme(empSalary, empDesignation),
						empSalary));
				if(added)
					System.out.println("Employee Record Added Successfully");
				System.out.println();
				break;
			case 2://Find Employee Details Using Employee ID
				readEmpID();
				emps.findEmployee(empId);
				System.out.println();
				break;
			case 3://Display Employees Under a Particular Insurance Scheme
				System.out.println("Enter Insurance Scheme:");
				sc.nextLine();
				empInsuranceScheme = sc.nextLine();
				System.out.println();
				System.out.println("Employees Under "+empInsuranceScheme+":");
				emps.showEmployeeUnderInsuranceScheme(empInsuranceScheme);
				System.out.println();
				break;
			case 4://Delete Employee Record
				readEmpID();
				emps.deleteEmployee(empId);
				System.out.println();
				break;
			case 5://Exit App
				ch = 'n';
				break;
			default:System.out.println("Invalid Choice Entered...");
				System.out.println();
			}
			
		}
	}

	private static void readEmpID() {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee ID:");
		empId = sc.nextLong();
	}

	private static void readDetails() {
		// TODO Auto-generated method stub
		readEmpID();
		System.out.println("Enter Employee Name:");
		sc.nextLine();
		empName = sc.nextLine();
		System.out.println("Enter Employee Designation:");
		sc.nextLine();
		empDesignation = sc.nextLine();
		System.out.println("Enter Employee Salary:");
		empSalary = sc.nextDouble();
	}

}
