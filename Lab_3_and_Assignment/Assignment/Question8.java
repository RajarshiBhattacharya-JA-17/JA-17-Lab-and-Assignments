package assignments.strings;

import java.util.*;

public class Question8 {
	
	public static void removeChar(String str, String charToRem)
	{
		String resultString = str.replaceAll(charToRem, "");
		
		System.out.println("String after removing " + charToRem + ": " + resultString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string:");
		String str = sc.nextLine();
		
		System.out.println("Enter character to remove:");
		String charToRem = sc.nextLine();
		
		removeChar(str, charToRem);
		
		sc.close();
	}

}
