package singleLinkedList;

public class RemoveDuplicatesFromLL {

	public static void remove(Node head)
	{
		Node ptr1 = head,ptr2 = null;
		while(ptr1!=null&&ptr1.next!=null)
		{
			ptr2 = ptr1;
			while(ptr2!=null&&ptr2.next!=null)
			{
				if(ptr1.data == ptr2.next.data)
					ptr2.next = ptr2.next.next;				
				else
					ptr2 = ptr2.next;
			}
			ptr1 = ptr1.next;
		}
	}
}
