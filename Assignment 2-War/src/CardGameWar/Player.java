package CardGameWar;


public class Player {
	String name;
	int score = 0;
	Hand myHand = new Hand();
	Player(String name){
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public Card play_card() {
		
		return myHand.Play_A_Card();
		
	}
	
}
