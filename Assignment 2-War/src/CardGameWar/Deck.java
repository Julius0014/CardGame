package CardGameWar;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	static String[] suits = {"CLUBS","DIAMONDS","SPADES","HEARTS"};
	static String[] values = {"TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","ACE","JACK","QUEEN","KING"};
	static ArrayList<Card> Cards = new ArrayList<Card>();
	
	
	
	
	public Deck() {
		CreateDeck();
		shuffle();
		
	}
	public static void shuffle() {
		Collections.shuffle(Cards);
		for(Card s: Cards) {
			System.out.println(s.toString());
		}
	}
	public static void CreateDeck() {
		
		for(String suit: suits) {
			int i = 2;
			for(String value : values) {
				Cards.add(new Card(suit,value,i++));
			
			}
		}
	}
}
