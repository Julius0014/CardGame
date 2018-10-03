package CardGameWar;

public class Card {
	String suits;
	String WordValue;
	int value;
	public Card(String suit, String value2, int value) {
		this.suits = suit;
		this.WordValue = value2;
		this.value = value;
	}
	@Override
	public String toString() {
		return this.WordValue + " of " + this.suits +this.value;
	}
	
	
}
