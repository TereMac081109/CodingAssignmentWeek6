package Week6CodingAssignment;

public class Card {
	private String value;
	private String suit;
	private int rank;
	private String name;
	
	
    public Card(String value, String suit, int rank) {

		this.value = value;
		this.suit = suit;
		this.rank = rank;

	}

	@Override
	public String toString() {
		return value + " of " + suit ;
	}


	public String getName() {
		return name;
	}
    
	public void describe (){
		System.out.println(value + " of " + suit);
	}

	public int getRank() {
		return rank;
	}

}
