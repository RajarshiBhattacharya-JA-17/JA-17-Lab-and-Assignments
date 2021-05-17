package assignments.strings;

import java.util.*;

public class Question7 {
	
	public static void nonRepeatingCharacter(String str)
	{
		int count = 0;
		str = str.toLowerCase();
		char[] charArr = str.toCharArray();
		
		for(int i=0; i<charArr.length; i++)
		{
			count = 1;
			for(int j=i+1; j<charArr.length; j++)
			{
				if(charArr[i] == charArr[j] && charArr[i] != '\0' && charArr[i] != '0')
				{
					count++;
					charArr[j] = '0';
				}
			}
			if(count == 1 && charArr[i]!='0')
				System.out.println(charArr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string:");
		String str = sc.nextLine();
		
		System.out.println("Non-Repeating Characters:");
		nonRepeatingCharacter(str);
		
		sc.close();
	}

}
