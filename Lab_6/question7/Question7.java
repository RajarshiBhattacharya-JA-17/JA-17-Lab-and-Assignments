/**
 * 
 */
package com.capgemini.question7;

import java.util.Scanner;

/**
 * @author Rajarshi
 *
 */
public class Question7 {

	static Scanner sc = new Scanner(System.in); 
	
	public static void readDetails() {
		
		System.out.println("Enter the size of Array:");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		String[] reversedNumbers = new String[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter Number:");
			arr[i] = sc.nextInt();
		}
		
		reversedNumbers = getSorted(arr);
		
		displayNumbers(reversedNumbers);
	}

	private static String[] getSorted(int[] arr) {
		// TODO Auto-generated method stub
		
		String[] reversedNumbers = new String[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			String str = Integer.valueOf(arr[i]).toString();
			StringBuilder sb = new StringBuilder();
			
			sb.append(str);
			sb.reverse();
			
			reversedNumbers[i] = sb.toString();
		}
		
		return reversedNumbers;
	}

	private static void displayNumbers(String [] reversedNumbers) {
		// TODO Auto-generated method stub
		System.out.println("Reversed Numbers:");
		System.out.println();
		for(String s : reversedNumbers) {
			System.out.println(s);
		}
	}
	
}
