package assignments.strings;

import java.util.Scanner;

public class Question6 {
	
	public static void reverseString(String str)
	{
		char[] originalString = str.toCharArray();
		char[] reverseStr = new char[originalString.length];
		int j = 0;
		
		for(int i=originalString.length - 1; i>=0; i--)
		{
			reverseStr[j] = originalString[i];
			j++;
		}
		
		System.out.println("Reversed String: " + String.valueOf(reverseStr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string:");
		String str = sc.nextLine();
		
		reverseString(str);
		
		sc.close();
	}

}
