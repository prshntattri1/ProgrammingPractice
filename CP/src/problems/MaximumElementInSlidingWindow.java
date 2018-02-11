package problems;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class MaximumElementInSlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {12, 1, 78, 90, 57, 89, 56};
		Scanner in = new Scanner(System.in);
		System.out.print("\nWindow Size:");
		int k = in.nextInt();
		new MaximumElementInSlidingWindow().displayMax(A,k);
		in.close();
	}
    
	public void displayMax(int A[] , int k)
	{
		Deque<Integer> q = new LinkedList<Integer>();
		int i;
		for(i =0;i<k;i++)
		{
			while(!q.isEmpty() && A[i]>=A[q.peekLast()])
				q.removeLast();
			q.addLast(i);
		}
		
		for(;i<A.length;i++)
		{
			System.out.print(A[q.peek()]+" ");
			while(!q.isEmpty() && q.peek() <= i-k)
				q.removeFirst();
			while(!q.isEmpty() && A[i]>=A[q.peekLast()])
				q.removeLast();
			q.addLast(i);
		}
		System.out.print(A[q.peek()]+" ");
	}
}
