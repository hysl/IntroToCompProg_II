/*
Helen Li (1260857)
April 1, 2019
*/

public class NegativeStartingBalance extends Exception
{
	public NegativeStartingBalance()
	{
		super("Error: Negative starting balance");
	}

	public NegativeStartingBalance(double amount)
	{
		super("Error: Negative starting balance: " + amount);
	}
}
