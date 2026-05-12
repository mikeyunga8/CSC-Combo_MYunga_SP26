public class Card {

	private int value;
	private int color;

	public Card(int value, int color) {
		this.value = value;
		this.color = color;
	}

	public int getValue() {
		return value;
	}

	public int getColor() {
		return color;
	}

	public boolean canPlay(Card top) {
		return this.color == top.color || this.value == top.value || this.color == 4;
	}

	public String toString() {

		String[] colors = { "Red", "Yellow", "Green", "Blue", "Wild" };
		String[] values = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Skip", "Reverse", "Draw Two", "Wild",
				"Wild Draw Four" };

		return values[value] + " of " + colors[color];
	}
}