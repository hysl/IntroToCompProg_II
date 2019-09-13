/*
Helen Li
February 25, 2019
*/

public class Circle
{
	private double radius;
	private String color;

	public Circle()
	{
		radius = 1.0;
		color = "red";
	}

	public Circle(double radius)
	{
		this.radius = radius;
		color = "red";
	}

	public Circle(double radius, String color)
	{
		this.radius = radius;
		this.color = color;
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public double getArea()
	{
		return getRadius() * getRadius() * Math.PI;
	}

	public String toString()
	{
		return "Radius is " + getRadius() + " Color is " + getColor() +
			" Base area is " + getArea();
	}
}
