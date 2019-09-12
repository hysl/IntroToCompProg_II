/*
Helen Li
February 11, 2019
*/

public class DiverseArray
{
	public static void main(String[] args)
	{
		int[][] mat1 = {
			{1, 3, 2, 7, 3},
			{10, 10, 4, 6, 2},
			{5, 3, 5, 9, 6},
			{7, 6, 4, 2, 1},
		};
		int[][] mat2 = {
			{1, 1, 5, 3, 4},
			{12, 7, 6, 1, 9},
			{8, 11, 10, 2, 5},
			{3, 2, 3, 0, 6},
		};

		displayMatrix(mat1);

		System.out.println("isDiverse(mat1) = " + isDiverse(mat1));
		System.out.println();

		displayMatrix(mat2);

		System.out.println("isDiverse(mat2) = " + isDiverse(mat2));
	}

	// calculates sum of array
	public static int arraySum(int[] arr)
	{
		int sum = 0;

		for(int i = 0; i < arr.length; i++)
			sum += arr[i];

		return sum;
	}

	// creates new array with sum of each row of 2D array
	public static int[] rowSums(int[][] arr2D)
	{
		int[] sumRows = new int[arr2D.length];

		int rowSum;

		for(int i = 0; i < arr2D.length; i++)
		{
			rowSum = arraySum(arr2D[i]);
			sumRows[i] = rowSum;
		}

		return sumRows;
	}

	// determines if 2D array is diverse
	public static boolean isDiverse(int[][] arr2D)
	{
		int[] sums = rowSums(arr2D);

		for(int i = 0; i < sums.length; i++)
		{
			for(int j = i + 1; j < sums.length; j++)
			{
				if(sums[i] == sums[j])
					return false;
			}
		}
		return true;
	}

	// print matrix with row sums
	public static void displayMatrix(int[][] arr2D)
	{
		for(int i = 0; i < arr2D.length; i++)
		{
			for(int j = 0; j < arr2D[i].length; j++)
			{
				System.out.print(arr2D[i][j] + "\t");
			}
			System.out.println(arraySum(arr2D[i]));
		}
	}
}
