package FinalJavaProject;

public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		deck.shuffle();
		
		//Deal cards
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
		//Flip cards and compare - display updated score
		for (int i = 0; i < 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			System.out.println("Player 1's card: " + card1.getName());
			System.out.println("Player 2's card: " + card2.getName());
			
			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore();
				System.out.println("Player 1 wins this round!");
			} else if (card1.getValue() < card2.getValue()) {
				player2.incrementScore();
				System.out.println("Player 2 wins this round!");
			} else {
				System.out.println("It's a draw!");
			}
			
			System.out.println("\nScore: \nPlayer 1: " + player1.getScore() + " \nPlayer 2: " + player2.getScore());			
			System.out.println();
		}
		
		
		//Results
		System.out.println("Final Score: ");
		System.out.println("Player 1: " + player1.getScore());
		System.out.println("Player 2: " + player2.getScore());
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 wins!");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("Player 2 wins!");
		} else {
			System.out.println("The game is a draw!");
		}

	}
}
