package sortingAlgorithms;

import java.util.Scanner;

public class Menu {

	int[] A = { 6, 8, 1, 4, 5, 3, 7, 2 };

	public Menu() {
		display();
	}

	public void display() {
		System.out.println();
		for (int t : A)
			System.out.print(t + " ");
	}

	public void jumbleAgain() {
		int[] A = { 6, 8, 1, 4, 5, 3, 7, 2 };
		this.A = A;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Menu m = new Menu();
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("\n\n1.Display" 
					+ "\n2.Bubble Sort" 
					+ "\n3.Selection Sort" 
					+ "\n4.Insertion Sort"
					+ "\n5.Shell Sort" 
					+ "\n6.Merge Sort" 
					+ "\n7.Quick Sort" 
					+ "\n8.Heap Sort" 
					+ "\n9.Count Sort"
					+ "\n99.Exit" 
					+ "\nChoice:");
			int ch = 1;

			ch = in.nextInt();

			switch (ch) {
			case 1:
				System.out.print("\n------------------------------");
				m.display();
				System.out.print("\n------------------------------");
				break;
			case 2:
				System.out.print("\n------------------------------");
				Bubble.sort(m.A);
				m.display();
				m.jumbleAgain();
				System.out.print("\n------------------------------");
				break;
			case 3:
				System.out.print("\n------------------------------");
				Selection.sort(m.A);
				m.display();
				m.jumbleAgain();
				System.out.print("\n------------------------------");
				break;
			case 4:
				System.out.print("\n------------------------------");
				Insertion.sort(m.A);
				m.display();
				m.jumbleAgain();
				System.out.print("\n------------------------------");
				break;
			case 5:
				System.out.print("\n------------------------------");
				Shell.sort(m.A);
				m.display();
				m.jumbleAgain();
				System.out.print("\n------------------------------");
				break;
			case 6:
				System.out.print("\n------------------------------");
				Merge.sort(m.A);
				m.display();
				m.jumbleAgain();
				System.out.print("\n------------------------------");
				break;
			case 7:
				System.out.print("\n------------------------------");
				Quick.sort(m.A);
				m.display();
				m.jumbleAgain();
				System.out.print("\n------------------------------");
				break;
			case 8:
				System.out.print("\n------------------------------");
				new Heap().sort(m.A);
				m.display();
				m.jumbleAgain();
				System.out.print("\n------------------------------");
				break;
			case 9:
				System.out.print("\n------------------------------");
				new Counting().sort(m.A);
				m.display();
				m.jumbleAgain();
				System.out.print("\n------------------------------");
				break;
			case 99:
				in.close();
				System.out.print("\n-------------- END ----------------");
				System.exit(0);
				break;
			default:
				System.out.print("\nEnter a valid input.");
				System.out.print("\n------------------------------");
			}
		}
	}

}
