/*
Helen Li
March 4, 2019
*/

public class ProductionWorker extends Employee
{
	private int shift;
	private double payRate;

	public static final int DAY_SHIFT = 1;
	public static final int NIGHT_SHIFT = 2;

	public ProductionWorker()
	{
		super();
		shift = 0;
		payRate = 0.00;
	}

	public ProductionWorker(String name, String employeeNumber, String hireDate, int shift, double payRate)
	{
		super(name, employeeNumber, hireDate);
		this.shift = shift;
		this.payRate = payRate;
	}

	public void setShift(int shift)
	{
		this.shift = shift;
	}

	public String getShift()
	{
		if(shift == 1)
			return "Day";
		else
			return "Night";
	}

	public void setPayRate(double payRate)
	{
		this.payRate = payRate;
	}

	public String getPayRate()
	{
		return String.format("%.2f", payRate);
	}

	public String toString()
	{
		return super.toString() + "\nShift: " + getShift() + 
			"\nHourly Pay Rate: $" + getPayRate();
	}
}
