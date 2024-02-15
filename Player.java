package Week06Project;

import java.util.ArrayList;
import java.util.List;

public class Player {
	int score;
	
	public Player() {
		int score = 0;
		
		// TODO Auto-generated constructor stub
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	List<Card> hand = new ArrayList<>(); 
	
	
	
	
	


public void describeHand () {
	for (Card : hand) {
		card.describe();
	}
	}
	
public List<Card> flip(hand) {
	return hand.get(0);
	
}

public List<Card> draw(hand) {
	return hand.draw();
}
public int incrementScore () {
	return score += 1;
}

	

}
