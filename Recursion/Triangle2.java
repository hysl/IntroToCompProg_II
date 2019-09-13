/*
Helen Li
May 6, 2019
*/

public class Triangle2
{
	public static void main(String[] args)
	{
		triangle2(5);
	}

	public static void printRow(int n)
	{
		if(n < 1)
			return;

		System.out.print("*");
		printRow(n-1);
	}

	public static void triangle2(int n)
	{
		if(n < 1)
			return;

		printRow(n);

		System.out.println();

		triangle2(n-1);
	}
}
