/*
Helen Li
May 6, 2019
*/

public class Bunny2
{
	public static void main(String[] args)
	{
		for(int i = 0; i <= 10; i++)
			System.out.println(bunnyEars2(i));
	}

	public static int bunnyEars2(int n)
	{
		if(n == 0)
			return 0;
		else if(n == 1)
			return 2;
		else
		{
			if(n%2 == 0)
				return (3 + bunnyEars2(n-1));
			else
				return (2 + bunnyEars2(n-1));
		}
	}
}
