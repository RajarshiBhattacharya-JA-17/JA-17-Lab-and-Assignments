package oops.classExercise1;

import java.util.Scanner;

public class testClass {
	
	public static void studentDetails()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name of student:");
		String name = sc.next();
		
		System.out.println("Enter Address of the student:");
		String address = sc.next();
		
		System.out.println("Enter program of student:");
		String program = sc.next();
		
		System.out.println("Enter year of student:");
		int year = sc.nextInt();
		
		System.out.println("Enter fees of student:");
		double fee = sc.nextDouble();
		
		Student s1 = new Student(name, address, program,
				year, fee);
		
		System.out.println(s1.toString());
		
		sc.close();
	}
	
	public static void staffDetails()
	{
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name of staff:");
		String name = sc.next();
		
		System.out.println("Enter Address of the staff:");
		String address = sc.next();
		
		System.out.println("Enter School of staff:");
		String school = sc.next();
		
		System.out.println("Enter pay of staff:");
		double pay = sc.nextDouble();
		
		Staff s2 = new Staff(name, address, school, pay);
		
		System.out.println(s2.toString());
		
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose an option:");
		System.out.println("1) Student Details\n2) Staff Details");
		int choice = sc.nextInt();
		if(choice == 1)
			studentDetails();
		else if(choice == 2)
			staffDetails();
		
		sc.close();
	}

}
