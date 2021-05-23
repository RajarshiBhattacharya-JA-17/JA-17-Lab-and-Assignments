package com.Capgemini;

public abstract class WrittenItem extends Item{

	private String author;
	
	public WrittenItem(String author, int identificationNumber, String title, int numberOfCopies) {
		
		super(identificationNumber, title, numberOfCopies);
		this.setAuthor(author);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
