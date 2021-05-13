
public class AbDefPerfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 1;
		
		for(int i=2; i<=10000; i++)
		{
			sum = 1;
			for(int j=2; j<i; j++)
			{
				if(i % j == 0)
					sum += j;
			}
			if(sum == i)
				System.out.println(i+" is a Perfect Number");
			if(sum > i)
				System.out.println(i + " is an Abundant Number.");
			if(sum < i)
				System.out.println(i + " is a Deficient Number.");
		}
	}

}
