import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class CSclasses {
	public static MyFileWriter fw = new MyFileWriter("courses.txt");
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MyFileReader reader = new MyFileReader("courses.txt");
		ArrayList<Course> courseList = reader.getList();
		
		Course course;
		String another = "yes";
		File file = fw.getFile();
		while(another.charAt(0) == 'y') {
			System.out.println("What type of course is it? 1 = In-Person, 2 = Real Time Remote, 3 = Full Online 4 = Quit");
			int type = input.nextInt();
			if(type == 4)break;
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
			addToFile(file, course);
			System.out.println("Do you need to enter another?");
			another = input.next();
			another = another.toLowerCase();
		}
		for(Course course1 : courseList) {
			getPrinter(course1);
		}
	}
	public static void addToFile(File file, Course course) {
		if(course instanceof InPersonCourse) {
			fw.appendToFile(file, "IP ");
			InPersonCourse ipcourse = (InPersonCourse) course;
			fw.appendToFile(file, ipcourse.getRoomNum() + " ");
		}
		else if(course instanceof FullRemoteCourse) {
			fw.appendToFile(file, "FR ");
			FullRemoteCourse frcourse = (FullRemoteCourse)course;
			fw.appendToFile(file, frcourse.getEmail() + " ");
		}
		else if(course instanceof RealTimeRemoteCourse) {
			fw.appendToFile(file, "RTR ");
			RealTimeRemoteCourse rtrcourse= (RealTimeRemoteCourse)course;
			fw.appendToFile(file, rtrcourse.getZoomInfo() + " ");
		}
		fw.appendToFile(file, course.getCourse() + " ");
		fw.appendToFile(file, course.getNumStudents() + " ");
		fw.appendToFile(file, course.getMaxStudents() + " ");
		fw.appendToFile(file, course.getCredits() + " ");
	}
	public static void print(Course course) {
		System.out.println(course);
	}
	public static void getPrinter(Course course) {
		System.out.println("Course: " + course.getCourse());
		System.out.println("Number of Students: " + course.getNumStudents());
		System.out.println("Max Students: " + course.getMaxStudents());
		System.out.println("Credits: " + course.getCredits());
		if(course instanceof InPersonCourse) {
			course = (InPersonCourse)course;
		//	System.out.println("\n" + course.getRoomNum);
		}
		else if(course instanceof FullRemoteCourse) {
			course = (FullRemoteCourse)course;
			//System.out.println("\n" + course.getEmail);
		}
		else if(course instanceof RealTimeRemoteCourse) {
			course =(RealTimeRemoteCourse)course;
			//System.out.println("\n" + course.getZoomInfo);
		}
	}

}
