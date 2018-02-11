package singleLinkedList;

public class Reverse {

	public static Node reverse(Node head)
	{
		Node current = head;
		if(head==null || head.next==null)
			return head;
		Node prev = null;
		Node next = null;
		while(current!=null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
}
