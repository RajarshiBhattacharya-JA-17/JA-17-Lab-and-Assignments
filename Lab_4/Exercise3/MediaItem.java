package com.Capgemini;

public class MediaItem extends Item{

	private int runTime;

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public MediaItem(int identificationNumber, String title, int numberOfCopies, int runTime) {
		super(identificationNumber, title, numberOfCopies);
		this.runTime = runTime;
	}

	@Override
	public String toString() {
		return "MediaItem [runTime=" + runTime + ", Identification Number=" + getIdentificationNumber()
				+ ", Title=" + getTitle() + ", Number Of Copies=" + getNumberOfCopies() + "]";
	}
	
}
