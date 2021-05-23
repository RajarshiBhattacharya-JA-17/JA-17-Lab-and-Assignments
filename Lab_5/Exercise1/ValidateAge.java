package com.Capgemini.validateAge;

import java.util.Scanner;

public class ValidateAge {
	
	static void validateAge(int age) throws InvalidAgeException
	{
		if(age < 15)
			throw new InvalidAgeException("Invalid Age!! Age below 15!! Access Denied!!!");
		else
			System.out.println("Welcome New USer");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int age = 0;
		
		System.out.println("Enter your Age for Validation:");
		age  = sc.nextInt();
		
		try
		{
			validateAge(age);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		sc.close();
	}

}
