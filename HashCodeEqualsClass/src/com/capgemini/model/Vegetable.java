/**
 * 
 */
package com.capgemini.model;


/**
 * @author The Wonder Land
 *
 */
public class Vegetable implements Comparable<Vegetable> {

	private int vegId;
	private String vegName;
	private double vegPrice;
	/**
	 * @return the vegId
	 */
	public int getVegId() {
		return vegId;
	}
	/**
	 * @param vegId the vegId to set
	 */
	public void setVegId(int vegId) {
		this.vegId = vegId;
	}
	/**
	 * @return the vegName
	 */
	public String getVegName() {
		return vegName;
	}
	/**
	 * @param vegName the vegName to set
	 */
	public void setVegName(String vegName) {
		this.vegName = vegName;
	}
	/**
	 * @return the vegPrice
	 */
	public double getVegPrice() {
		return vegPrice;
	}
	/**
	 * @param vegPrice the vegPrice to set
	 */
	public void setVegPrice(double vegPrice) {
		this.vegPrice = vegPrice;
	}
	/**
	 * 
	 */
	public Vegetable() {
		super();
	}
	/**
	 * @param vegId
	 * @param vegName
	 * @param vegPrice
	 */
	public Vegetable(int vegId, String vegName, double vegPrice) {
		super();
		this.vegId = vegId;
		this.vegName = vegName;
		this.vegPrice = vegPrice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + vegId;
		result = prime * result + ((vegName == null) ? 0 : vegName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(vegPrice);
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
		Vegetable other = (Vegetable) obj;
		if (vegId != other.vegId)
			return false;
		if (vegName == null) {
			if (other.vegName != null)
				return false;
		} else if (!vegName.equals(other.vegName))
			return false;
		if (Double.doubleToLongBits(vegPrice) != Double.doubleToLongBits(other.vegPrice))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Vegetable [vegId=" + vegId + ", vegName=" + vegName + ", vegPrice=" + vegPrice + "]";
	}
	
	@Override
	public int compareTo(Vegetable vegList) {
		// TODO Auto-generated method stub
		return vegName.compareTo(vegList.vegName);
	}
	
}
