package assignments.strings;

import java.util.*;

public class Question5 {
	
	public static void isAnagram(String str1, String str2)
	{
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
		
		if(str1.length() != str2.length())
			System.out.println("It is not an Anagram!!");
		else
		{
			char[] arr1 = str1.toLowerCase().toCharArray();
			char[] arr2 = str2.toLowerCase().toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1, arr2))
				System.out.println("It is an Anagram!!");
			else
				System.out.println("It is not an Anagram!!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first string:");
		String str1 = sc.nextLine();
		
		System.out.println("Enter second string:");
		String str2 = sc.nextLine();
		
		isAnagram(str1, str2);
		
		sc.close();
	}

}
