package singleLinkedList;

public class Node {

	int data;
	Node next;
	
	public Node()
	{
		next = null;
		data = 0;
	}
	
	public Node(int data)
	{
		this.data=data;
		this.next =null;
	}
}
