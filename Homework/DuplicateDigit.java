import java.util.*;

public class DuplicateDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int num = sc.nextInt();
		int count[] = new int[10];
		int temp = num, rem = 0;
		while(temp != 0)
		{
			rem = temp % 10;
			count[rem]++;
			temp /= 10;
		}
		for(int i=0; i<10; i++)
		{
			if(count[i] > 1)
			{
				System.out.println(i);
			}
		}
	}

}
