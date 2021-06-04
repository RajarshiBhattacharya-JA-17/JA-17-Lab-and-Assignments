/**
 * 
 */
package com.capgemini.books.exceptions;

/**
 * @author The Wonder Land
 *
 */
public class BookIDCannotBeNegativeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8693523258754531709L;

	public BookIDCannotBeNegativeException(String msg){
		super(msg);
	}
}
