/**
 * 
 */
package com.capgemini.exercise5;

import java.util.Scanner;

/**
 * @author Rajarshi
 *
 */
public class Exercise5Main {

	public int factorial(int a) {
		
		int fact = 1;
		if(a == 0 || a == 1) {
			return 1;
		}
		
		for(int i=2; i<=a; i++) {
			fact *= i;
		}
		
		return fact;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  =new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		Exercise5Main e5m = new Exercise5Main();
		
		Exercise5 e5 = e5m :: factorial;
		System.out.println("Factorial of "+num+" is: "+e5.fact(num));
		
		sc.close();
	}

}
