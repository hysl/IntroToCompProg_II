/*
Helen Li
May 6, 2019
*/

public class Bunny
{
	public static void main(String[] args)
	{
		System.out.println(bunnyEars(10));
	}

	public static int bunnyEars(int n)
	{
		if(n == 0)
			return 0;
		else if(n == 1)
			return 2;
		else
			return (2 + bunnyEars(n-1));
	}
}
