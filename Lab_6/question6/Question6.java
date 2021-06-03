/**
 * 
 */
package com.capgemini.question6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author Rajarshi
 *
 */
public class Question6 {

	static Scanner sc = new Scanner(System.in);
	static Map<String, Integer> voterDetails = new HashMap<String, Integer>();
	static ArrayList<String> voterList = new ArrayList<String>();
	
	public static void readDetails() {
		
		System.out.println("How many voter details do you wish to add?");
		int n = sc.nextInt();
		
		System.out.println("Enter Voter Details:");
		for(int i=0; i<n; i++) {
			System.out.println("Enter Voter ID:");
			sc.nextLine();
			String voterId = sc.nextLine();
			System.out.println("Enter Voter Age:");
			Integer age = sc.nextInt();
			voterDetails.put(voterId, age);
		}
		
		voterList = votersList(voterDetails);
		
		displayEligibleVoters();
	}

	private static ArrayList<String> votersList(Map<String, Integer> voterDetails2) {
		// TODO Auto-generated method stub
		
		for(Entry<String, Integer> data : voterDetails2.entrySet()) {
			if(data.getValue() >= 18) {
				voterList.add(data.getKey());
			}
		}
		return voterList;
	}

	private static void displayEligibleVoters() {
		// TODO Auto-generated method stub
		
		Iterator<String> id = voterList.iterator();
		System.out.println("Eligible Voters:");
		System.out.println();
		while(id.hasNext()) {
			System.out.println("Voter ID: "+id.next());
		}
	}
	
}
