package com.Capgemini;

public class Book extends WrittenItem{

	public Book(String author, int identificationNumber, String title, int numberOfCopies) {
		
		super(author, identificationNumber, title, numberOfCopies);
	}

	@Override
	public String toString()
	{
		return "Author: " + getAuthor() + ", Identification Number: " + getIdentificationNumber() +
				", Title: " + getTitle() + ", Number Of Copies: " + getNumberOfCopies();
	}
	
	@Override
	public void addItems()
	{
		setNumberOfCopies(getNumberOfCopies() + 1);
	}
	
	@Override
	public void checkIn()
	{
		setNumberOfCopies(getNumberOfCopies() + 1);
	}
	
	@Override
	public void checkOut()
	{
		setNumberOfCopies(getNumberOfCopies() - 1);
	}
}
