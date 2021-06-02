/**
 * 
 */
package com.capgemini.books.exceptions;

/**
 * @author The Wonder Land
 *
 */
public class BookNameCannotBeNullException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7829239011941095999L;

	public BookNameCannotBeNullException(String msg) {
		super(msg);
	}
}
