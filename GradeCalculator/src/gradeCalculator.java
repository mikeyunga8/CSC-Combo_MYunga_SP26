import java.util.Scanner;

public class gradeCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double grade;
		System.out.println("What is is your grade?");
		grade = input.nextDouble();
		if (grade >= 92)
			System.out.println("You have an A in this class");
		else if (grade >= 89)
			System.out.println("You have an A- in this class");
		else if (grade >= 87)
			System.out.println("You have a B+ in this class");
		else if (grade >= 82)
			System.out.println("You have a B in this class");
		else if (grade >= 79)
			System.out.println("You have a B- in this class");
		else if (grade >= 77)
			System.out.println("You have a C+ in this class");
		else if (grade >= 72)
			System.out.println("You have a C in this class");
		else if (grade >= 69)
			System.out.println("You have a C- in this class");
		else if (grade >= 67)
			System.out.println("You have a D+ in this class");
		else if (grade >= 60)
			System.out.println("You have a D in this class");
		else if (grade < 60)
			System.out.println("You have an F in this class");
			
	}

}
