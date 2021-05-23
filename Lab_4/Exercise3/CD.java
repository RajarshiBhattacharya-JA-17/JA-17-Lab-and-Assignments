package com.Capgemini;

public class CD extends MediaItem{

	private String actor;
	private String genre;
	
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public CD(int identificationNumber, String title, int numberOfCopies, String actor, String genre, int runTime) {
		
		super(identificationNumber, title, numberOfCopies, runTime);
		this.actor = actor;
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return "CD [actor=" + actor + ", genre=" + genre + ", Title=" + getTitle() + ", Number Of Copies="
				+ getNumberOfCopies() + "]";
	}
	
}
