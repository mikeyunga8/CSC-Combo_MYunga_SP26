
public class Course {
	String course;
	int numStudents;
	int maxStudents;
	int credits;
	
	public Course() {
		this.course = "";
		this.numStudents = 0;
		this.maxStudents = 0;
		this.credits = 0;
	}
	
	public Course(String course, int numStudents, int maxStudents, int credits) {
		super();
		this.course = course;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.credits = credits;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getNumStudents() {
		return numStudents;
	}
	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}
	public int getMaxStudents() {
		return maxStudents;
	}
	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}


	
	
}
