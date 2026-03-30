
public class War {

	public static void main(String[] args) {
		Card[] cards = new Card[52];
		buildDeck(cards);
		Card target = new Card(11, 3);
		//System.out.println(cards[25]);
		//printDeck(cards);
		System.out.println(target + " is card " + search(cards, target) + " of the deck.");
		int binIndex = binSearch(cards, target);
		System.out.println(binIndex);
	}

	private static int binSearch(Card[] cards, Card target) {
		int count = 0;
		int low = 0;
		int high = cards.length - 1;
		while (low <= high) {
			count++;
			int mid = (low + high) / 2;
			int comp = cards[mid].compareTo(target);
			if(comp == 0)return mid;
			else if (comp > 0)low = mid + 1;
			else high = mid - 1;
		}
		return 0;
	}

	private static int search(Card[] cards, Card target) {
		for(int i = 0; i < cards.length; i++) {
			if(cards[i].equals(target)) {
				return i;
			}
		}
		
		return -1;
		
	}

	private static void printDeck(Card[] cards) {
		for(Card card : cards) {
			System.out.println(card);
		}
		
	}

	private static void buildDeck(Card[] cards) {
		int index = 0;
		for (int suit = 0; suit < 4; suit++) {
			for (int rank = 1; rank <= 13; rank++) {	
				cards[index] = new Card(rank, suit);
				index++;
			}
		}
		
	}

}
