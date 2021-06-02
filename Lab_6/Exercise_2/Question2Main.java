/**
 * 
 */
package com.capgemini.question2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

/**
 * @author Rajarshi
 *
 */
public class Question2Main {

	/**
	 * @param args
	 */
	static Scanner sc = new Scanner(System.in);
	static Map<Character, Integer> charCount = new HashMap<Character, Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		readChars();
		
		displayCount(charCount);
	}

	private static void readChars() {
		// TODO Auto-generated method stub
		System.out.println("Enter number of characters to enter:");
		int n = sc.nextInt();
		char[] arr = new char[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter Character:");
			arr[i] = sc.next().trim().charAt(0);
		}
		
		charCount = Question2.countChars(arr);
		System.out.println();
	}

	private static void displayCount(Map<Character, Integer> charCount) {
		// TODO Auto-generated method stub
		 System.out.println("Charcater Count:");
		 for(Entry<Character, Integer> hashmapdata : charCount.entrySet()) {
			 System.out.print(hashmapdata);
			 System.out.print(", ");
			 System.out.println();
		 }
	}

}
