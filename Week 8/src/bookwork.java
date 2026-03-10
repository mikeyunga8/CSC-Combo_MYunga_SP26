import java.util.Scanner;

public class bookwork {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		countdown(3);
		int ans = factorial(5);
		System.out.println(ans);
		System.out.println("How far in the fibonacci do you want to go");
		int lvl = input.nextInt();
		for(int i = 0; i < lvl; i++) {
			System.out.println(fibonacci(i) + ", ");
		}
		System.out.println("What number do you wish to convert to binary");
		lvl = input.nextInt();
		displayBin(lvl);
	}

	private static void displayBin(int lvl) {
		if(lvl > 0) {
			displayBin(lvl / 2);
			System.out.print(lvl % 2);
		}
	}

	private static int fibonacci(int i) {
		if(i == 0) return 0;
		else if(i == 1 || i == 2) return 1;
		return fibonacci(i - 1) + fibonacci(i - 2);
	}

	private static int factorial(int n) {
		if(n == 0) return 1;
		return n * factorial (n - 1);
		
	}

	private static void countdown(int i) {
		if(i == 0) {
			System.out.println("Blast off");
		}
		else {
			System.out.println(i);
			countdown(i - 1);
		}
	}

}
