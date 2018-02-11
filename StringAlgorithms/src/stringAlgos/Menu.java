package stringAlgos;

import java.util.Scanner;

public class Menu {

	String originalString;
	String pattern;
	Scanner in = new Scanner(System.in);
	
	public void getOriginalString()
	{
		in.nextLine();
		originalString = in.nextLine();
	}
	
	public void getPattern()
	{
		pattern = in.nextLine();
	}
	
	public void display()
	{
		System.out.print("\nOriginal String-->"+originalString+"\nPattern-->"+pattern);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Menu m = new Menu();
		while(true)
		{
			System.out.print("\n1.Display"
					+ "\n2.Brute Force"
					+ "\n99.Exit"
					+ "\nChoice:");
			int ch = m.in.nextInt();
			switch(ch)
			{
				case 1: m.display();
						break;
				case 2: m.getOriginalString();
						m.getPattern();
						new BruteForce().findSubString(m.originalString,m.pattern);
						break;
				case 99:m.in.close();
						System.exit(0);
				default:System.out.print("\n Invalid Input");
			}
		}
	}

}
