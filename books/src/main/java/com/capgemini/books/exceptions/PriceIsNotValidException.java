/**
 * 
 */
package com.capgemini.books.exceptions;

/**
 * @author The Wonder Land
 *
 */
public class PriceIsNotValidException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3871173372514730518L;
	
	public PriceIsNotValidException(String msg) {
		super(msg);
	}
	
}
