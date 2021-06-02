/**
 * 
 */
package com.capgemini.question3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

/**
 * @author Rajarshi
 *
 */
public class Question3 {
	
	static Scanner sc = new Scanner(System.in);
	static Map<Integer, Integer> squareValue = new HashMap<Integer, Integer>();
	
	private static Map<Integer, Integer> getSquares(int[] arr){
		
		
		
		for(int num : arr) {
			squareValue.put(Integer.valueOf(num), 
					Integer.valueOf((int)Math.pow(num, 2)));
		}
		return squareValue;
	}
	
	public static void readValues() {
		
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter Number:");
			arr[i] = sc.nextInt();
		}
		
		squareValue = getSquares(arr);
		System.out.println();
		displaySquares();
	}

	private static void displaySquares() {
		// TODO Auto-generated method stub
		System.out.println("Square Values:");
		 for(Entry<Integer, Integer> hashmapdata : squareValue.entrySet()) {
			 System.out.print(hashmapdata);
			 System.out.print(", ");
			 System.out.println();
		 }
	}
	
}
