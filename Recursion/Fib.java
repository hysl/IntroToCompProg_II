/*
Helen Li
May 6, 2019
*/

// non-recursive Fib demo
public class Fib
{
	public static void main(String[] args)
	{
		for(int i = 0; i <= 10; i++)
			System.out.println(fib(i));
	}

	public static int fib(int n)
	{
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;

		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		else
		{
			for(int i = 2; i <= n; i++)
			{
				num3 = num1 + num2;
				num1 = num2;
				num2 = num3;
			}
		}

		return num3;
	}
}
