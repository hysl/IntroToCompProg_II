/*
Helen Li
March 18, 2019
*/

public class Rectangle extends Shape
{
	private int length;
	private int width;

	public Rectangle(String color, int length, int width)
	{
		super(color);
		this.length = length;
		this.width = width;
	}

	public double getArea()
	{
		return length * width;
	}

	public String toString()
	{
		return "Rectangle Shape of " + super.toString();
	}
}
