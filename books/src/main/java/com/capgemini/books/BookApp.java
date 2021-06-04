package com.capgemini.books;

import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.books.exceptions.ArrayListIsNullException;
import com.capgemini.books.exceptions.BookNotFoundException;
import com.capgemini.books.model.Books;
import com.capgemini.books.service.BooksManager;

/**
 * Book App Main Class
 * @author Rajarshi
 *
 */
public class BookApp 
{
	/*
	 * Static Declarations
	 */
	static Scanner sc = new Scanner(System.in);
	static int bId;
	static String bName;
	static double bPrice;
	
    public static void main( String[] args ) {
    	
    	BooksManager bm = new BooksManager();
    	char ch = 'y';
    	
		ArrayList<Books> bookList = new ArrayList<Books>();
    	
    	while(ch == 'y') {
    		
    		System.out.println("Enter Your Choice:");
    		System.out.println("1) Add Book\n"
    				+ "2) Display Book Details Using Book ID\n"
    				+ "3) Update Book Details\n"
    				+ "4) Delete Book");
    		int choice = sc.nextInt();
    		//Switch-Case Block to choose Options
    		switch(choice)
    		{
    		case 1://Add Book Details
    			readDetails();
    			bookList = bm.addBooks(bId, bName, bPrice);
    			System.out.println();
    			break;
    		case 2://Display Book Details Using Book ID
    			readBID();
    			try {
					bm.displayBooks(bookList, bId);
				} catch (ArrayListIsNullException | BookNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			System.out.println();
    			break;
    		case 3://Update Book Details
    			readDetails();
    			try {
					bm.updateBook(bookList, bId, 
							bName, bPrice);
				} catch (BookNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			System.out.println();
    			System.out.println("Updated Successfully");
    			System.out.println();
    			break;
    		case 4://Delete Book
    			readBID();
    			try {
					bm.deleteBook(bookList, bId);
				} catch (BookNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			System.out.println();
    			System.out.println("Book Deleted Successfully");
    			System.out.println();
    			break;
    		default:System.out.println("Invalid Choice...");
    			System.out.println();
    			break;
    		}
    		
    		System.out.println("Do you wish to continue?(y/n)");
    		ch = sc.next().charAt(0);
    		System.out.println();
    	}
    	
    	System.out.println("Thank You...");
    }

	private static void readBID() {
		// TODO Auto-generated method stub
		System.out.println("Enter Book ID:");
		bId = sc.nextInt();
	}

	private static void readDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter Book Details");
		readBID();
		System.out.println("Enter Book Name:");
		sc.nextLine();
		bName = sc.nextLine();
		System.out.println("Enter Book Price:");
		bPrice = sc.nextDouble();
	}
}
