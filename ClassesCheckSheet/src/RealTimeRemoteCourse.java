
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
	
}
