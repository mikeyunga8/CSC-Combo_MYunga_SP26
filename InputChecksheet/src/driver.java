import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		char letter;
		
		//System.out.println("What's your favorite foods?");
		//String word = input.nextLine(); //changing between next and nextline
		//changes how much is grabbed from the input, from one word to multiple
		
		//System.out.println("How much " + word + " could you eat in one go?");
		//int intNum = input.nextInt();
		
		//System.out.println("Wow, " + intNum + " is a lot!");
		//System.out.println("Enter a real number");
		//float realNum = input.nextFloat();
		//System.out.println(realNum);
		//System.out.println("Enter the money under ur pillow ");
		
		//double biggerRealNum = input.nextDouble();
		//System.out.printf("$%.2f\n", biggerRealNum);
		
		//System.out.println("Enter a character");
		//letter = input.next().charAt(0);
		//System.out.println(letter);
		float realNum = 987654321.987654321f;
		realNum = realNum + realNum;
		System.out.println("float");
		System.out.printf("%.9f\n", realNum);
		System.out.printf("%.2f\n", realNum);

		
		double biggerRealNum = 9897654321.987654321;
		biggerRealNum = biggerRealNum + biggerRealNum;
		System.out.println("double");
		System.out.printf("%.9f\n", biggerRealNum);
		System.out.printf("%.2f\n", biggerRealNum);
		

		
	}

}
