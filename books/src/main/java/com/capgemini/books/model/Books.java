/**
 * 
 */
package com.capgemini.books.model;

import com.capgemini.books.exceptions.BookIDCannotBeNegativeException;
import com.capgemini.books.exceptions.BookNameCannotBeNullException;
import com.capgemini.books.exceptions.PriceIsNotValidException;

/**
 * @author Rajarshi
 *
 */
public class Books {
	
	private int bId;
	private String bName;
	private double price;
	
	/**
	 * @return the bId
	 */
	public int getbId() {
		return bId;
	}
	/**
	 * @param bId the bId to set
	 */
	public void setbId(int bId) {
		this.bId = bId;
	}
	/**
	 * @return the bName
	 */
	public String getbName() {
		return bName;
	}
	/**
	 * @param bName the bName to set
	 */
	public void setbName(String bName) {
		this.bName = bName;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * 
	 */
	public Books() {
		super();
	}
	
	/**
	 * Parameterized Constructor
	 * @param bId
	 * @param bName
	 * @param price
	 */
	public Books(int bId, String bName, double price) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.price = price;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bId;
		result = prime * result + ((bName == null) ? 0 : bName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		if (bId != other.bId)
			return false;
		if (bName == null) {
			if (other.bName != null)
				return false;
		} else if (!bName.equals(other.bName))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	/*
	 * toString Method
	 */
	@Override
	public String toString() {
		return "Books [bId=" + bId + ", bName=" + bName + ", price=" + price + "]";
	}
	
	public void validateBID() throws BookIDCannotBeNegativeException{
		// TODO Auto-generated method stub
		if(this.bId < 0) {
			throw new BookIDCannotBeNegativeException("Book Id "
					+ "cannot be negative");
		}
		
	}
	public void validateBName() throws BookNameCannotBeNullException {
		// TODO Auto-generated method stub
		if(this.bName.isBlank()) {
			throw new BookNameCannotBeNullException("Book Name"
					+ " cannot be Null");
		}
	}
	public void validateBPrice() throws PriceIsNotValidException {
		// TODO Auto-generated method stub
		if(this.price <= 0) {
			throw new PriceIsNotValidException("Book Price "
					+ "is not valid");
		}
	}
	
}
