/**
 * These are my notes for Java Input and Output
 * @author S03121072
 * @date 02/02/2026
 * 
 */
import java.util.Scanner;

public class InpuOutput {

	public static void main(String[] args) {
		//this is my Scanner it is how we get input from the 
		//keyboard in this case
		
	Scanner input = new Scanner (System.in);
		
		
		System.out.println("What is your name?");
		
		String name  = input.next();//next grabs up to the first whitespace
		//like tab, space, or enter
		
		System.out.println("Hello, " + name 
				+ ", how old are you?");
		
		int age = input.nextInt();//nextInt grabs the whole number
		
		System.out.println("Wow " + age 
				+ " is a good age!");
		
		System.out.println("Give me a real number");
		double num = input.nextDouble();//grabs the next real number
		
		System.out.printf("Here is your real number:%.3f\n",num);
		
		System.out.println(name.charAt(0));//charAt() grabs whichever letter is at
		//the index in parenthesis
		
		//this clears the "New line" left in the buffer from the next command
		input.nextLine();
		System.out.print("Enter a sentence: ");
		//grabs any input until the enter key is pressed
		String sentence = input.nextLine();
		System.out.println(sentence);
	}

}
