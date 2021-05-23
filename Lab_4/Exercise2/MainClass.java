package com.cg.eis.pl;

import com.cg.eis.service.EmployeeServiceClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeServiceClass esc1 = new EmployeeServiceClass();
		
		esc1.getDetails();
		esc1.insuranceScheme();
		esc1.empDetails();
	}

}
