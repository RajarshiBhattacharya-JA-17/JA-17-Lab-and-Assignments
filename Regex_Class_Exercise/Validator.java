package regex.assignments;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	
	public static void validateUserName(String userName)
	{
		if(userName.length() < 8)
			System.out.println("Invalid Username...Length should be more than 8.");
		else
		{
			String regex = "^(?=.*[0-9])(?=.*[a-zA-Z])"
					+ "(?=.*[@#$%^&-+=()]).{8,}$";
			
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(userName);
			
			if(m.matches())
				System.out.println("Username is valid");
			else
				System.out.println("Invalid Username...Include atleast one special character.");
		}
	}
	
	public static void validatePwd(String pwd)
	{
		if(pwd.length() < 8)
			System.out.println("Invalid Password...Length should be equal to 8.");
		else
		{
			String regex = "^(?=.*[0-9])(?=.*[a-zA-Z])"
					+ "(?=.*[@#$%^&-+=()]).{8,}$";
			
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(pwd);
			
			if(m.matches())
				System.out.println("Password is valid");
			else
				System.out.println("Invalid Password...Include atleast one special character.");
		}
	}
	
	public static void validateMail(String mail)
	{
		String regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
                
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(mail);
		
		if(m.matches())
			System.out.println("Email id is valid!!");
		else
			System.out.println("Email id is not valid!!");
	}
	
	public static void validateMobile(String num)
	{
		String regex = "[789]{1}[0-9]{9}";
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(num);
		
		if(m.matches())
			System.out.println("Mobile number is valid!!");
		else
			System.out.println("Mobile number is invalid!!");
	}
	
	public static void validateCity(String city)
	{
		String regex = "^[a-zA-Z]{2,}$";
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(city);
		
		if(m.matches())
			System.out.println("City is valid!!");
		else
			System.out.println("Invalid City name!!");
	}
	
	public static void validatePincode(String pin)
	{
		String regex = "[0-9]{6}";
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(pin);
		
		if(m.matches())
			System.out.println("Pincode is valid!!");
		else
			System.out.println("Invalid Pincode!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String userName = sc.nextLine();
		
		System.out.println("Enter Password:");
		String pwd = sc.nextLine();
		
		System.out.println("Enter Email Id:");
		String mail = sc.nextLine();
		
		System.out.println("Enter Mobile Number:");
		String mobNo = sc.nextLine();
		
		System.out.println("Enter City:");
		String city = sc.nextLine();
		
		System.out.println("Enter Pincode:");
		String pincode = sc.nextLine();
		
		validateUserName(userName);
		validatePwd(pwd);
		validateMail(mail);
		validateMobile(mobNo);
		validateCity(city);
		validatePincode(pincode);
		
		sc.close();
	}

}
