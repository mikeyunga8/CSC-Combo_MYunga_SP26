import java.util.Scanner;

public class circleCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double rad;
		System.out.println("Enter a radius");
		rad = input.nextDouble();
		double area = calculateArea(rad);
		double diameter = calculateDiameter(rad);
		double circum = calculateCircum(rad);
		System.out.println("The area of the circle is " + Math.round(area));
		System.out.println("The circumference of the circle is " + Math.round(circum));
		System.out.println("The diameter of the circle is " + Math.round(diameter));
	}

	private static double calculateCircum(double rad) {
		double result = 2 * Math.PI *rad;
		return result;
	}

	private static double calculateDiameter(double rad) {
		double result = 2 * rad;
		return result;
	}

	private static double calculateArea(double rad) {
		double result = Math.PI * rad * rad; 
		return result;
	}

}
