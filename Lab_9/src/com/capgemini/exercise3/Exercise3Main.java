/**
 * 
 */
package com.capgemini.exercise3;

import java.util.Scanner;

/**
 * @author Rajarshi
 *
 */
public class Exercise3Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String uName = sc.next();
		System.out.println("Enter Password:");
		String pwd = sc.next();
		
		Exercise3 e3 = (a,b) -> {
			if(a.equals("HansiFlick") && b.equals("Ty$yu709"))
				return true;
			return false;
		};
		
		if(e3.validation(uName, pwd)) {
			System.out.println("Validated...");
		}
		else {
			System.out.println("Not Validated...");
		}
		
		sc.close();
	}

}
