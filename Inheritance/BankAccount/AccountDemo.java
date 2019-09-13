/*
Helen Li
March 11, 2019
*/

public class AccountDemo
{
	public static void main(String [] args)
	{
		SavingsAccount savingsAcc = new SavingsAccount(101, 0.03);
		savingsAcc.addInterest();
		System.out.println(savingsAcc);
		savingsAcc.withdraw(10);
		System.out.println(savingsAcc);
		savingsAcc.deposit(10);
		System.out.println(savingsAcc);
		savingsAcc.withdraw(10);
		System.out.println(savingsAcc);
		savingsAcc.deposit(100);
		System.out.println(savingsAcc);
		savingsAcc.addInterest();
		System.out.println(savingsAcc);
		savingsAcc.addInterest();
		System.out.println(savingsAcc);
		savingsAcc.withdraw(30);
		System.out.println(savingsAcc);
		savingsAcc.withdraw(100);
		System.out.println(savingsAcc);
		savingsAcc.withdraw(-5);
		System.out.println(savingsAcc);
		savingsAcc.deposit(-10);
		System.out.println(savingsAcc);

		System.out.println();

		CheckingAccount checkingAcc = new CheckingAccount(111, 100.0);
		checkingAcc.deposit(30);
		System.out.println(checkingAcc);
		checkingAcc.deposit(-10);
		System.out.println(checkingAcc);
		checkingAcc.withdraw(20);
		System.out.println(checkingAcc);
		checkingAcc.withdraw(30);
		System.out.println(checkingAcc);
		checkingAcc.withdraw(150);
		System.out.println(checkingAcc);
		checkingAcc.withdraw(80);
		System.out.println(checkingAcc);
		checkingAcc.withdraw(10);
		System.out.println(checkingAcc);
		checkingAcc.deposit(10);
		System.out.println(checkingAcc);
		checkingAcc.withdraw(-5);
		System.out.println(checkingAcc);
	}
}
