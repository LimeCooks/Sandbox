/*
Assignment 2
CSCI 2110
Due October 23rd 2019
Liam Cook, B00711028
 */
public class Node<T>
{
	private T data;
	private Node<T> next;
	public Node(T data, Node<T> next)
	{
		this.data = data;
		this.next = next;
	}
	public T getData()
	{
		return data;
	}
	public Node<T> getNext()
	{
		return this.next;
	}
	public void setData(T data)
	{
		this.data = data;
	}
	public void setNext(Node<T> next)
	{
		this.next = next;
	}
	
}
