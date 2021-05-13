
public class LucasNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 2, num2 = 1, num3 = 0;
		System.out.print(num1 + " " + num2);
		for(int i = 2; i < 10; i++)
		{
			num3 = num2;
			num2 += num1;
			num1 = num3;
			System.out.print(" " + num2);
		}
	}
}
