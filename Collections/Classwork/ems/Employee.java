package com.capgemini.ems;

public class Employee {

	private static int count = 100;
	private int empCode;
	private int empId;
	private String empName;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpCode() {
		return empCode;
	}
	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}
	
	public Employee() {
		super();
	}
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
		setEmpCode(count++);
	}
	
	public void displayEmpDetails(Employee[] emp)
	{
		for(int i=0; i<emp.length; i++)
		{
			System.out.println("EmpCode: " + emp[i].getEmpCode() + 
					", EmpId: " + emp[i].getEmpId() + 
					", EmpName: " + emp[i].getEmpName());
		}
	}
	
	public void displayEmpDetails()
	{
		System.out.println("EmpCode: " + empCode + 
				", EmpId: " + empId + 
				", EmpName: " + empName);
	}
	
	public void displayEmpDetails(Employee emp1)
	{
		System.out.println("EmpCode: " + emp1.getEmpCode() + 
				", EmpId: " + emp1.getEmpId() + 
				", EmpName: " + emp1.getEmpName());
	}
	
}
