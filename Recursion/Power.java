/*
Helen Li
May 6, 2019
*/

public class Power
{
	public static void main(String[] args)
	{
		System.out.println(powerN(5, 3));
	}

	public static int powerN(int n, int p)
	{
		if(p == 0)
			return 1;
		else if(p == 1)
			return n;
		else
			return (n * powerN(n, p-1));
	}
}
