package searchingAlgorithms;

import java.util.Scanner;
import sortingAlgorithms.Insertion;

public class Menu {
	
	int[] A = {6,8,1,4,5,3,7,2};
	
	public Menu()
	{
		display();
	}
	
	public void display()
	{
		System.out.println();
		for(int t : A)
			System.out.print(t+" ");
	}
	
	public void jumbleAgain() {
		int[] A = { 6, 8, 1, 4, 5, 3, 7, 2 };
		this.A = A;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Menu m = new Menu();
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.print("\n\n1.Display"
					+ "\n2.Linear"
					+ "\n3.Binary"
					+ "\n4.Interpolation Search"
					+ "\n99.Exit"
					+ "\nChoice:");
			int ch = in.nextInt();
			int n;
			switch(ch)
			{
				case 1: System.out.print("\n------------------------------");
						m.display();
						System.out.print("\n------------------------------");
						break;
				case 2:	System.out.print("\nSearch:");
						n = in.nextInt();
						Linear.search(m.A,n);
				        break;
				case 3:	System.out.print("\nSearch(Note-List will be sorted first):");
						n = in.nextInt();
						Insertion.sort(m.A);
						m.display();
						Binary.search(m.A,n);
						m.jumbleAgain();
				        break;
				case 4:	System.out.print("\nSearch(Note-List will be sorted first):");
						n = in.nextInt();
						Insertion.sort(m.A);
						m.display();
						InterpolationSearch.search(m.A,n);
						m.jumbleAgain();
						break;
				case 99:in.close(); 
						System.out.print("\n-------------- END ----------------");
					    System.exit(0);
						break;
				default: System.out.print("\nEnter a valid input.");
						 System.out.print("\n------------------------------");
			}
		}
	}

}
