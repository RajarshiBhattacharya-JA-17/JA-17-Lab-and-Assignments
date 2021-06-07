/**
 * 
 */
package com.capgemini.exercise4;

import java.util.Scanner;

/**
 * @author Rajarshi
 *
 */
public class VoterMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Voter ID:");
		String voterId = sc.next();
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		
		VoterDetails vd = new VoterDetails(voterId, age);
		
		System.out.println("Voter Details:");
		PrintInterface pi = vd :: toString;
		System.out.println(pi.printDetails());
		
		sc.close();
	}

}
