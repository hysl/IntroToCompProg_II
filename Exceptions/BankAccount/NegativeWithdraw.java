/*
Helen Li
April 1, 2019
*/

public class NegativeWithdraw extends Exception
{
	public NegativeWithdraw()
	{
		super("Error: Negative value passed to the withdraw method");
	}

	public NegativeWithdraw(double amount)
	{
		super("Error: Negative value passed to the withdraw method: " + amount);
	}
}
