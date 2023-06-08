package FinalJavaProject;

import java.util.*;

public class Player {

	private List<Card> hand;
	private int score;
	private String name;
	
	public Player(String name) {
		this.name = name;
		hand = new ArrayList<>();
		score = 0;
	}
	
	public void describe() {
		System.out.println(name + "'s hand: ");
		for (Card card : hand) {
		card.describe();
		}
		System.out.println(name + "'s score: " + score);
	}
	
	public Card flip() {
		if (hand.isEmpty()) {
			return null;
		}
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		Card card = deck.draw();
		if (card != null) {
			hand.add(card);
		}
	}
	
	public void incrementScore() {
		score++;
	}
	
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}
}
