package assignments.strings;

import java.util.*;

public class Question10 {
	
	public static void checkString(String str, int index)
	{
		char[] letters = str.toCharArray();
		int i = index - 1;
		
		if((letters[i] >= 65 && letters[i] <=90) ||
				(letters[i] >= 97 && letters[i] <=122))
			System.out.println("Alphabet");
		else if(letters[i] >= 48 && letters[i] <= 57)
			System.out.println("Digit");
		else
			System.out.println("Special Character");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string:");
		String str = sc.nextLine();
		
		System.out.println("Index to search:");
		int index = sc.nextInt();
		
		if(index >= str.length())
			System.out.println("Index doesnot exist!!");
		else
			checkString(str, index);
		
		sc.close();
	}

}
