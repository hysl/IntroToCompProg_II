/*
Helen Li
April 29, 2019
*/

public class GenericStack<T>
{
	private GenericLinkedList<T> theList;
	private int itsSize;

	public GenericStack()
	{
		theList = new GenericLinkedList<T>();
		itsSize = 0;
	}

	public void push(T item)
	{
		theList.addANodeToStart(item);
		itsSize++;
		System.out.println("push(" + item + ")");
	}

	public void pop()
	{
		itsSize--;
		theList.deleteHeadNode();
		System.out.println("pop()");
	}

	public boolean isEmpty()
	{
		return (theList.length() == 0);
	}

	public void displayStack()
	{
		System.out.println("Stack (top-->bottom):");
		theList.showList();
	}
}
