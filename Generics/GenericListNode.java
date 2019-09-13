/*
Helen Li
April 29, 2019
*/

public class GenericListNode<T>
{
	private T data;
	private GenericListNode<T> link;

	public GenericListNode()
	{
		link = null;
		data = null;
	}

	public GenericListNode(T newData, GenericListNode<T> linkValue)
	{
		data = newData;
		link = linkValue;
	}

	public void setData(T newData)
	{
		data = newData;
	}

	public T getData()
	{
		return data;
	}

	public void setLink(GenericListNode<T> newLink)
	{
		link = newLink;
	}

	public GenericListNode<T> getLink()
	{
		return link;
	}
}
