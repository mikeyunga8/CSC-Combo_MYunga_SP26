
public class MethodsDriver {
	
	
	public static void threeLine()
	{
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		threeLine();
		System.out.println("World");
		String str = "Print this again.";
		printTwice(str);
		int hour = 9;
		int minute = 55;
		printTime(hour, minute);
		System.out.println("\n" + hour);//this isn't affected by printTime
		double root = Math.sqrt(17.0);
		double angle = 1.5;
		double height = Math.sin(angle);
		System.out.println(root + "\n" + angle + "\n" + height);
		
		double radius = 20;
		double area = calculateArea(radius);
		System.out.println(Math.round(area));
	}

	private static double calculateArea(double radius) {
		double result = Math.PI * radius * radius;
		return result;
	}

	private static void printTime(int hour, int minute) {
		hour += 2;
		minute += 4;
		System.out.print(hour);
		System.out.print(":");
		System.out.println(minute);
		
	}

	private static void printTwice(String s) {
		System.out.println(s);
		System.out.println(s);
	}

}
