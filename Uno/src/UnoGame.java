import java.util.Scanner;

public class UnoGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Deck deck = new Deck();
        deck.shuffle();

        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");

        for (int i = 0; i < 7; i++) {
            p1.draw(deck.drawCard());
            p2.draw(deck.drawCard());
        }

        Card topCard = deck.drawCard();
        int currentColor = topCard.getColor();

        int turn = 1;
        boolean skipNext = false;

        while (true) {

            Player current = (turn == 1) ? p1 : p2;

            System.out.println("\n----------------------");
            System.out.println(current.getName() + "'s turn");
            System.out.println("Top card: " + topCard);

            current.showHand();

            boolean played = false;

            while (!played) {

                System.out.print("Pick a card number (or -1 to draw): ");
                int choice = input.nextInt();

                if (choice == -1) {

                    if (deck.isEmpty()) {
                        System.out.println("Deck empty!");
                        continue;
                    }

                    Card drawn = deck.drawCard();
                    current.draw(drawn);

                    System.out.println("You drew: " + drawn);

                    played = true;
                    break;
                }

                if (choice < 0 || choice >= current.getHandSize()) {
                    System.out.println("Invalid choice.");
                    continue;
                }

                Card selected = current.getCard(choice);
                Card fakeTop = new Card(topCard.getValue(), currentColor);

                if (selected.canPlay(fakeTop)) {

                    topCard = current.playCard(choice);

                    if (topCard.getColor() != 4) {
                        currentColor = topCard.getColor();
                    }

                    System.out.println("Played: " + topCard);

                    played = true;

                    if (topCard.getValue() == 10) {
                        System.out.println("Skip!");
                        skipNext = true;
                    }

                    else if (topCard.getValue() == 11) {
                        System.out.println("Reverse!");
                    }

                    else if (topCard.getValue() == 12) {

                        System.out.println("Draw Two!");

                        Player other = (turn == 1) ? p2 : p1;

                        other.draw(deck.drawCard());
                        other.draw(deck.drawCard());
                    }

                    else if (topCard.getValue() == 13 || topCard.getValue() == 14) {

                        System.out.println("Choose color: 0 Red, 1 Yellow, 2 Green, 3 Blue");

                        int newColor = input.nextInt();

                        while (newColor < 0 || newColor > 3) {
                            System.out.println("Invalid color. Try again:");
                            newColor = input.nextInt();
                        }

                        currentColor = newColor;

                        if (topCard.getValue() == 14) {

                            System.out.println("Wild Draw Four!");

                            Player other = (turn == 1) ? p2 : p1;

                            for (int i = 0; i < 4; i++) {
                                other.draw(deck.drawCard());
                            }
                        }
                    }
                }

                else {
                    System.out.println("You can't play that card.");
                }
            }

            if (current.getHandSize() == 0) {
                System.out.println(current.getName() + " wins!");
                break;
            }

            if (skipNext) {
                skipNext = false;
            } else {
                turn = (turn == 1) ? 2 : 1;
            }
        }

        input.close();
    }
}