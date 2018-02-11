package searchingAlgorithms;

public class InterpolationSearch {

	public static void search(int[] A,int n)
	{
		System.out.print("\n"+new InterpolationSearch().search(A, n,0,A.length-1));
	}
	
	public String search(int[] A,int find,int from,int to)
	{
			while(from<=to && find>=A[from] && find<=A[to])
				{
					int pos = (int) (from + (((double)(to-from)/(A[to]-A[from]))*(find-A[from])));
					if(find==A[pos])
						return "\n"+find+" found at "+(pos+1);
					else if(find<A[pos])
						to = pos-1;
					else
						from = pos+1;
				}
	        return "\n"+find+" NOT FOUND";
	}
}
