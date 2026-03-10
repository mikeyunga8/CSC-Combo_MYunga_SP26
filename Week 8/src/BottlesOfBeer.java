
public class BottlesOfBeer {

	public static void main(String[] args) {
		bottleOfBeer(9);
	}

	private static void bottleOfBeer(int btls) {
		if(btls == 0) {
			System.out.println("No bottles of beer on the wall, \n "
					+ "no bottles of beer. Ya can't take one down, \n "
					+ "ya' can't pass it around,  \n"
					+ "cause there are no more bottles of beer on the wall \n");
		}
		else {
			System.out.println("" + btls + " bottles of beer on the wall, \n "
					+ btls + " bottles of beer. Ya take one down, \n "
					+ "ya pass it around,  \n"
					+ (btls - 1) + " bottles of beer on the wall \n");
			System.out.println("********************************************");
			bottleOfBeer(btls - 1);
		}
	}

}
