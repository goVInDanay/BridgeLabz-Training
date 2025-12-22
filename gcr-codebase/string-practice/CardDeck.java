import java.util.*;
public class CardDeck {
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cards = sc.nextInt();
        String[][] result = distributeCards(deck, players, cards);
        if (result == null) {
            System.out.println("Cannot distribute cards!");
        } else {
            display(result);
        }
	}
    public static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for(String suit : suits) {
            for(String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for(int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }
    public static String[][] distributeCards(String[] deck, int players, int cards) {
        if(players * cards > deck.length) {
            return null;
        }
        String[][] data = new String[players][cards];
        int idx = 0;
        for(int i = 0; i < players; i++) {
            for(int j = 0; j < cards; j++) {
                data[i][j] = deck[idx++];
            }
        }
        return data;
    }
    public static void display(String[][] data) {
        for(int i = 0; i < data.length; i++) {
            System.out.println("Player " + (i + 1) + " : ");
            for(String s : data[i]) {
                System.out.println(s);
            }
            System.out.println();
        }
    }

}
