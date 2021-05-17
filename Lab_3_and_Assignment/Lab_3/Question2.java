import java.util.*;

public class Question2 {
	
	public static String getImage(String strImage)
	{
		StringBuffer sb = new StringBuffer(strImage);
		String reverseString = (sb.reverse()).toString();
		
		return reverseString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string:");
		String str = sc.nextLine();
		
		String mirrorString = getImage(str);
		
		System.out.println("Mirror Image: " + str + "|" + mirrorString);
		
		sc.close();
	}

}
