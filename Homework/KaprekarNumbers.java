
public class KaprekarNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<1000; i++)
		{
			if(i == 1)
				System.out.println(i + " is a Kaprekar Number");
			else
			{
				int sq = i*i, digitCount = 0;
				while(sq != 0)
				{
					digitCount++;
					sq /= 10;
				}
				sq = i*i;
				for(int j = 1; j<digitCount; j++)
				{
					int equalParts = (int)Math.pow(10, j);
					if(equalParts == i)
						continue;
					int sum = sq/equalParts + sq%equalParts;
					if(sum == i)
						System.out.println(i + " is a Kaprekar Number");
				}
			}
		}
	}

}
