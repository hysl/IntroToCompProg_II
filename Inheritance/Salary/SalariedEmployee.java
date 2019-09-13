/*
Helen Li
March 18, 2019
*/

public class SalariedEmployee extends Employee
{
	private double weeklySalary;

	public SalariedEmployee(String first, String last, String ssn, double salary)
	{
		super(first, last, ssn);
		this.weeklySalary = salary;
	}

	public double earnings()
	{
		return weeklySalary;
	}

	public String toString()
	{
		return "Salaried Employee:" + super.toString() + "\nweekly salary: " + weeklySalary;
	}
}
