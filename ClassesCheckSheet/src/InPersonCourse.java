
public class InPersonCourse extends Course {
	private String roomNum;

	public InPersonCourse(String roomNum) {
		super();
		this.roomNum = "";
	}
	public InPersonCourse(String course, int numStudents, int maxStudents, int credits, String roomNum) {
		super(course, numStudents, maxStudents, credits);
		this.roomNum = roomNum;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
	@Override
	public String toString() {
		return "In-Person Course\nCourse: " + super.getCourse() + "\n# of Students: " + super.getNumStudents() + "\nMax Seating: " + super.getMaxStudents()
				+ "\nCredits:" + super.getCredits() + "\nRoom #: " + roomNum + "\nEmail: " + "\nZoom info: ";
	}
	
}
