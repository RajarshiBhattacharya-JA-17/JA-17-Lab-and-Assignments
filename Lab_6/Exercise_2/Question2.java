package com.capgemini.question2;

import java.util.HashMap;
import java.util.Map;

public class Question2 {
	
	public static Map<Character, Integer> countChars(char[] arr){
		
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

}
