/*
Helen Li
April 1, 2019
*/

public class NegativeDeposit extends Exception
{
	public NegativeDeposit()
	{
		super("Error: Negative value passed to the deposit method");
	}

	public NegativeDeposit(double amount)
	{
		super("Error: Negative value passed to the deposit method: " + amount);
	}
}
