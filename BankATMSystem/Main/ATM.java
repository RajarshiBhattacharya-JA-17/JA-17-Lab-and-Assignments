package com.capgemini.bankATMSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {

	public void transact(ArrayList<Account> custList){
		// TODO Auto-generated method stub
		
		int accNo = 0;
		String pin;
		int amt = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		Transaction t = new Transaction();
		
		System.out.println("Enter Account No:");
		accNo = sc.nextInt();
		System.out.println("Enter PIN:");
		pin = sc.next();
		
		if(t.checkCredentials(custList, accNo, pin))
		{
			System.out.println("Enter Your Choice:");
			System.out.println("1) Withdraw\n"
					+ "2) Deposit\n"
					+ "3) Check Balance\n"
					+ "4) Change PIN");
			
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1://Withdraw Amount
				System.out.println("Enter Withdraw Amount:");
				amt = sc.nextInt();
				t.withdrawAmt(custList, accNo, amt);
				System.out.println();
				break;
			case 2://Deposit Amount
				System.out.println("Enter Amount to Deposit:");
				amt = sc.nextInt();
				t.depositAmount(custList, accNo, amt);
				System.out.println();
				break;
			case 3://Check Balance
				new SavingsAccount().displayBalance(custList, accNo);
				System.out.println();
				break;
			case 4://Change PIN
				t.changePin(custList, accNo);
				System.out.println();
				break;
			default:System.out.println("Invalid Choice...");
				System.out.println();
				break;
			
			}
		}
	}

}
