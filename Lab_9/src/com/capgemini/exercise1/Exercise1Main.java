/**
 * 
 */
package com.capgemini.exercise1;

import java.util.Scanner;

/**
 * @author Rajarshi
 *
 */
public class Exercise1Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter X:");
		double x = sc.nextDouble();
		System.out.println("Enter Y:");
		double y = sc.nextDouble();
		
		Exercise1 e1 = (a,b) -> Math.pow(a, b);
		
		System.out.println("Result of "+x+"^"+y+" : "
				+e1.power(x, y));
		
		sc.close();
		
	}

}
