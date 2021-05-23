package com.Capgemini.validateName;

import java.util.Scanner;

public class ValidateName {
	
	static void validateName(String fName, String lName) throws InvalidNameException
	{
		if(fName.isEmpty() || lName.isEmpty())
			throw new InvalidNameException("First Name or Last Name is Empty!! Access Denied!!!");
		else
			System.out.println("Welcome: " + fName + " " + lName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String firstName;
		String lastName;
		
		System.out.println("Enter First Name:");
		firstName = sc.nextLine();
		System.out.println("Enter Last Name:");
		lastName = sc.nextLine();
		
		try {
			validateName(firstName, lastName);
		}
		catch(Exception  e)
		{
			System.out.println(e);
		}
		
		sc.close();

	}

}
