package assignments.strings;

import java.util.Scanner;

public class Question15 {
	
	public static void repeatedWords(String str)
	{
		str = str.toLowerCase();
		String[] words = str.split(" ");
		int wordCount = 0;
		
		for(int i=0; i<words.length; i++)
		{
			wordCount = 1;
			for(int j=i+1; j<words.length; j++)
			{
				if(words[i].equals(words[j]) && words[i] != "0")
				{
					wordCount++;
					words[j] = "0";
				}
			}
			if(wordCount > 1 && words[i] != "0")
				System.out.println(words[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string:");
		String str = sc.nextLine();
		
		System.out.println("Repeated Words:");
		repeatedWords(str);
		
		sc.close();
	}

}
