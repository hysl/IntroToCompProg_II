/*
Helen Li
March 18, 2019
*/

public class BasePlusCommissionEmployee extends CommissionEmployee
{
	private double baseSalary;

	public BasePlusCommissionEmployee(String first, String last, String ssn, double sales, double rate, double salary)
	{
		super(first, last, ssn, sales, rate);
		this.baseSalary = salary;
	}

	public double earningsPlusBase()
	{
		return super.earnings() + baseSalary;
	}

	public String toString()
	{
		return "\nBase Plus " + super.toString() + "\nbase salary: " + baseSalary +
			"\n Total earnings plus base salary: " + earningsPlusBase();
	}
}
