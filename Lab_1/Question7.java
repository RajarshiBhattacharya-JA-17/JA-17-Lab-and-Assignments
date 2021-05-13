import java.util.Scanner;

public class Question7 {

	public static boolean checkNumber(int n)
	{
		int digit = 0, prevDigit = n % 10;
		while(n > 0)
		{
			digit = n % 10;
			n /= 10;
			if(digit <= prevDigit)
			{
				prevDigit = digit;
				continue;
			}
				
			else
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		boolean isIncreasing = checkNumber(num);
		
		if(isIncreasing)
			System.out.println("Increasing Sequence");
		else
			System.out.println("Not an Increasing Sequence");
		
		sc.close();
	}

}
