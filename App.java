package Week06Project;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card = new Card("Ace", "Spades", 14); 
		//instantiating a card to test code so far 
		card.describe();
		//testing describe method 
		
		Deck deck = new Deck();
		deck.describe();
	}

}
