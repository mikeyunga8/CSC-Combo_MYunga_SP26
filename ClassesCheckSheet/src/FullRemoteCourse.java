
public class FullRemoteCourse extends Course {
	private String email;

	public FullRemoteCourse(String email) {
		super();
		this.email = "";
	}
	public FullRemoteCourse(String course, int numStudents, int maxStudents, int credits, String email) {
		super(course, numStudents, maxStudents, credits);
		this.email = email;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "In-Person Course\nCourse: " + super.getCourse() + "\n# of Students: " + super.getNumStudents() + "\nMax Seating: " + super.getMaxStudents()
				+ "\nCredits:" + super.getCredits() + "\nRoom #: " + "\nEmail: " + email + "\nZoom info: ";	}
	
}
