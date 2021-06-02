/**
 * 
 */
package com.capgemini.books.service;

import java.util.ArrayList;
import java.util.Iterator;

import com.capgemini.books.exceptions.ArrayListIsNullException;
import com.capgemini.books.exceptions.BookAlreadyFoundException;
import com.capgemini.books.exceptions.BookIDCannotBeNegativeException;
import com.capgemini.books.exceptions.BookNameCannotBeNullException;
import com.capgemini.books.exceptions.BookNotFoundException;
import com.capgemini.books.exceptions.PriceIsNotValidException;
import com.capgemini.books.model.Books;

/**
 * @author Rajarshi
 *
 */
public class BooksManager {

	//Default Constructor
	public BooksManager() {
		
	}
	/*
	 * Create an ArrayList for books 
	 */
	ArrayList<Books> bookList = new ArrayList<Books>();
	
	/*
	 * addBooks method to add book details
	 * @param book Id
	 * @param book Name
	 * @param book Price
	 */
	public ArrayList<Books> addBooks(int bId, String bName, 
			double price) {

		Books book = new Books(bId, bName, price);
		validateBookDetails(book);
		try {
			checkIfBookAlreadyExists(bId);
		} catch (BookAlreadyFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bookList.add(book);
		return bookList;
	}
	
	/*
	 * Display Book Details for a specific Book ID
	 * @exception ArrayListIsNullException
	 * @param Array List - bookList
	 * @param Book ID - bId
	 */
	public void displayBooks(ArrayList<Books> bookList,
			int bId) throws ArrayListIsNullException, 
	BookNotFoundException {
		
		if(bookList.isEmpty()) {
			throw new ArrayListIsNullException("Book List cannot be empty or null");
		}
		
		Iterator<Books> biter = bookList.iterator();
		while(biter.hasNext()) {
			Books b = biter.next();
			if(b.getbId() == bId) {
				System.out.println("Book ID: "+b.getbId()
						+", Book Name: "+b.getbName()
						+", Book Price: "+b.getPrice());
				return;
			}
		}
		
		throw new BookNotFoundException("Book Not Found...");
	}
	
	/*
	 * Update Book Name and Book Price for a specific Book Id
	 * @exception BookNotFoundException
	 * @param Array List - bookList
	 * @param Book ID - bId
	 * @param Book Name - bName
	 * @param Book Price - bPrice
	 */
	public void updateBook(ArrayList<Books> bookList,
			int bId, String bName, double bPrice) throws 
	BookNotFoundException {
		
		Iterator<Books> biter = bookList.iterator();
		while(biter.hasNext()) {
			Books b = biter.next();
			if(b.getbId() == bId) {
				b.setbName(bName);
				b.setPrice(bPrice);
				return;
			}
		}
		throw new BookNotFoundException("Book Not Found...");
	}
	
	/*
	 * Delete Book for a specific Book ID
	 * @exception BookNotFoundException
	 * @param Array List - bookList
	 * @param Book ID - bId
	 */
	public void deleteBook(ArrayList<Books> bookList,
			int bId) throws BookNotFoundException {
		
		Iterator<Books> biter = bookList.iterator();
		while(biter.hasNext()) {
			Books b = biter.next();
			if(b.getbId() == bId) {
				bookList.remove(b);
				return;
			}
		}
		throw new BookNotFoundException("Book Not Found...");
	}
	
	/*
	 * Check is Book already exists - Private Method
	 * @exception BookAlreadyFoundException
	 * @param Book Id - bId
	 */
	private void checkIfBookAlreadyExists(int bId) throws 
	BookAlreadyFoundException {
		// TODO Auto-generated method stub
		
		Iterator<Books> biter = bookList.iterator();
		while(biter.hasNext()) {
			Books b = biter.next();
			if(b.getbId() == bId) {
				throw new BookAlreadyFoundException("Book is "
						+ "already present");
			}
		}
	}

	/*
	 * Validate Book Details method - Private Method
	 * @exception BookIDCannotBeNegativeException
	 * @exception BookNameCannotBeNullException
	 * @exception PriceIsNotValidException
	 * @param Book Object
	 */
	private void validateBookDetails(Books book) {
		// TODO Auto-generated method stub
		try {
			book.validateBID();
		} catch (BookIDCannotBeNegativeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book.validateBName();
		} catch (BookNameCannotBeNullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book.validateBPrice();
		} catch (PriceIsNotValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
