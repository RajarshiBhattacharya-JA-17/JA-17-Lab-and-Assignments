package assignments.strings;

import java.util.*;

public class Question13 {
	
	public static void beginWithUpperCase(String str)
	{
		String lower = "", upper = "";
		
		char charAtPosition;
		for(int i=0; i<str.length(); i++)
		{
			charAtPosition = str.charAt(i);
			if(charAtPosition >= 'A' && charAtPosition <= 'Z')
				upper += charAtPosition;
			else
				lower += charAtPosition;
		}
		
		System.out.println("Modified String: " + upper + lower);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string:");
		String str = sc.nextLine();
		
		beginWithUpperCase(str);
		
		sc.close();
	}

}
