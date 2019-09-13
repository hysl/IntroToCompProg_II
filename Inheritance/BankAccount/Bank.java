/*
Helen Li
March 11, 2019
*/

public class Bank
{
	private Account [] accountArray;
	private int arr;
	private int index;
	private int accountNum;

	public Bank(int arr)
	{
		this.arr = arr;
		accountArray = new Account[arr];
		index = 0;
		accountNum = 101;
	}

	public void openCheckingAccount(double bal, double creditLimit)
	{
		if(index >= accountArray.length)
		{
			System.out.println("New account cannot be opened - Bank is full");
			return;
		}
		else
		{
			accountArray[index] =  new CheckingAccount(accountNum, creditLimit);
			accountArray[index].deposit(bal);

			index++;
			accountNum++;
		}
	}

	public void openSavingsAccount(double bal, double interestRate)
	{
		if(index >= accountArray.length)
		{
			System.out.println("New account cannot be opened - Bank is full");
			return;
		}
		else
		{
			accountArray[index] = new SavingsAccount(accountNum, interestRate);
			accountArray[index].deposit(bal);

			index++;
			accountNum++;
		}
	}

	public void printAccounts()
	{
		System.out.println("Current bank accounts:");
		for(int i = 0; i < accountArray.length; i++)
		{
			System.out.println(accountArray[i]);
		}
	}

	public void deposit(int accNum, double amount)
	{
		for(int i = 0; i < accountArray.length; i++)
		{
			if(accountArray[i].getAccountNumber() == accNum)
			{
				accountArray[i].deposit(amount);
				return;
			}
		}

		System.out.println("Account does not exist");
	}

	public void withdraw(int accNum, double amount)
	{
		for(int i = 0; i < accountArray.length; i++)
		{
			if(accountArray[i].getAccountNumber() == accNum)
			{
				accountArray[i].withdraw(amount);
				return;
			}
		}

		System.out.println("Account does not exist");
	}

	public void addInterest(int accNum)
	{
		for(int i = 0; i < accountArray.length; i++)
		{
			if(accountArray[i].getAccountNumber() == accNum)
			{
				if(accountArray[i] instanceof SavingsAccount)
					accountArray[i].addInterest();
				else
					System.out.println("Checking accounts do not qualify for interest");
				return;
			}
		}

		System.out.println("Account does not exist");
	}
}
