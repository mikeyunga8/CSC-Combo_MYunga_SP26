
public class Course {
	private String courseNum;
	private int numStudents;
	private int maxStudents;
	private int credits;
	
	public Course() {
		this.courseNum = "";
		this.numStudents = 0;
		this.maxStudents = 0;
		this.credits = 0;
	}
	
	public Course(String course, int numStudents, int maxStudents, int credits) {
		super();
		this.courseNum = course;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.credits = credits;
	}
	public String getCourse() {
		return courseNum;
	}
	public void setCourse(String course) {
		this.courseNum = course;
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
