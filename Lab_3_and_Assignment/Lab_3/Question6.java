import java.util.*;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		System.out.println("Enter string:");
		String str = sc.nextLine();
		
		str = str.toLowerCase();
		char[] letters = str.toCharArray();
		
		for(int i=0; i<letters.length - 1; i++)
		{
			if(letters[i] > letters[i+1])
			{
				System.out.println("It is a negative string.");
				flag = false;
				break;
			}
		}
		
		if(flag == true)
			System.out.println("It is a positive string.");
		
		sc.close();
	}

}
