import java.util.Arrays;
import java.util.Random;

public class Deck {
	Card[] cards;
	
	public Deck(int n) {
		this.cards = new Card[n];
	}
	public Deck() {	
		this.cards = new Card[52];
		int index = 0;
		for (int suit = 0; suit < 4; suit++) {
			for (int rank = 1; rank <= 13; rank++) {	
				cards[index] = new Card(rank, suit);
				index++;
			}
		}
	}
	public void shuffle() {
		for(int i = 0; i < this.cards.length; i++) {
			int j = randomInt(i, cards.length - 1);
			swap(i, j);
		}
			 
	}
	
	private static int randomInt(int low, int high) {
		Random random = new Random();
		return low + random.nextInt(high - low + 1);
	}
	
	private void swap(int i, int j) {
		Card temp = this.cards[i];
		this.cards[i] = this.cards[j];
		this.cards[j] = temp;
	}
	
	private int binSearch(Deck cards, Card target) {
		int count = 0;
		int low = 0;
		int high = cards.getCards().length - 1;
		while (low <= high) {
			count++;
			int mid = (low + high) / 2;
			int comp = this.cards[mid].compareTo(target);
			if(comp == 0)return mid;
			else if (comp > 0)low = mid + 1;
			else high = mid - 1;
		}
		return 0;
	}
	
	public Card[] getCards() {
		return this.cards;
	}
	public void printDeck() {
		for(Card card : cards) {
			System.out.println(card);
		}
		
	}
	@Override
	public String toString() {
		return Arrays.toString(this.cards);
	}
}