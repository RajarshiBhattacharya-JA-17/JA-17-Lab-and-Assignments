package com.Capgemini;

public class JournalPaper extends WrittenItem{

	private int yearPublished;
	
	public JournalPaper(int yearPublished, String author, int identificationNumber, String title, int numberOfCopies) {
		
		super(author, identificationNumber, title, numberOfCopies);
		this.setYearPublished(yearPublished);
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	
	@Override
	public String toString()
	{
		return "Author: " + getAuthor() + ", Identification Number: " + getIdentificationNumber() +
				", Title: " + getTitle() + ", Number Of Copies: " + getNumberOfCopies() +
				", Publication Year: " + yearPublished;
	}
}
