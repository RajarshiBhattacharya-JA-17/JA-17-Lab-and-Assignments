import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
	static int arrSize = 0;
	
	public static String[] sortStrings(String[] arr)
	{
		int mid = 0;
		
		Arrays.sort(arr);
		if(arrSize % 2 == 0)
			mid = arrSize / 2;
		else
			mid = arrSize/2 + 1;
		
		for(int i=0; i<mid; i++)
		{
			arr[i] = arr[i].toUpperCase();
		}
		
		for(int i=mid; i<arrSize; i++)
		{
			arr[i] = arr[i].toLowerCase();
		}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		arrSize = sc.nextInt();
		
		String[] array = new String[arrSize];
		
		for(int i=0; i<arrSize; i++)
		{
			array[i] = sc.next().trim();
			array[i] = array[i].toLowerCase();
		}
		
		String[] sortArray = sortStrings(array);
		
		for(String value : sortArray)
		{
			System.out.println(value);
		}
		
		sc.close();
	}

}
