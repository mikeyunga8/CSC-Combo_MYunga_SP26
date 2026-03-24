import java.awt.Point;
import java.awt.Rectangle;
import java.util.Scanner;
public class Mutables {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Point blank;
		blank = new Point(3, 4);
		Point carBreak = new Point(12, 7);
		int x = blank.x;
		System.out.println(blank.x + ", " + blank.y);
		blank.x = 6;
		
		printPoint(blank);
		double distance = findDistance(carBreak, blank);
		System.out.println(distance);
		
		Rectangle box = new Rectangle(0, 0, 100, 200);
		System.out.println(box);
		
		System.out.println(findCenter(box));
		
		box.translate(-10,  -20);
		System.out.println(findCenter(box));
		blank = null;
		
		System.out.println("Please enter five words, each followed with a return");
		StringBuilder text = new StringBuilder();
		for (int i = 0; i < 5; i++) {
			String line = input.next();
			text.append(line);
			text.append('\n');
		}
		System.out.println("You entered: \n" + text);
		
		
		
		
	}/****************************Methods************************************/
	
	
	private static Point findCenter(Rectangle box) {
		int x = box.x + box.width / 2;
		int y = box.y + box.height / 2;
		return new Point(x, y);
	}

	

	private static double findDistance(Point carBreak, Point blank) {
		int dx = carBreak.x - blank.x;
		int dy = carBreak.y - blank.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	private static void printPoint(Point blank) {
		System.out.println(blank.x + ", " + blank.y);
	}

}
