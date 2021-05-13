import java.util.Scanner;

public class Question5 {
	
	public static int calculateSum(int n)
	{
		int sum = 0, count = 0;
		for(int i=1; count < 5 ; i++)
		{
			if(i % 3 == 0 || i % 5 == 0)
			{
				sum += i;
				count++;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int result = calculateSum(num);
		
		System.out.println("Sum:" + result);
		
		sc.close();
	}

}
