import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		float val1, val2, val3;
		Scanner input = new Scanner(System.in);
		/************************************************************************
		 * Call the script MessagePrinter. Write a program to print the message *
		 * “This is my first programming test” to the screen                    *
		 ************************************************************************/
		System.out.println("This is my first programming test");
		
		/********************************************************************
		 * Call the script BeverageSelector, The customer (user) will enter * 
		 * a number to choose one of three beverages. The choices are:      *
		 * (1) Water, (2) Coke, (3) Coffee. Have the user enter the number  *
		 * and then output the name of the beverage they picked.            *                                                                      15 pts
		 ********************************************************************/
		System.out.println("Enter a number between 1 and 3 for your choice of beverage");
		int num = input.nextInt();
		if (num == 1)
		{
			System.out.println("Water");
		}
		else if (num == 2)
		{
			System.out.println("Coke");
		}
		else System.out.println("Coffee");
		
		
		/****************************************************************************
		 * Call the script Divider. Have the user enter two values (one at a time). *
		 * Divide the first number by the second number. Print the output “The      *
		 * answer is answer when you divide input1 by input2”. The input numbers    *
		 * will be floats. The answer will be a float. You should refuse to do the  *
		 * operation if the second number is 0. All the numbers input1, input2 and  *
		 * answer should have only two decimal places when printed in the message.  *
		 ****************************************************************************/
		System.out.println("Enter a value");
		val1 = input.nextInt();
		System.out.println("Enter a second value and I will divide both numbers");
		val2 = input.nextInt();
		if (val2 != 0)
		{
			val3 = val1 / val2;
			System.out.printf("%.2f\n", val3);
		}
		
		/*****************************************************************************
		 * Call the script Accumulator. The program will keep prompting the user for *
		 * numbers and when the user inputs a 0 will print out the sum of all the    *
		 * numbers and stop. Use a while loop.                                       *
		 *****************************************************************************/
		int sum = 0;
		System.out.println("Enter a number");
		int num1 = input.nextInt();
		while (num1 != 0)
		{
			sum += num1;
			System.out.println("Enter another number");
			num1 = input.nextInt();
		}
		System.out.println(sum);
			
	}
}


