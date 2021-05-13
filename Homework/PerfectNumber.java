import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int num = sc.nextInt();
		
		if(num == 1)
			System.out.println("Not a Perfect Number");
		else
		{
			int sum = 1;
			for(int i=2; i<num; i++)
			{
				if(num % i == 0)
					sum += i;
			}
			if(sum == num)
				System.out.println("Perfect Number");
			else
				System.out.println("Not a Perfect Number");
		}
	}

}
