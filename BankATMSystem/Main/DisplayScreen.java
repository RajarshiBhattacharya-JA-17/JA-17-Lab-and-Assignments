package com.capgemini.bankATMSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class DisplayScreen {

	public static void main(String[] args)
	{
		char ch = 'y';
		int accNo = 0;
		Scanner sc = new Scanner(System.in);
		
		Account acc = new Account();
		ArrayList<Account> custList = new ArrayList<Account>();
		
		while(ch == 'y')
		{
			System.out.println("Enter your choice:");
			System.out.println("1) Add new Customer\n"
					+ "2) Display Customer Details\n"
					+ "3) Start Transaction\n");
			
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1://Add new customer
				custList = acc.addCustomer();
				System.out.println();
				break;
			case 2://Display Details
				System.out.println("Enter Account Number:");
				accNo = sc.nextInt();
				acc.displayDetails(accNo);
				System.out.println();
				break;
			case 3:new ATM().transact(custList);
				break;
			default:System.out.println("Invalid Choice!!!");
			break;
			}
			
			System.out.println("Do you wish to continue?(y/n):");
			ch = sc.next().charAt(0);
		}
		
		System.out.println("Thank You");
		sc.close();
	}
}
