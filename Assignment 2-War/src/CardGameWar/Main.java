package CardGameWar;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Deck deck = new Deck();
		ArrayList<Player> PlayerList = new ArrayList<Player>();
		PlayerList.add(new Player("BOB"));
		PlayerList.add(new Player("SUE"));
		deck.createHands(PlayerList);
		System.out.println(PlayerList.get(0).name +" played "+ PlayerList.get(0).play_card().toString());
		System.out.println(PlayerList.get(1).name +" played "+ PlayerList.get(1).play_card().toString());
	}

}
