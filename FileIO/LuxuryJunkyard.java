/*
Helen Li
April 15, 2019
*/

import java.io.*;
import java.util.Scanner;

public class LuxuryJunkyard
{
	public static int[] arr = new int[4];

	public static void main(String [] args) throws IOException
	{
		Scanner input = new Scanner(System.in);
		int numOfSalesperson = 0;

		boolean fileOpened = false;

		while(!fileOpened)
		{
			System.out.print("Enter the filename: ");
			String filename = input.next();

			try
			{
				File file = new File(filename);
				Scanner inputFile = new Scanner(file);

				printHeading();

				while(inputFile.hasNext())
				{
					int salespersonId = inputFile.nextInt();
					numOfSalesperson++;
					int carTypesSold = inputFile.nextInt();
					evaluateSalesperson(inputFile, salespersonId, carTypesSold);
				}

				printEnding(numOfSalesperson);

				fileOpened = true;

				inputFile.close();
			}

			catch(IOException e)
			{
				System.out.println("File " + filename + " does not exist\n");
			}
		}
	}
	
	public static void printHeading()
	{
		System.out.println("\nWelcome to Luxury Junkyard, Inc. the end of month report");
		System.out.println("--------------------------------------------------------");
		System.out.println("CURRENT SELLING PRICES");
		System.out.println("----------------------");

		for(int i = 1; i <= 4; i++)
		{
			String carName = carCodeName(i);
			double carPrice = carCodePrice(i);
			System.out.printf("%-8s", carName);
			System.out.printf("%8.2f %n", carPrice);
		}

		System.out.println("------------------------------------------------------");
		System.out.printf("%-12s %8s %10s %18s %n", "SALESPERSON", "MODEL", "COUNT", "TOTAL SOLD $");
		System.out.printf("%6s %17s %6s %20s %n", "ID", "DESCRIPTION", "SOLD", "PER MODEL");
		System.out.println("------------------------------------------------------");
	}

	public static String carCodeName(int carCode)
	{
		String[] carNames = {"AUDI", "BMW", "JAGUAR", "LEXUS"};

		return carNames[carCode - 1];
	}

	public static double carCodePrice(int carCode)
	{
		double[] carPrices = {8876.50, 9909.89, 10999.99, 7776.69};

		return carPrices[carCode - 1];
	}

	public static void evaluateSalesperson(Scanner inputFile, int salespersonId, int carTypesSold)
	{
		System.out.printf("%-2s %-1s %-8s", "", salespersonId, "");

		int count = 0;
		double salespersonTotal = 0.0;

		for(int i = 0; i < carTypesSold; i++)
		{
			int modelCode = inputFile.nextInt();
			int countSold = inputFile.nextInt();
			count += countSold;

			unitsSold(modelCode, countSold);

			String name = carCodeName(modelCode);

			double price = countSold * carCodePrice(modelCode);
			salespersonTotal += price;

			if(i == 0)
				System.out.printf("%-10s %2d %22.2f %n", name, countSold, price);
			else
				System.out.printf("%-15s %-10s %2d %22.2f %n", "", name, countSold, price);
		}

		System.out.printf("%52s %n", "----------------------------");
		System.out.printf("%29d %22.2f %n %n", count, salespersonTotal);
	}

	public static void unitsSold(int modelCode, int countSold)
	{
		int index = modelCode - 1;
		arr[index] += countSold;
	}

	public static void printEnding(int numOfSalesperson)
	{
		double totalSales = 0;

		for(int i = 1; i <= 4; i++)
		{
			System.out.printf("%s %-6s %s %n", "OVERALL", carCodeName(i), "UNITS SOLD:");
			System.out.println(arr[i-1]);
			totalSales += arr[i-1] * carCodePrice(i);
		}

		System.out.println("\nNUMBER SALESPERSONS: " + numOfSalesperson);
		System.out.printf("%-30s %-2s %12.2f %n", "OVERALL SOLD:", "$", totalSales);
		System.out.printf("%-30s %-2s %12.2f %n", "AVERAGE SOLD per SALESPERSON:", "$", totalSales/numOfSalesperson);
	}
}
