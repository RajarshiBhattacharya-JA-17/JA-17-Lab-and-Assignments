package oops.classExercise2;

public class Circle extends Shape{

	private double radius = 1.0;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	Circle()
	{
		
	}
	
	Circle(double radius)
	{
		this.radius = radius;
	}
	
	Circle(double radius, String color, boolean filled)
	{
		super(color, filled);
		this.radius = radius;
	}
	
	public double getArea()
	{
		return Math.PI*Math.pow(radius, 2);
	}
	
	public double getPerimeter()
	{
		return 2*Math.PI*radius;
	}
	
	public String toString()
	{
		return "Circle[Shape[color="+getColor()+", filled="+isFilled()+"], radius="+radius+"]";
	}
	
}
