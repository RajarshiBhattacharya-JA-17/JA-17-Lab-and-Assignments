package com.capgemini.question1;

import java.util.ArrayList;
import java.util.HashMap;

public class Question1 {
	
	public static ArrayList<Integer> getValues(HashMap<String, Integer> keyValue)
	{
		ArrayList<Integer> valueList = new ArrayList<Integer>();
		valueList.addAll(keyValue.values());
		valueList.sort(null);
		return valueList;
	}

}
