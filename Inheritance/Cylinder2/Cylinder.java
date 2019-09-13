/*
Helen Li
March 4, 2019
*/

public class Cylinder extends Circle
{
	private double height;

	public Cylinder()
	{
		super();
		height = 1.0;
	}

	public Cylinder(double height)
	{
		super();
		this.height = height;
	}

	public Cylinder(double height, double radius)
	{
		super(radius);
		this.height = height;
	}

	public Cylinder(double height, double radius, String color)
	{
		super(radius, color);
		this.height = height;
	}

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	public double getVolume()
	{
		return getArea() * getHeight();
	}

	public double getSurfaceArea()
	{
		return super.getSurfaceArea() * getHeight() + 2 * getArea();
	}

	public String toString()
	{
		return "This is a Cylinder:\ncolor = " + getColor() + "\nradius = " +
			getRadius() + "\nheight = " + getHeight() + "\nbase area = " +
			getArea() + "\nsurface area = " + getSurfaceArea() + "\nvolume = " +
			getVolume() + "\n";
	}
}
