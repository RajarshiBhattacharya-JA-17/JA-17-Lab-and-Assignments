import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0, digit = 0;
		while(num > 0)
		{
			digit = num % 10;
			sum += ((int)Math.pow(digit, 3));
			num /= 10;
		}
		
		System.out.println("Sum: " + sum);
		
		sc.close();
	}

}
