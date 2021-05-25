package com.capgemini.customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
	
	private int cId, age;
	private static int count = 100;
	private String custName, email, mobileNumber;
	private Date dob;
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public Customer() {
		super();
	}
	
	public Customer(int cId, String custName, int age, 
			Date dob, String email, String mobileNumber) {
		super();
		this.cId = cId;
		this.age = age;
		this.custName = custName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.dob = dob;
	}
	
	private boolean isValidated(String Name, int Age, 
			String MailId, String MobNo)
	{
		boolean ageValidate = false;
		boolean mobNoValidate = false;
		boolean mailValidate = false;
		boolean nameValidate = false;
		
		String ageRegex = "^[0-9]{1,3}$";
		Pattern pAge = Pattern.compile(ageRegex);
		Matcher mAge = pAge.matcher(String.valueOf(Age));
		
		String mobRegex = "[6789]{1}[0-9]{9}";
		Pattern pMob = Pattern.compile(mobRegex);
		Matcher mMob = pMob.matcher(MobNo);
		
		String nameRegex = "^[a-zA-Z]{3,}";
		Pattern pName = Pattern.compile(nameRegex);
		Matcher mName = pName.matcher(Name);
		
		String mailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
		Pattern pMail = Pattern.compile(mailRegex);
		Matcher mMail = pMail.matcher(MailId);
		
		if(Age > 0 && Age < 100 && mAge.matches())
			ageValidate = true;
		else
			System.out.println("Invalid Age!!");
		if(mMail.matches())
			mailValidate = true;
		else
			System.out.println("Invalid Mail!!");
		if(mMob.matches())
			mobNoValidate = true;
		else
			System.out.println("Invalid Mobile Number!!");
		if(mName.matches() && Name != null)
			nameValidate = true;
		else
			System.out.println("Invalid Name!!");
		
		if(ageValidate & mailValidate & mobNoValidate & nameValidate)
			return true;
		else
			return false;
		
	}
	
	ArrayList<Customer> custList = new ArrayList<Customer>();
	public ArrayList<Customer> addItem() throws ParseException
	{
		System.out.println("Enter Customer Details:");
		System.out.println("Enter Customer Name:");
		sc.nextLine();
		String Name = sc.nextLine();
		System.out.println("Enter Customer Age:");
		int Age = sc.nextInt();
		System.out.println("Enter Cusotmer DoB:");
		sc.nextLine();
		String sDOB = sc.nextLine();
		Date DOB = sdf.parse(sDOB);
		System.out.println("Enter Customer Email Id:");
		sc.nextLine();
		String MailId = sc.nextLine();
		System.out.println("Enter Customer Mobile Number:");
		sc.nextLine();
		String MobNo = sc.nextLine();
		if(isValidated(Name, Age, MailId, MobNo))
			custList.add(new Customer(count++, Name, Age, DOB, MailId, MobNo));
		else
			System.out.println("Incorrect Details Entered!!!");
		return custList;
	}
	
	public void Display()
	{
		Iterator<Customer> custIter = custList.iterator();
		while(custIter.hasNext())
		{
			Customer c = custIter.next();
			System.out.println("Customer ID: " + c.getcId() + ", Customer Name: " + c.getCustName() + ", Customer Age: " + c.getAge()
			+ ", Customer DoB: " + sdf.format(c.getDob()) + ", Customer Mail Id: " + c.getEmail() + ", Customer Mobile Number: " + c.getMobileNumber());
			System.out.println();
		}
	}

}
