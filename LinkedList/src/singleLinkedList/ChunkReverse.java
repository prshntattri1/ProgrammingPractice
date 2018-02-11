package singleLinkedList;

public class ChunkReverse {

	public static void iterativechunkReverse(int k,LinkedList l)
	{
		if(k==1||l.head.next==null)
			l.display();
		else
		{
			l.head = reverse(k,l.head);
			Node start = l.head.next;
			Node track = l.head;
			int count = 1;
			while(start!=null&&start.next!=null&&track.next!=null)
			{
				if(count%k==0)
					track.next=reverse(k,start);
				start = start.next;
				track = track.next;
				count++;
			}
			l.display();
		}
	}
	
	public static Node reverse(int k,Node head)
	{
		Node prev = head;
        if(head.next==null)
        	return head;
		for(int i = k-1;i>0&&head.next!=null;--i)
			head = head.next;
		Node next = prev.next;
		Node temp = null;
		prev.next = head.next;
		while(head.next!=next.next)
		{
			temp = next;
			next = next.next;
			temp.next = prev;
			prev = temp;
		}
		head.next = prev;
		return head;
	}
	public static Node reccursivechunkReverse(int k,Node head)
	{
		Node current = head;
		Node next = null;
		Node prev = null;
		
		int count = 0;
		
		while(count<k && current !=null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}
		if(next != null)
			head.next = reccursivechunkReverse(k,next);
		return prev;
	}
}
