/*
Helen Li
March 18, 2019
*/

public class HourlyEmployee extends Employee
{
	private double hourlyWage;
	private double hours;

	public HourlyEmployee(String first, String last, String ssn, double wage, double hours)
	{
		super(first, last, ssn);
		this.hourlyWage = wage;
		this.hours = hours;
	}

	public double earnings()
	{
		if(hours <= 40)
		{
			return hourlyWage * hours;
		}
		else
		{
			return (hourlyWage * 40) + ((hours - 40) * (hourlyWage * 1.5));
		}
	}

	public String toString()
	{
		return "\nHourly Employee:" + super.toString() + "\nhourly wage: " + hourlyWage +
			"; hours worked: " + hours + "\n Total earnings: " +
			earnings() + "\n";
	}
}
