
public class HappyNumbers {

	public static int Calc(int num)
	{
		int rem = 0, sum = 0;
		
		while(num > 0)
		{
			rem = num%10;
			sum += (rem*rem);
			num /= 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count= 0, i = 1;
		
		while(i>0)
		{
			int result = i;
			while(result != 1 && result != 4)
			{
				result = Calc(result);
			}
			if(result == 1)
			{
				System.out.println(i + " is a Happy Number");
				count++;
			}
			i++;
			if(count == 10)
				break;
		}
	}

}
