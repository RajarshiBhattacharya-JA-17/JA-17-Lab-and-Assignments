/**
 * 
 */
package com.capgemini.question4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

/**
 * @author Rajarshi
 *
 */
public class Question4 {

	static Scanner sc = new Scanner(System.in);
	static Map<String, Integer> studentMarksList = new HashMap<String, Integer>();
	static Map<String, String> medalList = new HashMap<String, String>(); 
	
	public static void readDetails() {
		System.out.println("Enter number of Students:");
		int n = sc.nextInt();
		
		String studRegNo;
		Integer studMarks;
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter Student Registration Number:");
			studRegNo = sc.next();
			System.out.println("Enter Student Marks:");
			studMarks = sc.nextInt();
			studentMarksList.put(studRegNo, studMarks);
		}
		
		medalList = getStudents(studentMarksList);
		
		displayStudents();
	}

	private static void displayStudents() {
		// TODO Auto-generated method stub
		
		System.out.println("Student List for Medals:");
		 for(Entry<String, String> hashmapdata : medalList.entrySet()) {
			 System.out.print(hashmapdata);
			 System.out.print(", ");
			 System.out.println();
		 }
	}

	private static Map<String, String> getStudents(Map<String, Integer> studentMarksList2) {
		// TODO Auto-generated method stub
		String medal;
		
		for(String regNo : studentMarksList2.keySet()) {
			
			Integer marks = studentMarksList2.get(regNo);
			if(marks >= 90) {
				medal = "Gold";
				medalList.put(regNo, medal);
			}
			else if(marks >= 80 && marks < 90) {
				medal = "Silver";
				medalList.put(regNo, medal);
			}
			else if(marks >= 70 && marks < 80) {
				medal = "Bronze";
				medalList.put(regNo, medal);
			}
		}
		return medalList;
		
	}
	
}
