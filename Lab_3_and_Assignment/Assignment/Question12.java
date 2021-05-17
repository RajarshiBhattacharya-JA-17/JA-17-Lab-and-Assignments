package assignments.strings;

import java.util.*;

public class Question12 {
	
	public static void deleteWord(String str, String word)
	{
		if(str.contains(word))
		{
			String w = word + " ";
			str = str.replaceAll(w, "");
			
			w = " " + word;
			str = str.replaceAll(w, "");
		}
		
		System.out.println("After deleting word: " + str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string:");
		String str = sc.nextLine();
		
		System.out.println("Enter word to delete:");
		String word = sc.nextLine();
		
		deleteWord(str, word);
		
		sc.close();
	}

}
