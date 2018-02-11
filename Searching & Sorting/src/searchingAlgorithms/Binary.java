package searchingAlgorithms;

public class Binary {

	public static void search(int[] A,int n)
	{
		System.out.print("\n"+new Binary().search(A, n,0,A.length-1));
	}
	
	public String search(int[] A,int find,int from,int to)
	{
			while(from<=to)
				{
					int mid = (from+to)/2;
					if(find==A[mid])
						return "\n"+find+" found at "+(mid+1);
					else if(find<A[mid])
						to = mid-1;
					else
						from = mid+1;
				}
	        return "\n"+find+" NOT FOUND";
	}
}
//Recursive Algorithm
/*package searchingAlgorithms;

public class Binary {

	public static void search(int[] A,int n)
	{
		System.out.print("\n"+new Binary().search(A, n,0,A.length-1));
	}
	
	public String search(int[] A,int find,int from,int to)
	{
			int mid = (from+to)/2;

			if(from>to)
				return "\n"+find+" NOT FOUND";
			
			if(find==A[mid])
				return "\n"+find+" found at "+(mid+1);
			else if(find<A[mid])
				return search(A,find,from,mid-1);
			else
				return search(A,find,mid+1,to);
	}
}
*/