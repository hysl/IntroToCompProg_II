/*
Helen Li
March 18, 2019
*/

public class Triangle extends Shape
{
	private int base;
	private int height;

	public Triangle(String color, int base, int height)
	{
		super(color);
		this.base = base;
		this.height = height;
	}

	public double getArea()
	{
		return 0.5 * base * height;
	}

	public String toString()
	{
		return "Triangle Shape of " + super.toString();
	}
}
