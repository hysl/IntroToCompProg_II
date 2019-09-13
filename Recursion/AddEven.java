/*
Helen Li
May 6, 2019
*/

public class AddEven
{
	public static void main(String[] args)
	{
		System.out.println(addEvenTo(8));
	}

	public static int addEvenTo(int n)
	{
		if(n % 2 != 0)
			n = n-1;
		if(n == 0 || n == 1)
			return 0;
		if(n == 2)
			return 2;
		else
			return (n + addEvenTo(n-2));
	}
}
