package assignments.strings;

import java.util.*;

public class Question11 {

	public static void isPalindrome(String str)
	{
		str = str.toLowerCase();
		//String revstr = str;
		StringBuilder sb = new StringBuilder(str);
		//StringBuilder rsb = new StringBuilder(revstr);
		sb.reverse();
		
		if(str.equals(sb.toString()))
			System.out.println("It is a palindrome!!");
		else
			System.out.println("It is not a palindrome!!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string:");
		String str = sc.nextLine();
		
		System.out.println("Enter starting index:");
		int starIndex = sc.nextInt();
		
		System.out.println("Enter ending index:");
		int endIndex = sc.nextInt();
		
		String subStr = str.substring(starIndex, endIndex+1);
		
		isPalindrome(subStr);
		
		sc.close();
	}

}
