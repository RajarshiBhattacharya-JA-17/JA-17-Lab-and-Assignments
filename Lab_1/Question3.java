import java.util.Scanner;

public class Question3 {
	
	static int nonRecursiveFibonacci(int num)
	{
		int n1 = 0, n2 = 1, count = 0, result = n1+n2;
		
		while(count < num-2)
		{
			n1 = n2;
			n2 = result;
			result = n1 + n2;
			count++;
		}
		return result;
	}
	
	static int recursiveFibonacci(int num)
	{
		if(num <= 1)
			return num;
		return recursiveFibonacci(num - 1) + recursiveFibonacci(num - 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rec_res = 0, nonrec_res = 0;

		for(int i=0; i<num; i++)
		{
			rec_res = recursiveFibonacci(i);
			nonrec_res = nonRecursiveFibonacci(i);
		}
		
		System.out.println("Recursive: " + rec_res);
		System.out.println("Non-Recursive: " + nonrec_res);
		
		sc.close();
		
	}

}
