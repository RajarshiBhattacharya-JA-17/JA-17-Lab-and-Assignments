import java.util.Scanner;

public class Question8 {
	
	public static boolean checkNumber(int n)
	{
		int res1 = 0, res2 = 0;
		
		if(n == 0)
			return false;
		res1 = (int)(Math.ceil(Math.log(n) / Math.log(2)));
		res2 = (int)(Math.floor(Math.log(n) / Math.log(2)));
		
		return res1 == res2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		boolean result = checkNumber(num);
		
		if(result)
			System.out.println("Power of 2");
		else
			System.out.println("Not a Power of 2");
		
		sc.close();
	}

}
