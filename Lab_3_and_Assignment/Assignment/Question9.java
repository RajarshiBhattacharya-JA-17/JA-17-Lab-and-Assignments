package assignments.strings;

import java.util.Scanner;

public class Question9 {
	
	public static void wordCount(String str)
	{
		String[] words = str.split(" ");
		
		int countWords = words.length;
		
		System.out.println("Number of Words: " + countWords);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string:");
		String str = sc.nextLine();
		
		wordCount(str);
		
		sc.close();
	}

}
