import java.util.Scanner;

public class Primes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to check if its prime. ");
		
		int num = input.nextInt();
		if (isPrime(num))
		{
		System.out.println(num + " is prime.");
		}
		else System.out.println(num + " is not prime.");
	}

	private static boolean isPrime(int num) {
		if (num < 2) return false;
		if (num == 2) return true;
		if (num % 2 == 0) return false;
		for(int i = 3; i <= Math.sqrt(num); i += 2)
		{
			if(num %i == 0)return false;
		}
		return true;
	}

}
