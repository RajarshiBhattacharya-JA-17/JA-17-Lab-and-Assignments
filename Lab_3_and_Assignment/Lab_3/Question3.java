import java.util.*;

public class Question3 {
	
	public static String alterString(String strSource)
	{
		char[] charArray = strSource.toCharArray();
		
		
		
		for(int i=0; i<charArray.length; i++)
		{
			if(charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' ||
					charArray[i] == 'o' || charArray[i] == 'u' || charArray[i] == 'A' ||
					charArray[i] == 'E' || charArray[i] == 'I' || charArray[i] == 'O' ||
					charArray[i] == 'U')
				continue;
			else
			{
				if(charArray[i] == 'z')
					charArray[i] = 'a';
				else if(charArray[i] == 'Z')
					charArray[i] = 'A';
				else
					charArray[i] = (char)(charArray[i] + 1);
			}
		}
		
		return String.valueOf(charArray);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string:");
		String str = sc.nextLine();
		
		String resultString = alterString(str);
		
		System.out.println("Altered String: " + resultString);
		
		sc.close();
	}

}
