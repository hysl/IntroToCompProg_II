/*
Helen Li
March 11, 2019
*/

// has attributes of an Account object
// has an interest variable
// has a method which adds interest to the account
public class SavingsAccount extends Account
{
	private double interestRate;

	public SavingsAccount(int a)
	{
		super(a);
		interestRate = 0.0225;
	}

	public SavingsAccount(int a, double interestRate)
	{
		super(a);
		this.interestRate = interestRate;
	}

	public double getInterestRate()
	{
		return interestRate;
	}

	// add interest if there is money in account
	public void addInterest()
	{
		if(getBalance() > 0)
		{
			double interestToAdd = getBalance() * interestRate;
			deposit(interestToAdd);
		}
		else
		{
			System.out.println("Account.addInterest(...): "
				+ "cannot add interest to empty account.");
		}
	}

	// override withdraw method
	// ensure enough money is in account to withdraw
	public void withdraw(double sum)
	{
		if(getBalance() - sum >= 0)
		{
			super.withdraw(sum);
		}
		else
		{
			System.out.println("Account.withdraw(...): "
				+ "cannot have a balance less than 0.0.");
		}
	}

	public String toString()
	{
		return "Acc " + getAccountNumber() + ": balance = " +
			getBalance();
	}
}
