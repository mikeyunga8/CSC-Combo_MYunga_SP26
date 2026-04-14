
public class RealTimeRemoteCourse extends Course {
	private String zoomInfo;

	public RealTimeRemoteCourse(String zoomInfo) {
		super();
		this.zoomInfo = "";
	}
	
	public RealTimeRemoteCourse(String course, int numStudents, int maxStudents, int credits, String zoomInfo) {
		super(course, numStudents, maxStudents, credits);
		this.zoomInfo = zoomInfo;
	}
	public String getZoomInfo() {
		return zoomInfo;
	}

	public void setZoomInfo(String zoomInfo) {
		this.zoomInfo = zoomInfo;
	}
	@Override
	public String toString() {
		return "In-Person Course\nCourse: " + super.getCourse() + "\n# of Students: " + super.getNumStudents() + "\nMax Seating: " + super.getMaxStudents()
				+ "\nCredits:" + super.getCredits() + "\nRoom #: " + "\nEmail: " + "\nZoom info: " + zoomInfo;

	}
}
