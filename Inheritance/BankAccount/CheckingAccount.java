/*
Helen Li
March 11, 2019
*/

// has attributes of an Account object
// has an overdraft limit variable
public class CheckingAccount extends Account
{
	private double overdraftLimit;

	public CheckingAccount(int a)
	{
		super(a);
		overdraftLimit = 100.0;
	}

	public CheckingAccount(int a, double overdraftLimit)
	{
		super(a);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit()
	{
		return overdraftLimit;
	}

	// override withdraw method
	// ensure withdrawal does not go below overdraft limit
	public void withdraw(double sum)
	{
		if(getBalance() - sum >= overdraftLimit * -1)
		{
			super.withdraw(sum);
		}
		else
		{
			System.out.println("Account.withdraw(...): "
					+ "cannot exceed overdraft limit.");
		}
	}

	public String toString()
	{
		return "Acc " + getAccountNumber() + ": balance = " +
			getBalance();
	}
}
