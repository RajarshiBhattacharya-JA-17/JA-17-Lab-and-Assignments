import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num == 0 || num == 1)
			System.out.print("No Prime Numbers in this range.");
		
		if(num >= 2)
			System.out.print("2");
		
		for(int i=3; i <= num; i += 2)
		{
			if(num % i != 0)
				System.out.print(" " + i);
			if(num == i)
				System.out.print(" " + i);
		}
		
		sc.close();
	}

}
