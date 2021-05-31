package com.capgemini.question1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Question1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		ArrayList<Integer> valueList = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many details do you wish to add?:");
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter Key Value Details for Student "+i+" :");
			System.out.println("Enter Student ID as Key:");
			String id = sc.next();
			System.out.println("Enter Student Age as Value:");
			Integer age = sc.nextInt();
			hMap.put(id, age);
		}
		
		valueList = Question1.getValues(hMap);
		
		System.out.println();
		
		for(int val : valueList)
			System.out.println(val);
		
		sc.close();
	}

}
