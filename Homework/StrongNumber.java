import java.util.*;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int num = sc.nextInt();
		int temp = num, rem = 0, sum = 0, factor = 1;
		while(temp != 0)
		{
			rem = temp % 10;
			factor = 1;
			if(rem != 0 || rem != 1)
			{
				for(int i=2; i<=rem; i++)
				{
					factor *= i;
				}
			}
			sum += factor;
			temp /= 10;
		}
		if(sum == num)
			System.out.println("Strong Number");
		else
			System.out.println("Not a Strong Number");
	}

}
