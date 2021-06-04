/**
 * 
 */
package com.cg.eis.service;

import java.util.HashMap;
import java.util.Iterator;

import com.cg.eis.beans.Employee;

/**
 * @author Rajarshi
 *
 */
public class EmployeeInsuranceSystem implements EmployeeService {

	static HashMap<Long, Employee> employeeList = new HashMap<Long, Employee>();
	
	@Override
	public boolean addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		if(checkIfUnique(emp.getId())) {
			employeeList.put(emp.getId(), emp);
			return true;
		}
		System.out.println("Employee Record already exists!!!");
		return false;
	}

	private boolean checkIfUnique(long id) {
		// TODO Auto-generated method stub
		if(employeeList.containsKey(id)) {
			return false;
		}
		return true;
	}

	@Override
	public String getInsuranceScheme(double salary, String designation) {
		// TODO Auto-generated method stub
		designation = designation.toLowerCase();
		switch(designation) {
		case "system associate":if(salary > 5000 && salary < 20000) {
				return "Scheme C";
			}
			break;
		case "programmer":if(salary >= 20000 && salary < 40000) {
				return "Scheme B";
			}
			break;
		case "manager":if(salary >= 40000) {
				return "Scheme A";
			}
			break;
		case "clerk":if(salary < 5000) {
				return "No Scheme";
			}
		default:System.out.println("Invalid Designation or Salary given...");
		}
		return "No Eligible Scheme";
	}

	@Override
	public void findEmployee(Long id) {
		// TODO Auto-generated method stub
		if(employeeList.containsKey(id)) {
			System.out.println(employeeList.get(id));
		}
		else {
			System.out.println("Employee not found...");
		}
	}

	@Override
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		if(employeeList.containsKey(id)) {
			employeeList.remove(id);
			System.out.println("Employee Record Deleted Successfully");
		}
		else {
			System.out.println("Employee not found...");
		}
	}
	
	@Override
	public void showEmployeeUnderInsuranceScheme(String scheme) {
		Iterator<Employee> itr = employeeList.values().iterator();
		while(itr.hasNext()) {
			Employee e = itr.next();
			if(e.getInsuranceScheme().equalsIgnoreCase(scheme)) {
				System.out.println(e);
			}
			return;
		}
		System.out.println("No Employees found under this scheme...");
	}
	
}
