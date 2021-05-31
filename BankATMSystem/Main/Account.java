package com.capgemini.bankATMSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Account extends BankCustomer{

	private int accNumber;
	private String pin;
	private double balance = 1000;
	
	ArrayList<Account> custList = new ArrayList<Account>();
	Scanner input = new Scanner(System.in);
	
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account() {
		super();
	}
	
	public Account(int accNumber, double balance, String pin, 
			int custId, String custName, 
			String custAddress, String email) {
		super(custId, custName, custAddress, email);
		this.accNumber = accNumber;
		this.pin = pin;
	}
	
	public ArrayList<Account> addCustomer()
	{
		System.out.println("Enter Customer Details:");
		setCustId();
		System.out.println("Enter Customer Name:");
		input.nextLine();
		setCustName(input.nextLine());
		System.out.println("Enter Customer Address:");
		input.nextLine();
		setCustAddress(input.nextLine());
		System.out.println("Enter Customer Mail Id:");
		input.nextLine();
		setEmail(input.nextLine());	
		if(getEmail() != null)
		{
			System.out.println("Enter Account Number:");
			accNumber = input.nextInt();
			System.out.println("Set your PIN:");
			input.nextLine();
			pin = input.nextLine();
			custList.add(new Account(accNumber, balance, pin, getCustId(),
					getCustName(), getCustAddress(), getEmail()));
		}
		
		return custList;
	}
	
	public void displayDetails(int no)
	{
		for(int i=0; i<custList.size(); i++)
		{
			if(custList.get(i).getAccNumber() == no)
			{
				System.out.println("CustId: "+custList.get(i).getCustId()
						+", CustName: "+custList.get(i).getCustName()
						+", CustAddress: "+custList.get(i).getCustAddress()
						+", CustEmail: "+custList.get(i).getEmail()
						+", Acc_No: "+custList.get(i).getAccNumber()
						+", PIN: "+custList.get(i).getPin());
				return;
			}
		}
		System.out.println("Account not found!!!");
		System.out.println();
	}
	
	public void changePin(ArrayList<Account> custList, int no)
	{
		for(int i=0; i<custList.size(); i++)
		{
			if(custList.get(i).getAccNumber() == no)
			{
				System.out.println("Enter new Pin:");
				custList.get(i).setPin(input.next());
				System.out.println("PIN Successfully Changed!!!");
				System.out.println();
				return;
			}
		}
		System.out.println("Account not found!!!");
		System.out.println();
	}

}
