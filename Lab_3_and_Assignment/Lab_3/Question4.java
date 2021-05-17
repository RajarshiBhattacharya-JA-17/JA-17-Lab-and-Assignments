import java.util.*;

public class Question4 {
	
	public static int modifyNumber(int number1)
	{
		String num = String.valueOf(number1);
		
		StringBuffer sb = new StringBuffer("");
		
		for(int i=0; i<num.length(); i++)
		{
			char val = num.charAt(i);
			if(i==num.length() - 1)
				sb.append(val);
			else
			{
				int diff = Math.abs(((int)val) - ((int)num.charAt(i+1)));
				sb.append(diff);
			}
		}
		
		return Integer.parseInt(sb.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to modify: ");
		int num = sc.nextInt();
		
		int result = modifyNumber(num);
		
		System.out.println("Modified Number: " + result);
		
		sc.close();
	}

}
