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
	}
	public static void CreateDeck() {
		for(String suit: suits) {
			int i = 2;
			for(String value : values) {
				Cards.add(new Card(suit,value,i++));
			}
		}
	}
	public void createHands(ArrayList<Player> players) {
		int num_card_to_add = Deck.Cards.size()/players.size();
		int cardsAdded;
		for(Player player: players) {
			cardsAdded = 0;
			for(int i =0;i < Cards.size();i++)
				if( cardsAdded == num_card_to_add) {
					break;
				}
				player.myHand.add_card_to_Hand(Cards.remove(0));
			}
		}
		
	}

