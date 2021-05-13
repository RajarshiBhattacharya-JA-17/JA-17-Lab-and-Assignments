import java.util.*;

public class Question3 {
	static int arrSize = 0;
	
	public static String[] getSorted(int[] arr)
	{
		String[] reversedArray = new String[arrSize];
		
		for(int i=0; i<arrSize; i++)
		{
			char temp;
			String val = Integer.toString(arr[i]);
			char[] charArr = val.toCharArray();
			//char[] reverseChar = new char[charArr.length];
			for(int j=0; j<charArr.length/2; j++)
			{
				//reverseChar[k++] = charArr[j];
				temp = charArr[charArr.length-j-1];
				charArr[charArr.length-j-1] = charArr[j];
				charArr[j] = temp;
			}
			reversedArray[i] = String.valueOf(charArr);
		}
		
		Arrays.sort(reversedArray);
		
		return reversedArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		arrSize = sc.nextInt();
		
		int[] array = new int[arrSize];
		
		for(int i=0; i<arrSize; i++)
		{
			array[i] = sc.nextInt();
		}
		
		String[] sortedArray = getSorted(array);
		
		for(String val : sortedArray)
		{
			System.out.println(val);
		}
		
		sc.close();
	}

}
