/**
 * 
 */
package com.capgemini.books.exceptions;

/**
 * @author The Wonder Land
 *
 */
public class BookNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9088689832734260759L;

	public BookNotFoundException(String msg) {
		super(msg);
	}
}
