package nBottlesOfBeer;

import java.util.Scanner;

public class work {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the bottles of beer");
		int n = input.nextInt();
		int nBottle = n;
		while (n > 1) {
			System.out.println(n + " bottles of beer on the wall, " + n + " bottles of beer.");
			n--;
			if (n > 1) {
				System.out.println("Take one down and pass it around, " + n + " bottles of beer on the wall.");
			} else
				System.out.println(n + " bottle of beer on the wall, " + n
						+ " bottle of beer. Take one down and pass it around, 0 bottles of beer on the wall");

		}
		System.out.println("0 bottles of beer on the wall, 0 bottles of beer. Go to the store and buy some more, "
				+ nBottle + " bottles of beer on the wall");
	}

}
