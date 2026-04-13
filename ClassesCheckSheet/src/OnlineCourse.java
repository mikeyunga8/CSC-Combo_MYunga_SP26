
public class OnlineCourse extends Course {

	public OnlineCourse() {
		super();
	}
	public OnlineCourse(String course, int numStudents, int maxStudents, int credits) {
		super(course, numStudents, maxStudents, credits);
	}

	@Override
	public String toString() {
		return "OnlineCourse []";
	}
	
}
