import java.util.ArrayList;
import java.util.Scanner;

public class CSclasses {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Course> courseList = new ArrayList<>();
		Course course;
		String another = "yes";
		while(another.charAt(0) == 'y') {
		System.out.println("What type of course is it? 1 = In-Person, 2 = Real Time Remote, 3 = Full Online");
		int type = input.nextInt();
		System.out.println("What is the course number?");
		String courseNum = input.next();
		System.out.println("How many students are already in this class");
		int numStudents = input.nextInt();
		System.out.println("What is the maximum number of students");
		int maxStudents = input.nextInt();
		System.out.println("How many credits?");
		int credits = input.nextInt();
		if(type == 1) {
			System.out.println("What is the room number");
			String roomNum = input.next();
			course = new InPersonCourse(courseNum, numStudents, maxStudents, credits, roomNum);
		}
		else if(type == 2) {
			System.out.println("What is the Zoom Info?");
			String zoomInfo = input.next();
			course = new InPersonCourse(courseNum, numStudents, maxStudents, credits, zoomInfo);
		}
		else {
			System.out.println("What is the email");
			String email = input.next();
			course = new FullRemoteCourse(courseNum, numStudents, maxStudents, credits, email);
		}
		courseList.add(course);
		System.out.println("Do you need to enter another?");
		another = input.next();
		another = another.toLowerCase();
		}
	}

}
