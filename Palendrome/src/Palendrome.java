import java.util.Scanner;

public class Palendrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence in CamelCase with no spaces and I will tell you if it's a palendrome.");
		String words = input.next();
		System.out.println(isPalendrome(words));
	}

	private static boolean isPalendrome(String words) {
		words = words.toLowerCase();
		
		for (int i = 0; i < words.length(); i++) {
			if(words.charAt(i) != words.charAt(words.length()-(i+1)))
			{
				return false;
			}
		}
		return true;
	}

}
