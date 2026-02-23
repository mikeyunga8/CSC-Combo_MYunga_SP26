import java.util.Scanner;

public class rtTriangle {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num = getUserNum();
		System.out.println("Symbols to print: ");
		char symb = input.next().charAt(0);
		buildRtTriangle(num);
		buildEqTriangle(num, symb);
	}
	private static void buildEqTriangle(int num, char symb) {
		for (int i = 1; i <= num; i++) {
			for(int k = i; k < num; k++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(symb + " ");
			}
			System.out.println();
		}
		}		

	private static void buildRtTriangle(int num) {
		for (int i = 1; i <= num; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}		
	}

	private static int getUserNum() {
		System.out.println("How many floors will your triangle be?");
		int num = input.nextInt();
		return num;
	}

}
