import java.util.Scanner;

public class work {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = new int[100];
		int count = 0;
		System.out.println("Enter values and enter -1 to end");
		while(true) {
			System.out.println("Enter a number: ");
			int n = input.nextInt();
			if(n == -1) {
				break;
			}
			nums[count] = n;
			count++;
			
		}
		for(int i = count - 1; i >= 0; i--) {
			System.out.println(nums[i]);
		}
		
	}

}
