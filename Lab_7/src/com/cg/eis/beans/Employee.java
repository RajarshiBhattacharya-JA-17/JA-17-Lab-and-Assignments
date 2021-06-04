/**
 * 
 */
package com.cg.eis.beans;

/**
 * @author Rajarshi
 * @param id - Employee ID
 * @param designation - Employee Designation
 * @param name - Employee Name
 * @param insuranceScheme - Employee Insurance Scheme
 * @param salary - Employee Salary
 *
 */
public class Employee {

	private long id;
	private String designation, name, insuranceScheme;
	private double salary;
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
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
	 * @return the insuranceScheme
	 */
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	/**
	 * @param insuranceScheme the insuranceScheme to set
	 */
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * 
	 */
	public Employee() {
		super();
	}
	/**
	 * @param id
	 * @param designation
	 * @param name
	 * @param insuranceScheme
	 * @param salary
	 */
	public Employee(long id, String designation, String name, String insuranceScheme, double salary) {
		super();
		this.id = id;
		this.designation = designation;
		this.name = name;
		this.insuranceScheme = insuranceScheme;
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((insuranceScheme == null) ? 0 : insuranceScheme.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
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
		Employee other = (Employee) obj;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (id != other.id)
			return false;
		if (insuranceScheme == null) {
			if (other.insuranceScheme != null)
				return false;
		} else if (!insuranceScheme.equals(other.insuranceScheme))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Employee ID: " + id + ", Employee Name: " + name + ", Designation: " + designation + 
				", Employee Salary: " + salary + ", Insurance Scheme: " + insuranceScheme;
	}
	
}
