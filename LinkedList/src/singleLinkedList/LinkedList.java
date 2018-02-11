package singleLinkedList;

import java.util.Scanner;

public class LinkedList {

	Node head;
	public LinkedList()
	{
		head=null;
	}
	
	public void addNodeFront(int val)
	{
		Node newnode = new Node(val);
		if(head==null)
			head = newnode;
		else
		{
			newnode.next = head;
			head = newnode;
		}
	   display();
	}
	public void addNodeEnd(int val)
	{
		Node newnode = new Node(val);
		if(head==null)
			head = newnode;
		else
		{
			Node temp = head;
			while(temp.next!=null)
				   temp = temp.next;
			temp.next=newnode;
		}
		display();
	}
	public void display()
	{
		if(head==null)
			System.out.println("NULL");
		else
		{
			Node temp = head;
			System.out.println();
			while(temp!=null)
			{
				System.out.print(temp.data+"-->");
				temp=temp.next;
			}
			System.out.print("NULL");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l = new LinkedList();
		l.addNodeEnd(1);l.addNodeEnd(2);l.addNodeEnd(3);l.addNodeEnd(4);
		l.addNodeEnd(5);l.addNodeEnd(1);l.addNodeEnd(7);l.addNodeEnd(8);
		l.addNodeEnd(1);
		while(true)
		{
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			System.out.print("\n1.Display"
					+ "\n2.Add At Front"
					+ "\n3.Add at End"
					+ "\n4.Iterative Chunk Reverse"
					+ "\n5.Reccurssive Chunk Reverse"
					+ "\n6.Reverse"
					+ "\n7.Detect Loop"
					+ "\n8.Remove Duplicates From Sorted LL"
					+ "\n9.Remove Duplicates"
					+ "\n10.Sort LL (Merge)"
					+ "\n99.Exit\nChoice:");
			int ch = in.nextInt();
			int val;
			switch(ch)
			{
				case 1:l.display();
					   break;
				case 2:System.out.print("\nEnter a value:");
					   val = in.nextInt();
					   l.addNodeFront(val);
					   break;
				case 3:System.out.print("\nEnter a value:");
				   		val = in.nextInt();
				   		l.addNodeEnd(val);
				   		break;
				case 4: System.out.print("\nChunk size:");
		   				val = in.nextInt();
		   				System.out.print("\n--------------------------------\nBefore:");
		   				l.display();
		   				System.out.print("\nAfter:");
		   				ChunkReverse.iterativechunkReverse(val,l);
		   				System.out.println("\n-------------------------------------");
		   				break;
				case 5: System.out.print("\nChunk size:");
   						val = in.nextInt();
   						System.out.print("\n--------------------------------\nBefore:");
   						l.display();
   						System.out.print("\nAfter:");
   						l.head = ChunkReverse.reccursivechunkReverse(val,l.head);
   						l.display();
   						System.out.println("\n-------------------------------------");
   						break;
				case 6: System.out.print("\n--------------------------------\nBefore:");
						l.display();
						System.out.print("\nAfter:");
						l.head = Reverse.reverse(l.head);
						l.display();
						System.out.println("\n-------------------------------------");
						break;
				case 7: DetectLoop.detectLoop(l.head);
						break;
				case 8: RemoveDuplicatesFromSortedLL.remove(l.head);
						l.display();
						break;
				case 9: RemoveDuplicatesFromLL.remove(l.head);
						l.display();
						break;
				case 10:System.out.print("\n--------------------------------\nBefore:");
						l.display();
						System.out.print("\nAfter:");
						new MergeSort().sort(l.head);
						l.display();
						System.out.println("\n-------------------------------------");
						break;
				case 99: System.exit(0);
				default: System.out.println("Enter valid Input");
			}
		}
	}

}
