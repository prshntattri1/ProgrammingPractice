package singleLinkedList;

public class DetectLoop {

	public static void detectLoop(Node head)
	{
		Node slow = head, fast = head;
		boolean found = false;
		while(slow!=null&&fast!=null&&fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast)
			{
				System.out.println("Loop Found");
				found = true;
				break;
			}
		}
	 if(!found)
		 System.out.println("Not Found");
	}
}
