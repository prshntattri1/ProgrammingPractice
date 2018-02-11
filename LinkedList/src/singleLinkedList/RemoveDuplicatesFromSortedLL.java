package singleLinkedList;

public class RemoveDuplicatesFromSortedLL {

	public static void remove(Node head)
	{
		Node current = head;
		Node next2 = null;
		while(current!=null&&current.next!=null)
		{
			if(current.data == current.next.data)
			{
				next2 = current.next.next;
				current.next = next2;
			}
			else
				current = current.next;
		}
	}
}
