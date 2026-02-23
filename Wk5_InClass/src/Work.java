import java.util.Scanner;

public class Work {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
/************************************************************************
 * Write a program to calculate the sum of the first 10 natural numbers.*
 *               a. Use a for loop (Call the class SumOfForNumbers)     *
 *                                                                      *
 *               b. Use a while loop (Call the class SumOfWhileNumbers) *
 ***********************************************************************/

		int sum = 0;
		for(int i = 0; i < 10; i++)
		{
			sum += i;
		} 
		System.out.println(sum);
		
		int i = 0;
		int summ = 0;
		while(i < 10 )
		{
			summ += i;
			i++;
		}
		System.out.println(summ);
		

			
		}
		
	}
	
		

