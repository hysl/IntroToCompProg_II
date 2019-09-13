/*
Helen Li
March 18, 2019
*/

public class Circle extends Shape
{
	private int radius;

	public Circle(String color, int radius)
	{
		super(color);
		this.radius = radius;
	}

	public double getArea()
	{
		return Math.PI * radius * radius;
	}

	public String toString()
	{
		return "Circle Shape of " + super.toString();
	}
}
