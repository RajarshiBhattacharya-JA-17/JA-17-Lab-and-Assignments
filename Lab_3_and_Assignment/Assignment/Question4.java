package assignments.strings;

import java.util.*;

public class Question4 {
	
	public static void modifyString(String str1, String str2)
	{
		int[] count = new int[256];
		for(int i=0; i<str2.length(); i++)
		{
			count[str2.charAt(i)]++;
		}
		
		int str1Index = 0, resultIndex = 0;
		
		char[] arr = str1.toCharArray();
		
		while(str1Index != arr.length)
		{
			char c = arr[str1Index];
			if(count[c] == 0)
			{
				arr[resultIndex] = arr[str1Index];
				resultIndex++;
			}
			str1Index++;
		}
		
		String resultString = new String(arr);
		
		System.out.println("Resultant String: " + resultString.substring(0, resultIndex));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first string:");
		String str1 = sc.nextLine();
		
		System.out.println("Enter second string:");
		String str2 = sc.nextLine();
		
		modifyString(str1, str2);
		
		sc.close();
	}

}
