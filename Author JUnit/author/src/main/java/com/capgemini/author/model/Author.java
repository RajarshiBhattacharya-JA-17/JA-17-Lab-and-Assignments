package com.capgemini.author.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Author {
	
	private String name;
	private String email;
	private char gender;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}
	/**
	 * Default Constructor
	 */
	public Author() {
		super();
	}
	/**
	 * Parameterized Constructor
	 * @param name
	 * @param email
	 * @param gender
	 */
	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	/*
	 * Validate Name to check if it is null or empty
	 */
	public void validateName() {
		// TODO Auto-generated method stub
		if(this.name.isBlank()) {
			throw new RuntimeException("Name cannot be null or empty");
		}
	}
	
	/*
	 * Print Details
	 */
	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	
	/*
	 * Validate Email
	 */
	public void validateEmail() {
		// TODO Auto-generated method stub
		String regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
                
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(this.email);
		if(!m.matches()) {
			throw new RuntimeException("Email is Invalid");
		}
	}
	/*
	 * Validate Gender
	 */
	public void validateGender() {
		// TODO Auto-generated method stub
		if(this.gender != 'm' && this.gender != 'f' &&
				this.gender != 'u') {
			throw new RuntimeException("Invalid Gender Choice");
		}
	}
	/*
	 * Validation method
	 */
	public void validateAuthor(Author author) {
		// TODO Auto-generated method stub
		author.validateName();
		author.validateEmail();
		author.validateGender();
	}
	
}
