/*
Helen Li
April 1, 2019
*/

public class WithdrawExceedsBalance extends Exception
{
	public WithdrawExceedsBalance()
	{
		super("Error: Negative balance resulted to the withdraw method");
	}

	public WithdrawExceedsBalance(double amount)
	{
		super("Error: Negative balance resulted to the withdraw method: " + amount);
	}
}
