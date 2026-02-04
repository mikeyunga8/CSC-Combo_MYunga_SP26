import java.util.Scanner;

public class Tempconversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double fahren, celsius, kelvin;
		
		System.out.println("What is the temperature in fahrenheit?");
		fahren = input.nextDouble();
		celsius = ((fahren - 32)*5)/9;
		kelvin = fahren + 273.15;
		System.out.printf("Your temperature is %.2f in celsius and %.2f in kelvin" , celsius, kelvin);
		
	}

}
