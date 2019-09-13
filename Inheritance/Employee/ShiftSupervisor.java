/*
Helen Li
March 4, 2019
*/

public class ShiftSupervisor extends Employee
{
	private double salary;
	private double bonus;

	public ShiftSupervisor()
	{
		super();
		salary = 0.00;
		bonus = 0.00;
	}

	public ShiftSupervisor(String name, String employeeNumber, String hireDate, double salary, double bonus)
	{
		super(name, employeeNumber, hireDate);
		this.salary = salary;
		this.bonus = bonus;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public String getSalary()
	{
		return String.format("%.2f", salary);
	}

	public void setBonus(double bonus)
	{
		this.bonus = bonus;
	}

	public String getBonus()
	{
		return String.format("%.2f", bonus);
	}

	public String toString()
	{
		return super.toString() + "\nAnnual Salary: $" + getSalary() + 
			"\nProduction Bonus: $" + getBonus();
	}
}
