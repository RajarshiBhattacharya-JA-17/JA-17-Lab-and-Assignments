/**
 * 
 */
package com.capgemini.predicateinarrayexample;

/**
 * @author Rajarshi
 *
 */
public class Student {

	private int sId;
	private String sName;
	/**
	 * @return the sId
	 */
	public int getsId() {
		return sId;
	}
	/**
	 * @param sId the sId to set
	 */
	public void setsId(int sId) {
		this.sId = sId;
	}
	/**
	 * @return the sName
	 */
	public String getsName() {
		return sName;
	}
	/**
	 * @param sName the sName to set
	 */
	public void setsName(String sName) {
		this.sName = sName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sId;
		result = prime * result + ((sName == null) ? 0 : sName.hashCode());
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
		Student other = (Student) obj;
		if (sId != other.sId)
			return false;
		if (sName == null) {
			if (other.sName != null)
				return false;
		} else if (!sName.equals(other.sName))
			return false;
		return true;
	}
	/**
	 * 
	 */
	public Student() {
		super();
	}
	/**
	 * @param sId
	 * @param sName
	 */
	public Student(int sId, String sName) {
		super();
		this.sId = sId;
		this.sName = sName;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + "]";
	}
	
}
