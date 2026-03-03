import java.util.Arrays;
import java.util.Random;

public class bookwork {

	public static void main(String[] args) {
		// TODO Make some arrays
		int[] counts; // declaration
		double[] values;

		counts = new int[4];
		values = new double[4];

		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(a));
		int[] b = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		
		for (int i = 0; i < a.length; i++) {
			a[i] *= a[i];
		}
		for(int i : a)
			System.out.println(i);
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {

		}

		counts[0] = 7;
		counts[1] = counts[0] * 2;
		counts[2]++;
		counts[3] -= 60;

		for (int i : counts)
			System.out.println(i);

		System.out.println(Arrays.toString(a));
		int target = 9;
		int[] arr = randomArray(100);
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
			if((i + 1) % 10 == 0 && i != 0)System.out.println();
		}
	}

	private static int[] randomArray(int i) {
			Random rand = new Random();
			int[] arr = new int[i];
			for (int j = 0; j < i; j++) {
				arr[j] = rand.nextInt(9)+1;//random size ->(high - low)+low
			}
			return arr;
	}

}
