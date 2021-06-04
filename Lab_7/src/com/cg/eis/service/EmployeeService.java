/**
 * 
 */
package com.cg.eis.service;

import com.cg.eis.beans.Employee;

/**
 * @author Rajarshi
 *
 */
public interface EmployeeService {

	boolean addEmployee(Employee emp);
	String getInsuranceScheme(double salary, String designation);
	void findEmployee(Long id);
	void deleteEmployee(Long id);
	void showEmployeeUnderInsuranceScheme(String scheme);
	
}
