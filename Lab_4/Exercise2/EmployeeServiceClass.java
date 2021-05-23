package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import java.util.Scanner;

interface EmployeeService {
    void getDetails();
    void insuranceScheme();
    void empDetails();
}

public class EmployeeServiceClass extends Employee implements EmployeeService{
	

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter Employee Details:");
		System.out.println("Enter Employee id:");
		super.setId(sc1.nextLong());
		System.out.println("Enter Employee Name:");
		sc1.nextLine();
		super.setName(sc1.nextLine());
		System.out.println("Enter Employee Salary");
		super.setSalary(sc1.nextDouble());
		System.out.println("Enter Employee Designation:");
		sc1.nextLine();
		super.setDesignation(sc1.nextLine());
		System.out.println("Enter Employee Insurance Scheme:");
		super.setInsuranceScheme(sc1.next());
		sc1.nextLine();
		
		sc1.close();
		
	}

	@Override
	public void insuranceScheme() {
		// TODO Auto-generated method stub
		
		System.out.println("Employee Insurance Scheme: " + super.getInsuranceScheme());
		
	}

	@Override
	public void empDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("Employee ID: " + super.getId());
		System.out.println("Employee Name: " + super.getName());
		System.out.println("Employee Salary: " + super.getSalary());
		System.out.println("Employee Designation: " + super.getDesignation());
		System.out.println("Employee Insurance Scheme: " + super.getInsuranceScheme());
	}
}
