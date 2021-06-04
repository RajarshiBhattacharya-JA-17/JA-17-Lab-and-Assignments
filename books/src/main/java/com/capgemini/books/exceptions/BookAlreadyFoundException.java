/**
 * 
 */
package com.capgemini.books.exceptions;

/**
 * @author The Wonder Land
 *
 */
public class BookAlreadyFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8480043846319743031L;
	
	public BookAlreadyFoundException(String msg)
	{
		super(msg);
	}
	
}
