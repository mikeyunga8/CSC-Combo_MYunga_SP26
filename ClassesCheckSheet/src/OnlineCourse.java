
public class OnlineCourse extends Course {

	public OnlineCourse() {
		super();
	}
	public OnlineCourse(String course, int numStudents, int maxStudents, int credits) {
		super(course, numStudents, maxStudents, credits);
	}

	@Override
	public String toString() {
		return "OnlineCourse " + "\nIn-Person Course\nCourse: " + super.getCourse() + "\n# of Students: " + super.getNumStudents() + "\nMax Seating: " + super.getMaxStudents()
				+ "\nCredits:" + super.getCredits() + "\nRoom #: " + "\nEmail: " + "\nZoom info: ";
	}
	
}
