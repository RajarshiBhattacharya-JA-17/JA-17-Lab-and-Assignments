import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
	
	public static int getSecondSmallest(int[] arr)
	{
		Arrays.sort(arr);
		for(int i=0; i<arr.length - 1; i++)
		{
			if(arr[i] < arr[i+1])
				return arr[i+1];
			
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arrSize = sc.nextInt();
		
		int[] array = new int[arrSize];
		
		for(int i=0; i<arrSize; i++)
		{
			array[i] = sc.nextInt();
		}
		
		int secondSmallestNumber = getSecondSmallest(array);
		
		if(secondSmallestNumber >= 0)
			System.out.println("Second Smallest Number: " + secondSmallestNumber);
		else
			System.out.println("All Numbers are equal...");
		
		sc.close();
	}

}
