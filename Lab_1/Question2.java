import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("Enter Choice:\n");
			System.out.println("R - Red Light:\n");
			System.out.println("Y - Yellow Light:\n");
			System.out.println("B - Blue Light:\n");
			System.out.println("E - Exit:\n");
			char ch = sc.next().charAt(0);
			
			switch(ch)
			{
			case 'R':
				System.out.println("stop");
				break;
			case 'Y':
				System.out.println("ready");
				break;
			case 'B':
				System.out.println("go");
				break;
			case 'E':
				System.exit(0);
			default:
				System.out.println("Incorrect Option!!");
				break;
			}
			
			sc.close();
		}
	}

}
