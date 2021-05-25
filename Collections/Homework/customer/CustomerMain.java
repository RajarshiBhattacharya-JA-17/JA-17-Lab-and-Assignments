package com.capgemini.customer;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		char ch = 'y';
		Customer cust = new Customer();
		ArrayList<Customer> custList = new ArrayList<Customer>();
		
		while(ch == 'y')
		{
			System.out.println("Enter your choice");
			System.out.println("1) Add Customer Details\n"
					+ "2) Display Customer Details\n");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1://Adding Customer Details
				System.out.println("How many Customer Details to add?:");
				int n = sc.nextInt();
				for(int i=0; i<n; i++)
					custList = cust.addItem();
				System.out.println();
				break;
			case 2://Display All the Customer Details
				cust.Display();
				System.out.println();
				break;
			default:System.out.println("Incorrect Choice!!");
				System.out.println();
			}
			
			System.out.println("Do you wish to continue?(y/n):");
			ch = sc.next().charAt(0);
			System.out.println();
		}
		
		System.out.println("Thank You!!!");
		
		sc.close();
	}

}
