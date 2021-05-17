import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your values:");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int sum = 0;
		while(st.hasMoreTokens())
		{
			int value = Integer.parseInt(st.nextToken());
			System.out.println(value);
			sum += value;
		}
		System.out.println("Sum of Integers: " + sum);
		
		sc.close();
	}

}
