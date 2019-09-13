/*
Helen Li
May 6, 2019
*/

public class Triangle
{
	public static void main(String[] args)
	{
		triangle(5);
	}

	public static String triangle(int n)
	{
		if(n < 1)
			return "";

		String stars  = triangle(n-1);
		stars += "*";
		System.out.println(stars);

		return stars;
	}
}
