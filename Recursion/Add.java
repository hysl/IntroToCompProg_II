/*
Helen Li
May 6, 2019
*/

public class Add
{
	public static void main(String[] args)
	{
		System.out.println(addTo(4));
	}

	public static int addTo(int n)
	{
		if(n == 1)
			return 1;
		else
			return (n + addTo(n-1));
	}
}
