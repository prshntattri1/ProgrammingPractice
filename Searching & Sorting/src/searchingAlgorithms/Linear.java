package searchingAlgorithms;

public class Linear {

	public static void search(int[] A,int n)
	{
		boolean flag = false;
		for(int i =0;i<A.length;i++)
		{
			if(A[i]==n)
			{
				System.out.print("\n"+n+" found at "+(i+1));
				flag = true;
				break;
			}
		}
		if(!flag)
			System.out.print("\n"+n+" NOT FOUND");
	}
}
