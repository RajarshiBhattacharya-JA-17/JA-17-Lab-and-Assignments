package assignments.strings;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question14 {
	
	public static void checkEmail(String str)
	{
		String regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(str);
		
		if(m.matches())
			System.out.println("Email id is valid!!");
		else
			System.out.println("Email id is not valid!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Email Id:");
		String str = sc.nextLine();
		
		checkEmail(str);
		
		sc.close();
	}

}
