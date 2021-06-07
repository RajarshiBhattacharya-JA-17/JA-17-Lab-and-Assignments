/**
 * 
 */
package com.capgemini.exercise2;

import java.util.Scanner;

/**
 * @author Rajarshi
 *
 */
public class Exercise2Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String str = sc.next();
		
		Exercise2 e2 = (s) -> {
			char[] characters = s.toCharArray();
			String newString = "";
			for(int i=0; i<s.length()-1; i++) {
				newString += characters[i] + " ";
			}
			return newString + characters[s.length()-1];
		};
		
		System.out.println("New String: "+e2.space(str));
		
		sc.close();
	}

}
