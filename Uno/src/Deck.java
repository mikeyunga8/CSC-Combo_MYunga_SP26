import java.util.Random;

public class Deck {

    Card[] cards;
    int top;

    public Deck() {

        cards = new Card[108];
        top = 0;

        int index = 0;

        for (int color = 0; color < 4; color++) {
            cards[index++] = new Card(0, color);

            for (int value = 1; value <= 12; value++) {

                cards[index++] = new Card(value, color);
                cards[index++] = new Card(value, color);
            }
        }

        for (int i = 0; i < 4; i++) {
            cards[index++] = new Card(13, 4);
            cards[index++] = new Card(14, 4);
        }
    }

    public void shuffle() {

        Random rand = new Random();

        for (int i = cards.length - 1; i > 0; i--) {

            int j = rand.nextInt(i + 1);

            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }

        top = 0;
    }

    public Card drawCard() {
        return cards[top++];
    }

    public boolean isEmpty() {
        return top >= cards.length;
    }
}