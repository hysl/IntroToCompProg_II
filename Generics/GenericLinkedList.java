/*
Helen Li
April 29, 2019
*/

public class GenericLinkedList<T>
{
	private GenericListNode<T> head;

	public GenericLinkedList()
	{
		head = null;
	}

	public void showList()
	{
		GenericListNode<T> position = head;

		while(position != null)
		{
			System.out.println(position.getData());
			position = position.getLink();
		}
	}

	public int length()
	{
		int count = 0;
		GenericListNode<T> position = head;

		while(position != null)
		{
			count++;
			position = position.getLink();
		}

		return count;
	}

	public void addANodeToStart(T item)
	{
		head = new GenericListNode<T>(item, head);
	}

	public void deleteHeadNode()
	{
		if(head != null)
		{
			head = head.getLink();
		}
		else
		{
			System.out.println("Deleting from an empty list.");
			System.exit(0);
		}
	}

	public boolean onList(T item)
	{
		return find(item) != null;
	}

	private GenericListNode<T> find(T item)
	{
		boolean found = false;
		GenericListNode<T> position = head;

		while((position != null) && !found)
		{
			T dataAtPosition = position.getData();

			if(dataAtPosition.equals(item))
				found = true;
			else
				position = position.getLink();
		}

		return position;
	}
}
