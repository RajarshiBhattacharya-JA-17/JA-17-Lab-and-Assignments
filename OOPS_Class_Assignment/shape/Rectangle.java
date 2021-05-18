package oops.classExercise2;

public class Rectangle extends Shape{

	protected double width = 1.0;
	protected double length = 1.0;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	Rectangle()
	{
		
	}
	
	Rectangle(double width, double length)
	{
		this.width = width;
		this.length = length;
	}
	
	Rectangle(double width, double length, String color, boolean filled)
	{
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	
	public double getArea()
	{
		return width*length;
	}
	
	public double getPerimeter()
	{
		return 2*(width+length);
	}
	
	public String toString()
	{
		return "Rectangle[Shape[color="+getColor()+", filled="+isFilled()+
				"], width="+width+", length="+length+"]";
	}
}
