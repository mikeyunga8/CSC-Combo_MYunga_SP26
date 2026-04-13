import java.util.ArrayList;

public class CSclasses {

	public static void main(String[] args) {
		
		Course inPerson = new InPersonCourse("comp sci 1", 8, 20, 5, "BP119");
		Course real = new RealTimeRemoteCourse("comp sci 1", 8, 20, 5, "zoom.com/smellypoop");
		Course remote = new FullRemoteCourse("comp sci 1", 8, 20, 5, "smellypoop@gmail.com");
		System.out.println(inPerson);
		System.out.println();
		System.out.println(real);
		System.out.println();
		System.out.println(remote);
	}

}
