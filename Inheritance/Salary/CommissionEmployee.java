/*
Helen Li
March 18, 2019
*/

public class CommissionEmployee extends Employee
{
	private double grossSales;
	private double commissionRate;

	public CommissionEmployee(String first, String last, String ssn, double sales, double rate)
	{
		super(first, last, ssn);
		this.grossSales = sales;
		this.commissionRate = rate;
	}

	public double earnings()
	{
		return grossSales * commissionRate;
	}

	public String toString()
	{
		return "Commission Employee:" + super.toString() + "\ngross sales: " + grossSales +
			"; commission rate: " + commissionRate + 
			"\n Total earnings: " + earnings();
	}
}
