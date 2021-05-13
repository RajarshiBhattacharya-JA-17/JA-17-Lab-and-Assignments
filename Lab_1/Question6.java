import java.util.Scanner;

public class Question6 {
	
	public static int calculateDifference(int n)
	{
		int sumOfSquares = 0, squareOfSum = 0;
		for(int i=1; i<=n; i++)
		{
			sumOfSquares += ((int)Math.pow(i, 2));
			squareOfSum += i;
		}
		
		int difference = sumOfSquares - ((int)Math.pow(squareOfSum, 2));
		
		return difference;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int result = calculateDifference(num);
		
		System.out.println("Difference: "+result);
		
		sc.close();
	}

}
