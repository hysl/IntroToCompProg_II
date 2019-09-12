/*
Helen Li
February 25, 2019
*/

public class LatinSquare
{
	public static void main(String [] args)
	{
		int [][] arr2D = {{10, 30, 20, 0},
						  {0, 20, 30, 10},
						  {30, 0, 10, 20},
						  {20, 10, 0, 30}
						 };

		printArray2D(arr2D);

		if(isLatin(arr2D))
			System.out.println("Yes, 2D array is a Latin Square");
		else
			System.out.println("NO, 2D array is NOT a Latin Square");
	}

	public static void printArray2D(int[][] arr)
	{
		for(int i = 0; i < arr.length; i ++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean isLatin(int[][] arr)
	{
		// checking for duplicates in each row
		for(int n = 0; n < arr.length; n++)
		{
			for(int i = 0; i < arr.length - 1; i++)
			{
				for(int j = i + 1; j < arr.length; j++)
				{
					if(arr[n][i] == arr[n][j])
					{
						System.out.println("Row " + n + " has duplicates");
						return false;
					}
				}
			}
		}
		
		/*
		// checking for duplicates in each column 
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 1; j < arr.length; j++)
			{
				if(arr[0][i] == arr[j][i])
				{
					System.out.println("Column " + i + " has duplicates");
					return false;
				}
			}
		}
		*/

		// create new array with elements of first row
		int[] firstRow = new int[arr[0].length];

		for(int i = 0; i < firstRow.length; i++)
		{
			firstRow[i] = arr[0][i];
		}

		// create new array with each column and check if all elements of first row exists
		for(int i = 0; i < arr.length; i++)
		{
			int[] newArray = new int[firstRow.length];

			for(int j = 0; j < arr.length; j++)
			{
				newArray[j] = arr[j][i];
			}

			boolean match = checkMatch(firstRow, newArray);

			if(!match)
			{
				System.out.println("Column " + i + " does not have all row 0 elements");
				return false;
			}
		}

		// create new array with each row and check if all elements of first row exists
		for(int i = 1; i < arr.length; i++)
		{
			int[] newArray = new int[firstRow.length];

			for(int j = 0; j < arr.length; j++)
			{
				newArray[j] = arr[i][j];
			}

			boolean match = checkMatch(firstRow, newArray);

			if(!match)
			{
				System.out.println("Row " + i + " does not have all row 0 elements");
				return false;
			}
		}

		// if all tests passed, then arr is a Latin Square
		return true;
	}

	// method to check if new array has all elements of first row
	public static boolean checkMatch(int[] firstRow, int[] newArray)
	{
		boolean matches = true;

		for(int i = 0; i < firstRow.length; i++)
		{
			for(int j = 0; j < firstRow.length; j++)
			{
				if(firstRow[i] == newArray[j])
				{
					matches = true;
					break;
				}
				else
					matches = false;
			}

			// if one element in first row does not exist, return false
			if(matches == false)
				return false;
		}

		return true;
	}
}
