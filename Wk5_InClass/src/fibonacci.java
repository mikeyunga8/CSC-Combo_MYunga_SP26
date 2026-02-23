import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		/**************************************************************************************************************
		 *  Write a program to print Fibonacci series of n terms where n is input by user:  0 1 1 2 3 5 8 13 24 ..... *
		 *                                                                                                            *
		 *               a. Use a for loop (Call the class ForFibonacci)                                              *
		 *                                                                                                            *
		 *               b. Use a while loop (Call the class (WhileFibonacci)                                         *
		 **************************************************************************************************************/
				Scanner input = new Scanner(System.in);
				int num1 = 0;
				int num2 = 1;
			    System.out.println("Which level of the fibonacci do you want to go to?");
				int count = input.nextInt();
				if (count == 1)System.out.println(num1);
				else if (count == 2)System.out.println(num1 + "\n" + num2);
				System.out.println(num1 + "\n" + num2);
				for(int i = 2; i < count; i++)
				{
					int num3 = num1 + num2;
					System.out.println(num3);
					num1 = num2;
					num2 = num3;
					
					
							
				}
				System.out.println("*****************");
				num1 = 0;
				num2 = 1;
				int i = 2;//initializer
				System.out.println(num1 + "\n" + num2);
				while(i < count)//condition
				{
					int num3 = num1 + num2;
					System.out.println(num3);
					num1 = num2;
					num2 = num3;
					i++;//changer
				}
	}
}
