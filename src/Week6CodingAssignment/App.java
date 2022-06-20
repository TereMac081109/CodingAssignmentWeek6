package Week6CodingAssignment;

public class App {
	
	public static void main(String[] args) {
		new App().run();

	}
	
	private void run() {

		Player player1 = new Player ("Tere");
		Player player2 = new Player ("Emma");
		
		Deck deck = new Deck();
		deck.shuffle();
		
		deal(deck, player1, player2);
		play(player1, player2);
		declareWinner(player1, player2);
		
	}	

	private void declareWinner(Player player1, Player player2) {
		if (player1.getScore() > player2.getScore()) {
			System.out.println("The winner is " + player1 + " with a score of " + player1.getScore());
		}
		else if (player2.getScore() > player1.getScore()) {
			System.out.println("The winner is "+ player2 + " with a score of " + player2.getScore());
		}
		else {
			System.out.println("It's a draw with both players having a score of " + player1.getScore() + ".");
		}
		
	}

	private void play(Player player1, Player player2) {
		int numTurns = player1.getHand().size();
		
		for (int turn = 0; turn < numTurns; turn++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			if (card1.getRank() > card2.getRank()) {
				player1.incrementScore();
			}
			else if (card2.getRank() > card1.getRank()) {
				player2.incrementScore();
			}
		}
		
	}

	private void deal(Deck deck, Player player1, Player player2) {

		int size = deck.size();
		
		for (int index = 0; index < size; index++) {
			if (index % 2 == 0) {
				player1.draw(deck);
			}
			else {
				player2.draw(deck);
			}
		}
		
	}

}
