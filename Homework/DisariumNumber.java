import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int num = sc.nextInt();
		
		int len = 0, temp = num;
		while(temp != 0)
		{
			len += 1;
			temp /= 10;
		}
		temp = num;
		int rem = 0, sum = 0;
		while(temp > 0) {
			rem = num % 10;
			sum += (int)Math.pow(rem, len);
			temp /= 10;
			len--;
		}
		if(sum == num)
			System.out.println("Disarium Number");
		else
			System.out.println("Not a Disarium Number");
	}

}
