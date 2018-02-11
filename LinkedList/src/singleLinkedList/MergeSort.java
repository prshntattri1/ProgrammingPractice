package singleLinkedList;

public class MergeSort {

	public Node sort(Node head)
	{
		if(head == null || head.next == null)
			return head;
		Node mid = findMiddle(head);
		Node nextOfMid = mid.next;
		
		mid.next = null;
		Node left = sort(head);
		Node right = sort(nextOfMid);
		head = sortedMerge(left,right);
		return head;
	}
	public Node findMiddle(Node head)
	{
		if(head == null)
			return head;
		Node fastptr = head.next;
		Node slowptr = head;
		while(fastptr!=null)
		{
			fastptr = fastptr.next;
			if(fastptr!=null)
			{
				fastptr = fastptr.next;
				slowptr = slowptr.next;
			}
		}
		return slowptr;
	}
	
	public Node sortedMerge(Node left,Node right)
	{
		Node dummy = null;
		if(left == null)
			return right;
		if(right == null)
			return left;
		if(left.data<=right.data)
		{
			dummy = left;
			dummy.next = sortedMerge(left.next,right);
		}
		else
		{
			dummy = right;
			dummy.next = sortedMerge(left,right.next);
		}
		return dummy;
	}
}              