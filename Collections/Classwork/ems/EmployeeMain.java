package com.capgemini.ems;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee[] empList;
		
		empList = new Employee[3];
		
		empList[0] = new Employee(1234, "Ramapriya");
		empList[1] = new Employee(1235, "Kavya");
		empList[2] = new Employee(1236, "Dhruv");
		
		empList[0].displayEmpDetails();
		empList[1].displayEmpDetails();
		empList[2].displayEmpDetails();
		
		System.out.println();
		
		Employee emp = new Employee();
		emp.displayEmpDetails(empList);
		
		System.out.println();
		
		emp.displayEmpDetails(empList[2]);
	}

}
