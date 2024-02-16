package Week06Project;

import java.util.ArrayList;
import java.util.List;

public class Player {
	int score;
	List <Card> hand = new ArrayList<>();
	
	
	public Player() {
		int score = 0;
		
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	
	


public void describeHand () {
	for (Card card : hand) {
		card.describe();
	}
	}
	
public Card flip() {
	return hand.remove(0);
}

public Card draw() {
	return hand.remove(0);
}
public List<Card> getHand() {
	return hand;
}
public void setHand(List<Card> hand) {
	this.hand = hand;
}
public int incrementScore () {
	return score += 1;
}

	

}
