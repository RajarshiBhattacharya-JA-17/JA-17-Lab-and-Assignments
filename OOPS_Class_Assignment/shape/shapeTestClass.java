package oops.classExercise2;

import java.util.Scanner;

public class shapeTestClass {
	
	public static void calcCircle()
	{
		Scanner sc = new Scanner(System.in);
		boolean filled;
		
		System.out.println("Enter radius:");
		double radius = sc.nextDouble();
		
		System.out.println("Enter color:");
		String color = sc.next();
		
		System.out.println("Is it filled(y/n):");
		if(sc.next().charAt(0) == 'y')
			filled = true;
		else
			filled = false;
		
		Circle c1 = new Circle(radius, color, filled);
		
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.toString());
		
		sc.close();
	}
	
	public static void calcRect()
	{
		Scanner sc = new Scanner(System.in);
		boolean filled;
		
		System.out.println("Enter width:");
		double width = sc.nextDouble();
		
		System.out.println("Enter length:");
		double length = sc.nextDouble();
		
		System.out.println("Enter color:");
		String color = sc.next();
		
		System.out.println("Is it filled(y/n):");
		if(sc.next().charAt(0) == 'y')
			filled = true;
		else
			filled = false;
		
		Rectangle r1 = new Rectangle(width, length, color, filled);
		
		System.out.println(r1.getArea());
		System.out.println(r1.getPerimeter());
		System.out.println(r1.toString());
		
		sc.close();
	}
	
	public static void calcSquare()
	{
		Scanner sc = new Scanner(System.in);
		boolean filled;
		
		System.out.println("Enter side:");
		double side = sc.nextDouble();
		
		System.out.println("Enter color:");
		String color = sc.next();
		
		System.out.println("Is it filled(y/n):");
		if(sc.next().charAt(0) == 'y')
			filled = true;
		else
			filled = false;
		
		Square sq1 = new Square(side, color, filled);
		
		System.out.println(sq1.getArea());
		System.out.println(sq1.getPerimeter());
		System.out.println(sq1.toString());
		
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Shape s1 = new Shape("blue", false);
		Circle c1 = new Circle(5.0, "blue", false);
		Rectangle r1 = new Rectangle(2.0, 4.0, "blue", false);
		Square sq1 = new Square(5.0, "blue", false);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getPerimeter());
		System.out.println(sq1.toString());*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter you choice:");
		System.out.println("1) Circle\n2) Rectangle\n3)Square");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:calcCircle();
		break;
		case 2:calcRect();
		break;
		case 3:calcSquare();
		break;
		default:System.out.println("Invalid choice!!!");
		break;
		}
		
		sc.close();
	}

}
