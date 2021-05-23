package com.Capgemini.exception;

import java.util.Scanner;

public class Employee {
	
	static void validateSalary(int salary) throws EmployeeException
	{
		if(salary < 3000)
			throw new EmployeeException("Salary is Less!!");
		else
			System.out.println("Salary is OK!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int salary = 0;
		
		System.out.println("Enter Employee Salary:");
		salary = sc.nextInt();
		
		try
		{
			validateSalary(salary);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		sc.close();

	}

}
