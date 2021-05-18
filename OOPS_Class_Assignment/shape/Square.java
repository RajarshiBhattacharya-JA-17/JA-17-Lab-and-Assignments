package oops.classExercise2;

public class Square extends Rectangle{

	private double side = 1.0;
	String str = "";

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public void setWidth(double side) {
		this.width = side;
	}
	
	public void setLength(double side) {
		this.length = side;
	}
	
	Square()
	{
		Shape s = new Shape();
		str = s.toString();
	}
	
	Square(double side)
	{
		Shape s = new Shape();
		this.side = side;
		this.width = side;
		this.length = side;
		str = s.toString();
	}
	
	Square(double side, String color, boolean filled)
	{
		Shape s = new Shape(color, filled);
		this.side = side;
		this.width = side;
		this.length = side;
		str = s.toString();
	}
	
	public String toString()
	{
		return "Square[Rectangle["+str+", width="+width+", length="+length+"]]";
	}
}
