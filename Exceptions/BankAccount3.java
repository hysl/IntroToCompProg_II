/*
Helen Li
April 1, 2019
*/

public class BankAccount3
{
	private double balance;

	public BankAccount3(double balance) throws NegativeStartingBalance
	{
		if(balance < 0)
		{
			throw new NegativeStartingBalance(balance);
		}
		else
		{
			this.balance = balance;
		}
	}

	public void deposit(double amount) throws NegativeDeposit
	{
		if(amount < 0)
		{
			throw new NegativeDeposit(amount);
		}
		else
		{
			balance += amount;
		}
	}

	public void withdraw(double amount) throws NegativeWithdraw, WithdrawExceedsBalance
	{
		if(amount < 0)
		{
			throw new NegativeWithdraw(amount);
		}
		else if((balance - amount) < 0)
		{
			throw new WithdrawExceedsBalance(amount);
		}
		else
		{
			balance -= amount;
		}
	}
}
