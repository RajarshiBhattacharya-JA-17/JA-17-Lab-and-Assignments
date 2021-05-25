package com.capgemini.flower;

//Using Hash Set

public class Flower {

	private int fId;
	private String fName;
	private double pricePerKg;
	private int qty;
	
	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public double getPricePerKg() {
		return pricePerKg;
	}
	public void setPricePerKg(double pricePerKg) {
		this.pricePerKg = pricePerKg;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public Flower() {
		super();
	}
	
	public Flower(int fId, String fName, double pricePerKg, int qty) {
		super();
		this.fId = fId;
		this.fName = fName;
		this.pricePerKg = pricePerKg;
		this.qty = qty;
	}

}
