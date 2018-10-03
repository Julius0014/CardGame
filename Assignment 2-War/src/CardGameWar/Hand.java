package CardGameWar;

import java.util.ArrayList;

public class Hand {
	ArrayList<Card> myCards = new ArrayList<Card>();

	public void add_card_to_Hand(Card c) {
		myCards.add(c);
	}
	public Card Play_A_Card() {
		// TODO Auto-generated method stub
		return myCards.remove(0);
	}
	
}
