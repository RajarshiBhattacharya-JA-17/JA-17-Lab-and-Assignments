/**
 * 
 */
package com.capgemini.question5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Rajarshi
 *
 */
public class Question5 {

	static Scanner sc = new Scanner(System.in);
	
	public static  void readDetails() {
		
		int n;
		do {
			System.out.println("Enter the size of array:");
			n = sc.nextInt();
			if(n <= 1)
				System.out.println("Size cannot be 1 or less than 1");
		}while(n<=1);
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter the number:");
			arr[i] = sc.nextInt();
		}
		
		int secondSmallestNum = getSecondSmallest(arr);
		
		if(secondSmallestNum == 0)
			System.out.println("All numbers are equal...");
		else
			System.out.println("Second Smallest Number: "+
					secondSmallestNum);
		
	}

	private static int getSecondSmallest(int[] arr) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for(int i : arr) {
			numList.add(i);
		}
		numList.sort(null);
		
		for(int i=0; i<numList.size() - 1; i++) {
			if(numList.get(i) != numList.get(i+1))
				return numList.get(i+1);
		}
		
		return 0;
	}
}
