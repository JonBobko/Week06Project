package Week06Project;

public class App {

	public static void main(String[] args) {
		//Card card = new Card("Ace", "Spades", 14); 
		//instantiating a card to test code so far 
		//card.describe();
		//testing describe method 
		
		Deck deck = new Deck();
		deck.describe();
		
		Player player = new Player();
		Player player2 = new Player();
		
		deck.shuffle();
		deck.describe();

		for(int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player.getHand().add(deck.draw());
			}
			else {
				player2.getHand().add(deck.draw());
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.println("Round = " + (i + 1));
		Card p1flip = player.flip();
		Card p2flip = player2.flip();
		System.out.print("Player 1 Card is: ");
		p1flip.describe();
		System.out.print("Player 2 Card is: ");
		p2flip.describe();
		if (p1flip.getValue() > p2flip.getValue()) {
			player.incrementScore();
			System.out.println("Player1 recieved a point\n");
		}else if(p1flip.getValue() < p2flip.getValue()) {
			player2.incrementScore();
			System.out.println("Player2 recieved a point\n");
		}else if(p1flip.getValue() == p2flip.getValue()) {
			System.out.println("No point was awarded\n");
		}
		}
		
		if (player.score > player2.score) {
			System.out.println("Player 1 Score: " + player.score + " " + "Player 2 Score: " + player2.score + 
					"\nPlayer 1 is the winner!");
		}else if(player.score < player2.score) {
			System.out.println("Player 1 Score: " + player.score + " " + "Player 2 Score: " + player2.score + 
					"\nPlayer 2 is the winner!");
		}else {
			System.out.println("Player 1 Score: " + player.score + " " + "Player 2 Score: " + player2.score + 
					"\nIt's a tie!");
		}
		
		
	}

}
