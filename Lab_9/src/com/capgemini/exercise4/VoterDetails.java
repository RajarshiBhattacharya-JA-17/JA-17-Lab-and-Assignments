/**
 * 
 */
package com.capgemini.exercise4;

/**
 * @author Rajarshi
 *
 */
public class VoterDetails {

	private String voterId;
	private int age;
	/**
	 * @return the voterId
	 */
	public String getVoterId() {
		return voterId;
	}
	/**
	 * @param voterId the voterId to set
	 */
	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @param voterId
	 * @param age
	 */
	public VoterDetails(String voterId, int age) {
		super();
		this.voterId = voterId;
		this.age = age;
	}
	@Override
	public String toString() {
		return "VoterDetails [voterId=" + voterId + ", age=" + age + "]";
	}
	
}
