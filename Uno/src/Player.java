import java.util.ArrayList;

public class Player {

	private String name;
	private ArrayList<Card> hand;

	public Player(String name) {
		this.name = name;
		this.hand = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void draw(Card c) {
		hand.add(c);
	}

	public Card playCard(int index) {
		return hand.remove(index);
	}

	public Card getCard(int index) {
		return hand.get(index);
	}

	public int getHandSize() {
		return hand.size();
	}

	public void showHand() {

		for (int i = 0; i < hand.size(); i++) {
			System.out.println(i + ": " + hand.get(i));
		}
	}
}