/*
Helen Li
February 4, 2019
*/

import java.util.ArrayList;

public class Library
{
	ArrayList<Book> books;

	public Library(ArrayList<Book> books)
	{
		this.books = books;
	}

	public ArrayList<Book> getTotalBooksInLibrary()
	{
		return books;
	}
}
