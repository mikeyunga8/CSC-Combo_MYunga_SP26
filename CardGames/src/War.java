
public class War {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		deck.printDeck();
	}

	

	private static int search(Card[] cards, Card target) {
		for(int i = 0; i < cards.length; i++) {
			if(cards[i].equals(target)) {
				return i;
			}
		}
		
		return -1;
		
	}

	

	

}
