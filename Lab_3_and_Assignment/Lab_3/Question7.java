import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Question7 {
	
	public static void dateDifference(LocalDate newDate)
	{
		LocalDate currDate = LocalDate.now();
		Period p = Period.between(newDate, currDate);
		
		System.out.println("Difference in Years: " + p.getYears());
		System.out.println("Difference in Months: " + p.getMonths());
		System.out.println("Difference in Days: " + p.getDays());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Date(Format: dd/MM/yyyy):");
		String str = sc.nextLine();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");		
		LocalDate userDate = LocalDate.parse(str, dtf);
		
		dateDifference(userDate);
		
		sc.close();
	}

}
