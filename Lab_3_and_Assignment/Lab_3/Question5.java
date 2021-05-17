import java.util.*;

public class Question5 {
	
	public static int[] Counts(String str)
	{
		int lineCount = 0, wordCount = 0, charCount = 0;
		String[] lines = str.split("\\."); 
		
		lineCount = lines.length;
		
		for(int i=0; i<lines.length; i++)
		{
			String[] words = lines[i].split(" ");
			wordCount += words.length;
			for(String word : words)
				charCount += word.length();
		}
		int[] result = {lineCount, wordCount, charCount};
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter text: ");
		
		String text = sc.nextLine();
		
		int[] resultArray = Counts(text);
		
		System.out.println("Line Count: " + resultArray[0]);
		System.out.println("Word Count: " + resultArray[1]);
		System.out.println("Character Count: " + resultArray[2]);
		
		sc.close();
	}

}
