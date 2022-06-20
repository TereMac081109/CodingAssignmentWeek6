package Week6CodingAssignment;

public class Player {

	private Hand hand = new Hand();
	private int score;
	private String name;

	
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Hand getHand() {
		return hand;
	}

	public int getScore() {
		return score;
	}

	
	@Override
	public String toString() {
		return name;
	}

	public Card flip() {
		return hand.remove();
		
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
		
	}

	public void incrementScore() {
		score++;
		
	}
	
	

}
