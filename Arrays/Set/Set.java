/*
Helen Li
February 11, 2019
*/

import java.util.Scanner;

public class Set
{
	// an array of integers that comprise the set
	int [] setArray;

	// number of elements in set
	int numElements;

	// default value used to allocate memory
	final int DEFAULT_SIZE = 5;

	// default constructor creating set array with DEFAULT_SIZE
	public Set()
	{
		setArray = new int [DEFAULT_SIZE];
		numElements = 0;
	}

	// constructor initializing set array with array of ints passed
	public Set(int [] arr)
	{
		setArray = new int [arr.length];
		numElements = 0;

		for(int i = 0; i < arr.length; i++)
		{
			addElement(arr[i]);
		}
	}

	// copy constructor initializing object from existing object
	public Set(Set another)
	{
		setArray = another.setArray;
		numElements = another.numElements;
	}

	// determines if passed int is an element of set
	public boolean isElement(int n)
	{
		boolean isPresent = false;
		for(int i = 0; i < numElements; i++)
		{
			if(n == setArray[i])
				isPresent = true;
		}
		return isPresent;
	}

	// prints the elements of the set
	public void displaySet()
	{
		System.out.print("{ ");

		for(int i = 0; i < numElements - 1; i++)
		{
			System.out.print(setArray[i] + ", ");
		}

		System.out.println(setArray[numElements - 1] + " }");
	}

	// returns length of set
	public int getLength()
	{
		return numElements;
	}

	// get user input and add to set
	public void populate()
	{
		Scanner input = new Scanner(System.in);

		System.out.println("\nEnter positive numbers to add to the Set");
		System.out.println("Enter \"-1\" to end:");
		int num = input.nextInt();

		while(num >= 0)
		{
			addElement(num);
			num = input.nextInt();
		}
	}

	// check if isElement(n) == false
	// check if there is space in setArray; if not, expand setArray
	// add element to set
	public void addElement(int n)
	{
		if(isElement(n))
			return;

		if(numElements == setArray.length)
		{
			int [] newArray = new int [setArray.length + DEFAULT_SIZE];

			for(int i = 0; i < setArray.length; i++)
			{
				newArray[i] = setArray[i];
			}

			setArray = newArray;
		}

		setArray[numElements] = n;
		numElements++;
	}

	// removes an element from set if it exists
	public void remove(int n)
	{
		for(int i = 0; i < numElements; i++)
		{
			if(n == setArray[i])
			{
				for(int j = i; j < numElements - 1; j++)
				{
					setArray[j] = setArray[j + 1];
				}
				numElements--;
				return;
			}
		}
	}

	// creates new set representing the union of two sets
	public Set union(Set another)
	{
		Set newSet = new Set();

		for(int i = 0; i < numElements; i++)
			newSet.addElement(setArray[i]);

		for(int i = 0; i < another.getLength(); i++)
			newSet.addElement(another.setArray[i]);

		return newSet;
	}

	// creates new set representing the intersection of two sets
	public Set intersection(Set another)
	{
		Set newSet = new Set();

		for(int i = 0; i < setArray.length; i++)
		{
			if(another.isElement(setArray[i]))
				newSet.addElement(setArray[i]);
		}

		return newSet;
	}

	// creates new set representing the difference of two sets
	public Set difference(Set another)
	{
		// Set newSet = new Set(numElements); -> from professor
		Set newSet = new Set();

		for(int i = 0; i < numElements; i++)
		{
			if(!another.isElement(setArray[i]))
				newSet.addElement(setArray[i]);
		}

		return newSet;
	}

	// determines if two sets have the same elements
	public boolean equals(Set another)
	{
		for(int i = 0; i < another.getLength(); i++)
		{
			if(!isElement(another.setArray[i]))
				return false;
		}

		return true;
	}

}
