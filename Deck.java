package FinalJavaProject;

import java.util.*;

public class Deck {

	private static List<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		cards = new ArrayList<>();
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for (String suit : suits) {
			for (int i = 0; i < names.length; i++) {
				String cardName = names[i] + " of " + suit;
				int cardValue = i + 1; //This assumes Two is 2 and Ace is 14 etc.
				Card card = new Card(cardValue, cardName);
				cards.add(card);
			}
		}
	}
	
	public void shuffle() {
		for (Card card : cards) {
			try {
				Collections.shuffle(cards);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public Card draw() {
		if (cards.isEmpty()) {
			return null;
		}
		return cards.remove(0);
	}
}
