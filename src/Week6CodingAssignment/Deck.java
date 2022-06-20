package Week6CodingAssignment;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


@SuppressWarnings("serial")
public class Deck extends LinkedList<Card> {
	private final List<String> suits = List.of("Hearts","Spade","Clubs","Diamond");

	private final List<String> values = List.of("Two","Three","Four","Five","Six","Seven",
			"Eight","Nine","Ten","Jack","Queen","King","Ace");
	
	
	public Deck () {
		for (int valuePos = 0; valuePos < values.size(); valuePos++) {
			int rank = valuePos + 2;
			String value = values.get(valuePos);
			
			for (String suit: suits) {
				add(new Card(value, suit, rank));
			}
		}	
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
	
		StringBuilder builder = new StringBuilder();
		
		for (Card card : this) {
			builder.append(card).append(System.lineSeparator());
		}
		
		return builder.toString();
	}
	
	public void shuffle () {
		Collections.shuffle(this);
	}


	public Card draw() {
		// TODO Auto-generated method stub
		return (this.remove());
	}
	
}
