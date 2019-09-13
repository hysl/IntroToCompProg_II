/*
Helen Li
May 6, 2019
*/

public class SumDigits
{
	public static void main(String[] args)
	{
		System.out.println(sumDigits(158));
	}

	public static int sumDigits(int n)
	{
		if(n == 0)
			return 0;
		else
			return ((n%10) + sumDigits(n/10));
	}
}
