/**
 * 
 */
package com.capgemini.author;

import java.util.Scanner;

import com.capgemini.author.model.Author;

/**
 * @author Rajarshi
 * 
 */
public class AuthorMain {
	
	/*
	 * Static Declarations
	 * Scanner input
	 * @param name
	 * @param email
	 * @param gender
	 */
	
	static String name, email;
	static char gender;
	static Scanner sc = new Scanner(System.in);
	static Author author;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = 'y';
		
		while(ch == 'y')
		{
			System.out.println("Enter your choice:");
			System.out.println("1) Add Author Details\n"
					+ "2) Display Author Details\n");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1://Add Author Details
				readDetails();
				author = new Author(name, email, gender);
				author.validateAuthor(author);
				System.out.println();
				break;
			case 2://Display All Author Details
				System.out.println(author.toString());
				System.out.println();
				System.out.println();
				break;
			default:System.out.println("Invalid Choice");
				System.out.println();
				break;
			}
			
			System.out.println("Do you wish to continue?(y/n)");
			ch = sc.next().charAt(0);
			System.out.println();
		}
		System.out.println("Thank You");
	}

	private static void readDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter Author Details");
		System.out.println("Enter Author Name");
		sc.nextLine();
		name = sc.nextLine();
		System.out.println("Enter Author Email");
		sc.nextLine();
		email = sc.nextLine();
		System.out.println("Enter Author Gender");
		System.out.println("m -> Male\n"
				+ "f -> Female\n"
				+ "u -> Unknown");
		gender = sc.next().charAt(0);
	}

}
