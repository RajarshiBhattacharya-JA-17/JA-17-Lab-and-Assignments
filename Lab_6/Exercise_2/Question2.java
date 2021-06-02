package com.capgemini.question2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Question2 {
	
	static Scanner sc = new Scanner(System.in);
	static Map<Character, Integer> charCount = new HashMap<Character, Integer>();
	
	private static Map<Character, Integer> countChars(char[] arr){
		
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for(char c : arr) {
			if(charCount.containsKey(Character.valueOf(c))) {
				charCount.replace(Character.valueOf(c), 
				charCount.get(Character.valueOf(c)) + 1);
			}
			else {
				charCount.put(Character.valueOf(c), 1);
			}
		}
		
		return charCount;
	}
	
	public static void readChars() {
		// TODO Auto-generated method stub
		System.out.println("Enter number of characters to enter:");
		int n = sc.nextInt();
		char[] arr = new char[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter Character:");
			arr[i] = sc.next().trim().charAt(0);
		}
		
		charCount = countChars(arr);
		System.out.println();
		displayCount();
	}

	private static void displayCount() {
		// TODO Auto-generated method stub
		 System.out.println("Charcater Count:");
		 for(Entry<Character, Integer> hashmapdata : charCount.entrySet()) {
			 System.out.print(hashmapdata);
			 System.out.print(", ");
			 System.out.println();
		 }
	}


}
