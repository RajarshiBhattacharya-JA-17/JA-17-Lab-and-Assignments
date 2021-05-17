package assignments.strings;

import java.util.*;

public class Question1 {
	
	public static void maxCharacter(String text)
	{
		int  max = 0;
		int[] charFreq = new int[text.length()];
		char maxChar = text.charAt(0);
		char[] charArr = text.toCharArray();
		
		for(int i=0; i<charArr.length; i++)
		{
			charFreq[i] = 1;
			for(int j=i+1; j<charArr.length; j++)
			{
				if(charArr[i] == charArr[j] && charArr[i] != '\0' && charArr[i] != '0')
				{
					charFreq[i]++;
					charArr[j] = '0';
				}
			}
		}
		
		max = charFreq[0];
		
		for(int i=0; i<charFreq.length; i++)
		{
			if(max < charFreq[i])
			{
				max = charFreq[i];
				maxChar = charArr[i];
			}
		}
		
		System.out.println("Max Occurring Character: " + maxChar
				 + "\nOccurred: " + max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string:");
		String str = sc.nextLine();
		
		maxCharacter(str);
		
		sc.close();
	}

}
