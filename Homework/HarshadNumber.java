import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int num = sc.nextInt();
		
		int rem = 0, sum = 0, temp = num;
		
		while(num > 0)
		{
			rem = num % 10;
			sum += rem;
			num /= 10;
		}
		if(temp % sum == 0)
			System.out.println("Harshad Number");
		else
			System.out.println("Not a Harshad Number");
	}

}
