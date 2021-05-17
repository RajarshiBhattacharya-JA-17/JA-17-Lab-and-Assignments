package assignments.strings;

import java.util.*;

public class Question2 {
	
	public static void removeDuplicates(String text)
	{
		String resultString = new String();
		
		for(int i=0; i<text.length(); i++)
		{
			char letter = text.charAt(i);
			if(resultString.indexOf(letter) < 0)
				resultString += letter;
		}
		
		System.out.println("New String after removing duplicates: " + resultString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string:");
		String str = sc.nextLine();
		
		removeDuplicates(str);
		
		sc.close();
	}

}
