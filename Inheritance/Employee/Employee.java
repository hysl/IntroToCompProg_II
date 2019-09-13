/*
Helen Li
March 4, 2019
*/

public class Employee
{
	private String name;
	private String employeeNumber;
	private String hireDate;

	public Employee()
	{
		name = "";
		employeeNumber = "";
		hireDate = "";
	}

	public Employee(String name, String employeeNumber, String hireDate)
	{
		this.name = name;
		this.employeeNumber = employeeNumber;
		this.hireDate = hireDate;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setEmployeeNumber(String employeeNumber)
	{
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeNumber()
	{
		return employeeNumber;
	}

	public void setHireDate(String hireDate)
	{
		this.hireDate = hireDate;
	}

	public String getHireDate()
	{
		return hireDate;
	}

	public String toString()
	{
		return "Name: " + getName() + "\nEmployee Number: " +
			getEmployeeNumber() + "\nHire Date: " + getHireDate();
	}
}
